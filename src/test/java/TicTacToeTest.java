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
 * []ToTest: Play one wins in row
 * []ToTest: player one wins in column
 * []ToTest: play one wins in diagonal
 * []ToTest: match
 * []ToTest: layout field
 * []ToTest: who did win?
 *
 * 012
 * 345
 * 678
 */
public class TicTacToeTest{

    private final TicTacToe ticTacToe = new TicTacToe();

    @Test
    public void getGrid_BeforeGame() {
        final String currentGrid = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("         "));
    }

    @Test
    public void getGrid_forPlayOneSetFirstStone() {
        ticTacToe.setPlayerOne(0);
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x        "));
    }

    @Test
    public void getGrid_forPlayOneAndTwoSetFirstStone() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x  o     "));
    }

    @Test
    public void getGrid_forPlayOneSetSecondStone() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        ticTacToe.setPlayerOne(1);
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xx o     "));
    }

    @Test
    public void getGrid_forPlayTwoSetSecondStone() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        ticTacToe.setPlayerOne(1);
        ticTacToe.setPlayerTwo(4);
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xx oo    "));
    }

    @Test
    public void getGrid_forPlayOneWinsInRow() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        ticTacToe.setPlayerOne(1);
        ticTacToe.setPlayerTwo(4);
        ticTacToe.setPlayerOne(2);
        final String currentGrid  = ticTacToe.getGrid();
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xxxoo    "));
    }

}
