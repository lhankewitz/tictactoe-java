import org.junit.Test;

import java.util.Arrays;

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

    private char[] grid = "         ".toCharArray();

    @Test
    public void getGrid_BeforeGame() {
        final String currentGrid = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("         "));
    }

    @Test
    public void tictactoe_forPlayOneSetFirstStone() {
        setPlayerOne();
        final String currentGrid  = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x        "));
    }

    @Test
    public void tictactoe_forPlayOneAndTwoSetFirstStone() {
        setPlayerOne();
        setPlayerTwo();
        final String currentGrid  = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x  o     "));
    }

    private void setPlayerTwo() {
        grid[3] = 'o';
    }

    private void setPlayerOne() {
        grid[0] = 'x';
    }

    private String getGrid() {
        return String.valueOf(grid);
    }
}
