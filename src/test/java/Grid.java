public class Grid {
    private char[] grid = "         ".toCharArray();

    public void setPlayerTwo(final int stoneNumber) {
        grid[stoneNumber] = 'o';
    }

    public void setPlayerOne(final int stoneNumber) {
        grid[stoneNumber] = 'x';
    }

    public String getGrid() {
        return String.valueOf(grid);
    }
}