public class TicTacToe {
    public static final char PLAYER_TWO = 'o';
    public static final char PLAYER_ONE = 'x';
    public static final char MATCH = '~';
    public static final char OPEN = '?';

    private Grid grid = new Grid();
    private char lastPlayer = PLAYER_TWO;

    public TicTacToe() {}

    public TicTacToe(final Grid grid) {
        this.grid = grid;
    }

    public void setPlayerOne(final int stoneNumber){
        setPlayerStone(PLAYER_ONE, stoneNumber);
    }

    public void setPlayerTwo(final int stoneNumber){
        setPlayerStone(PLAYER_TWO, stoneNumber);
    }

    private void setPlayerStone(final char playerOne, final int stoneNumber) {
        if(lastPlayer == playerOne) throw new RuntimeException("Next Players turn!");
        lastPlayer = playerOne;
        grid.setPlayer(stoneNumber, playerOne);
    }

    public String getGrid() {
        return grid.getGrid();
    }

    public char getWinner() {
        if (isWinner(PLAYER_TWO)) return PLAYER_TWO;
        else if (isWinner(PLAYER_ONE)) return PLAYER_ONE;
        else if(grid.isFull()) return MATCH;
        else return OPEN;
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