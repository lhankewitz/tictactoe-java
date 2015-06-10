/**
 * Class to print the grid.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class GridPrinter {
    private final Grid grid;

    public GridPrinter(final Grid grid) {
        this.grid = grid;
    }

    public String formatGrid() {
        String expected =
                "   1|2|3" + "\n"
                        + "  +-----+" + "\n"
                        + "1 |x|o|x|" + "\n"
                        + "- |-+-+-|" + "\n"
                        + "2 |o|x|o|" + "\n"
                        + "- |-+-+-|" + "\n"
                        + "3 |x|o|x|" + "\n"
                        + "  +-----+" + "\n";
        return expected;
    }
}
