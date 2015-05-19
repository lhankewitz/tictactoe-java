public class TicTacToe {
    static final char REG_EXP_PLAYER_CODE = 'p';
    static final char PLAYER_TWO = 'o';
    static final char PLAYER_ONE = 'x';

    private char[] grid = "         ".toCharArray();

    public TicTacToe() {
    }

    public void setPlayer(final int stoneNumber, final char player) {
        grid[stoneNumber] = player;
    }

    public String getGrid() {
        return String.valueOf(grid);
    }

    public char getWinner(final String grid) {
        if (isWinner(grid, PLAYER_TWO)) return PLAYER_TWO;
        else if (isWinner(grid, PLAYER_ONE)) return PLAYER_ONE;
        else return '~';
    }

    private boolean isWinner(final String grid, final char player) {
        return matchLeftColumn(grid, player)
                || matchMiddleColumn(grid, player)
                || matchRightColumn(grid, player)
                || matchTopRow(grid, player)
                || matchMiddleRow(grid, player)
                || matchBottomRow(grid, player)
                || matchTopLeft2BottomRight(grid, player)
                || matchTopRight2BottomLeft(grid, player);
    }

    boolean matchTopRow(final String grid, final char player) {
        return grid.matches("p{3}.{3}.{3}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchMiddleRow(final String grid, final char player) {
        return grid.matches(".{3}p{3}.{3}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchBottomRow(final String grid, final char player) {
        return grid.matches(".{3}.{3}p{3}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchLeftColumn(final String grid, final char player) {
        return grid.matches("p.{2}p.{2}p.{2}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchMiddleColumn(final String grid, final char player) {
        return grid.matches(".p.{2}p.{2}p.".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchRightColumn(final String grid, final char player) {
        return grid.matches(".{2}p.{2}p.{2}p".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchTopRight2BottomLeft(final String grid, final char player) {
        return grid.matches(".{2}p.p.p.{2}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchTopLeft2BottomRight(final String grid, final char player) {
        return grid.matches("p.{3}p.{3}p".replace(REG_EXP_PLAYER_CODE, player));
    }
}