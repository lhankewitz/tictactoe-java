public class TicTacToe {
    public static final char PLAYER_TWO = 'o';
    public static final char PLAYER_ONE = 'x';
    public static final char MATCH = '~';
    public static final char OPEN = '?';

    private Grid grid = new Grid();
    private char lastPlayer = getPlayerTwo();

    public TicTacToe() {}

    public TicTacToe(final Grid grid) {
        this.grid = grid;
    }

    /**
     * Set the stone for defined player one.
     *
     * @param stoneNumber is an integer between 0 and 8.
     *
     * */
    public void setPlayerOne(final int stoneNumber){
        setPlayerStone(getPlayerOne(), stoneNumber);
    }

    public void setPlayerTwo(final int stoneNumber){
        setPlayerStone(getPlayerTwo(), stoneNumber);
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
        if (isWinner(getPlayerTwo())) return getPlayerTwo();
        else if (isWinner(getPlayerOne())) return getPlayerOne();
        else if(grid.isFull()) return MATCH;
        else return OPEN;
    }

    private char getPlayerOne() {
        return PLAYER_ONE;
    }

    private char getPlayerTwo() {
        return PLAYER_TWO;
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

    public void reset() {
        grid.reset();
    }


    public void setPlayerOne(final int xPos, final int yPos) {

        final int stone;
        if(xPos == 1 && yPos == 1) stone = 0;
        else if(xPos == 2 && yPos == 1) stone = 1; // ((yPos-1)*3) + (xPos -1)
        else if(xPos == 3 && yPos == 1) stone = 2;
        else if(xPos == 1 && yPos == 2) stone = 3;
        else throw new RuntimeException("(" + xPos + "," + yPos + ") is unknown on the grid");
        grid.setPlayer(stone, getPlayerOne());
    }
}