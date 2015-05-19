import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to Test the tic tac toe game kata.
 *
 * @author lumiha
 * @since 19/05/15.
 * <p>
 * [x]ToTest: Get empty grid
 * [x]ToTest: show player one first stone
 * [x]ToTest: show player two first stone
 * [x]ToTest: show player one second stone
 * []ToTest: show player two second stone
 * []ToTest: Play one wins in row
 * []ToTest: player one wins in column
 * []ToTest: play one wins in diagonal
 * []ToTest: match
 * []ToTest: layout field
 * []ToTest: who did win?
 *
 * 123
 * 456
 * 789
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
    public void getGrid_forPlayOneSetFirstStone() {
        setPlayerOne(0);
        final String currentGrid  = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x        "));
    }

    @Test
    public void getGrid_forPlayOneAndTwoSetFirstStone() {
        setPlayerOne(0);
        setPlayerTwo();
        final String currentGrid  = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x  o     "));
    }

    @Test
    public void getGrid_forPlayOneSetSecondStone() {
        setPlayerOne(0);
        setPlayerTwo();
        setPlayerOne(1);
        final String currentGrid  = getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xx o     "));
    }

    private void setPlayerTwo() {
        grid[3] = 'o';
    }

    private void setPlayerOne(final int stoneNumber) {
        grid[stoneNumber] = 'x';
    }

    private String getGrid() {
        return String.valueOf(grid);
    }
}
