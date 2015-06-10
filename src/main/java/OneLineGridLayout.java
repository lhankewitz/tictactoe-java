/**
 * Class to print the grid.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class OneLineGridLayout {
    private final Grid grid;

    public OneLineGridLayout(final Grid grid) {
        this.grid = grid;
    }

    public String formatGrid() {
        return grid.getGrid();
    }

}
