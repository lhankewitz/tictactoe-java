/**
 * Class representing the grid.
 *
 * */
public class Grid {
    private static final char REG_EXP_PLAYER_CODE = 'p';
    private char[] grid = "         ".toCharArray();

    public void setPlayer(final int stoneNumber, final char player) {
        if(grid[stoneNumber] != ' ') throw new RuntimeException("Stone already set");
        grid[stoneNumber] = player;
    }


    public void setGrid(final String grid) {
        this.grid = grid.toCharArray();
    }

    public String getGrid() {
        return String.valueOf(grid);
    }

    public boolean matchTopRow(final char player) {
        return getGrid().matches("p{3}.{3}.{3}".replace(REG_EXP_PLAYER_CODE, player));
    }

    public boolean matchMiddleRow(final char player) {
        return getGrid().matches(".{3}p{3}.{3}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchBottomRow(final char player) {
        return getGrid().matches(".{3}.{3}p{3}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchLeftColumn(final char player) {
        return getGrid().matches("p.{2}p.{2}p.{2}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchMiddleColumn(final char player) {
        return getGrid().matches(".p.{2}p.{2}p.".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchRightColumn(final char player) {
        return getGrid().matches(".{2}p.{2}p.{2}p".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchTopRight2BottomLeft(final char player) {
        return getGrid().matches(".{2}p.p.p.{2}".replace(REG_EXP_PLAYER_CODE, player));
    }

    boolean matchTopLeft2BottomRight(final char player) {
        return getGrid().matches("p.{3}p.{3}p".replace(REG_EXP_PLAYER_CODE, player));
    }

    public boolean isFull() {
        return !getGrid().contains(" ");
    }
}