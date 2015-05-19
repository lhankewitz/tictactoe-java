/**
 * Class representing the grid.
 *
 * */
public class Grid {
    private char[] grid = "         ".toCharArray();

    public void setPlayer(final char player, final int stoneNumber) {
        grid[stoneNumber] = player;
    }


    public void setGrid(final String grid) {
        this.grid = grid.toCharArray();
    }

    public String getGrid() {
        return String.valueOf(grid);
    }
}