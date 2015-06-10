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


    public String formatGrid(final Grid grid) {
        return HEADLINE
                + TOP_BORDER
                + formatRow(grid, 1)
                + SEPARATOR
                + formatRow(grid, 2)
                + SEPARATOR
                + formatRow(grid, 3)
                + BOTTOM_BORDER;
    }

    private String formatRow(final Grid grid, final int row) {
        return row + SPACE + vSEPARATOR
                + grid.get(row, 1) + vSEPARATOR
                + grid.get(row, 2) + vSEPARATOR
                + grid.get(row, 3)  + vSEPARATOR
                + ENDLINE;
    }
}
