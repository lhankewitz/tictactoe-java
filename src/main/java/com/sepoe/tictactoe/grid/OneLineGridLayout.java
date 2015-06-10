package com.sepoe.tictactoe.grid;

/**
 * Class to print the grid in one line.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class OneLineGridLayout {

    public String formatGrid(Grid grid){
        char[] line = new char[9];
        for(int row = 1; row <= 3; row++){
            for(int column = 1; column <= 3; column++){
                line[calculateLineIndex(row, column)] = grid.get(row, column);
            }
        }
        return new String(line);
    }


    private int calculateLineIndex(final int row, final int column) {
        return (row-1)*3 + (column-1);
    }

}
