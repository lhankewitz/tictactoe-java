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
 * [x]ToTest: show player two second stone
 * [x]ToTest: Play one wins in first row
 * [x]ToTest: Play one wins in second row
 * [x]ToTest: Play one wins in third row
 * [x]ToTest: player one wins in first column
 * [x]ToTest: player one wins in second column
 * [x]ToTest: player one wins in third column
 * [x]ToTest: play one wins in diagonal top left to bottom right
 * [x]ToTest: play one wins in diagonal top right to bottom left
 * [x]ToTest: Play two wins in second row
 * []ToTest: Play two wins in diagonal top right to bottom left
 * [x]ToTest: match means no winner
 * []ToTest: layout field
 * []ToTest: who did win tests?
 *
 * 012
 * 345
 * 678
 */
public class SetStoneTest {

    private final TicTacToe ticTacToe = new TicTacToe();

    @Test
    public void getGrid_BeforeGame() {
        final String currentGrid = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("         "));
    }

    @Test
    public void getGrid_forPlayOneSetFirstStone() {
        ticTacToe.setPlayer(0, 'x');
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x        "));
    }

    @Test
    public void getGrid_forPlayOneAndTwoSetFirstStone() {
        ticTacToe.setPlayer(0, 'x');
        ticTacToe.setPlayer(3, 'o');
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x  o     "));
    }

    @Test
    public void getGrid_forPlayOneSetSecondStone() {
        ticTacToe.setPlayer(0, 'x');
        ticTacToe.setPlayer(3, 'o');
        ticTacToe.setPlayer(1, 'x');
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xx o     "));
    }

    @Test
    public void getGrid_forPlayTwoSetSecondStone() {
        ticTacToe.setPlayer(0, 'x');
        ticTacToe.setPlayer(3, 'o');
        ticTacToe.setPlayer(1, 'x');
        ticTacToe.setPlayer(4, 'o');
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xx oo    "));
    }

    @Test
    public void getGrid_forPlayOneWinsInRow() {
        ticTacToe.setPlayer(0, 'x');
        ticTacToe.setPlayer(3, 'o');
        ticTacToe.setPlayer(1, 'x');
        ticTacToe.setPlayer(4, 'o');
        ticTacToe.setPlayer(2, 'x');
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xxxoo    "));
    }


    @Test
    public void testRegExGen() {
        assertThat(String.format(".{2}%1$c.%1$c.%1$c.{2}", 'x'), is(".{2}x.x.x.{2}"));
    }
}
