/**
 * Class to print the grid.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class FramedGridLayout {
    private static final String ENDLINE = "\n";
    private static final String SEPARATOR = "- |-+-+-|" + ENDLINE;
    private static final String HEADLINE = "   1|2|3" + ENDLINE;
    private static final String vSEPARATOR = "|";
    private static final String BOTTOM_BORDER = "  +-----+" + ENDLINE;
    private static final String TOP_BORDER = "  +-----+" + ENDLINE;
    private static final String SPACE = " ";
    private final Grid grid;

    public FramedGridLayout(final Grid grid) {
        this.grid = grid;
    }

    public String formatGrid() {
        return HEADLINE
                + TOP_BORDER
                + formatRow(1)
                + SEPARATOR
                + formatRow(2)
                + SEPARATOR
                + formatRow(3)
                + BOTTOM_BORDER;
    }

    private String formatRow(final int row) {
        return row + SPACE + vSEPARATOR
                + grid.get(row, 1) + vSEPARATOR
                + grid.get(row, 2) + vSEPARATOR
                + grid.get(row, 3)  + vSEPARATOR
                + ENDLINE;
    }
}
