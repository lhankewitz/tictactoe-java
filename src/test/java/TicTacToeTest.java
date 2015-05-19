import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to Test the tic tac toe game kata.
 *
 * @author lumiha
 * @since 19/05/15.
 * <p>
 * []ToTest: Get empty grid
 * []ToTest: show first stone
 * []ToTest: show opponent stone
 * []ToTest: Play one wins in row
 * []ToTest: player one wins in column
 * []ToTest: play one wins in diagonal
 * []ToTest: match
 * []ToTest: layout field
 */
public class TicTacToeTest {

    private String grid = "  \n  \n  \n";

    @Test
    public void getGrid_BeforeGame() {
        final String currentGrid = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("  \n  \n  \n"));
    }

    @Test
    public void tictactoe_forPlayOneSetFirstStone() {
        setPlayerOne();
        final String currentGrid  = getGrid();
        assertThat(currentGrid, is("x \n  \n  \n"));
    }

    private void setPlayerOne() {
        grid = "x \n  \n  \n";
    }

    private String getGrid() {
        return grid;
    }
}
