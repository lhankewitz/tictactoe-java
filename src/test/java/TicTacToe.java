public class TicTacToe {
    static final char REG_EXP_PLAYER_CODE = 'p';
    static final char PLAYER_TWO = 'o';
    static final char PLAYER_ONE = 'x';
    private static final char MATCH = '~';
    private Grid grid = new Grid();

    public TicTacToe() {}

    public TicTacToe(final Grid grid) {
        this.grid = grid;
    }

    public void setPlayerOne(final int stoneNumber){
        grid.setPlayer(stoneNumber, PLAYER_ONE);
    }

    public void setPlayerTwo(final int stoneNumber){
        grid.setPlayer(stoneNumber, PLAYER_TWO);
    }

    public String getGrid() {
        return grid.getGrid();
    }

    public char getWinner() {
        if (isWinner(PLAYER_TWO)) return PLAYER_TWO;
        else if (isWinner(PLAYER_ONE)) return PLAYER_ONE;
        else return MATCH;
    }

    private boolean isWinner(final char player) {
        return grid.matchLeftColumn(player)
                || grid.matchMiddleColumn(player)
                || grid.matchRightColumn(player)
                || grid.matchTopRow(player)
                || grid.matchMiddleRow(player)
                || grid.matchBottomRow(player)
                || grid.matchTopLeft2BottomRight(player)
                || grid.matchTopRight2BottomLeft(player);
    }

}