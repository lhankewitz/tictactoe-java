/**
 * Class representing the grid.
 * <p>
 * The grid consists of 9 stones numbered from 0 to 8 in the following positions.
 * row\column
 *     1|2|3
 *    |-----|
 *  1 |0|1|2|
 *  - |-----|
 *  2 |3|4|5|
 *  - |-----|
 *  3 |6|7|8|
 *    |-----|
 *
 * or with coordinates
 */
public class Grid {
    private static final char REG_EXP_PLAYER_CODE = 'p';
    private char[] grid = "         ".toCharArray();

    public void setPlayer(final int stoneNumber, final char player) {
        if (stoneNumber < 0 || 8 < stoneNumber)
            throw new RuntimeException("Invalid stone. Allowed are 0-8 but was " + stoneNumber);
        if (grid[stoneNumber] != ' ') throw new RuntimeException("Stone already set");
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

    public boolean isEmpty() {
        return getGrid().trim().isEmpty();
    }

    public void reset() {
        grid = "         ".toCharArray();
    }

    public void setPlayer(final int xPos, final int yPos, final char player) {
        setPlayer(calculateStone(xPos, yPos), player);
    }

    private int calculateStone(final int xPos, final int yPos) {
        if (xPos < 1 || 3 < xPos || yPos < 1 || 3 < yPos) {
            throw new RuntimeException("Illegal coordinates (" + xPos + "," + yPos + ")");
        }

        return (yPos - 1) * 3 + (xPos - 1);
    }
}