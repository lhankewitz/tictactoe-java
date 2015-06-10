package com.sepoe.tictactoe.game;

import com.sepoe.tictactoe.grid.Grid;

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

    private void setPlayerStone(final char player, final int stoneNumber) {
        checkTurn(player);
        grid.setPlayer(stoneNumber, player);
    }

    private void checkTurn(final char player) {
        if(lastPlayer == player) throw new RuntimeException("Next Players turn!");
        lastPlayer = player;
    }

    public Grid getGrid() {
        return grid;
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


    public void setPlayerOne(final int row, final int column) {
        setPlayerStone(row, column, getPlayerOne());
    }

    private void setPlayerStone(final int row, final int column, final char player) {
        checkTurn(player);
        grid.setPlayer(row, column, player);
    }

    public void setPlayerTwo(final int row, final int column) {
        setPlayerStone(row, column, getPlayerTwo());
    }
}