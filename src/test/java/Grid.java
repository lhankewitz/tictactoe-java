/**
 * Class representing the grid.
 *
 * */
public class Grid {
    private char[] grid = "         ".toCharArray();


    public void setPlayer(final char player, final int stoneNumber) {
        grid[stoneNumber] = player;
    }

    public String getGrid() {
        return String.valueOf(grid);
    }
}