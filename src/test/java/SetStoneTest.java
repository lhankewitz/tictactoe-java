import com.sepoe.tictactoe.game.TicTacToe;
import com.sepoe.tictactoe.grid.Grid;
import com.sepoe.tictactoe.grid.OneLineGridLayout;
import org.junit.Before;
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
 * [x]ToTest: Play two wins in diagonal top right to bottom left
 * [x]ToTest: match means no winner
 * [x]ToTest: no change of setting on a field where is already a stone
 * [x]ToTest: no two successive set of stones for one player
 * [x]ToTest: not yet finished game
 * [x]ToTest: reset game
 * [x]ToTest: invalid stones throw exception
 * [x]ToTest: layout field
 *
 */
public class SetStoneTest {

    private final Grid grid = new Grid();
    private final TicTacToe ticTacToe = new TicTacToe(grid);
    private OneLineGridLayout oneLineGridLayout;

    @Before
    public void setUp() {
        oneLineGridLayout = new OneLineGridLayout();
    }

    @Test
    public void getGrid_BeforeGame() {
        final String currentGrid = oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        System.out.println(currentGrid);
        assertThat(currentGrid, is("         "));
    }

    @Test
    public void getGrid_forPlayOneSetFirstStone() {
        ticTacToe.setPlayerOne(0);
        final String currentGrid  =  oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        assertThat(currentGrid, is("x        "));
    }


    @Test
    public void getGrid_forPlayOneAndTwoSetFirstStone() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        final String currentGrid  =  oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        System.out.println(currentGrid);
        assertThat(currentGrid, is("x  o     "));
    }

    @Test
    public void getGrid_forPlayOneSetSecondStone() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        ticTacToe.setPlayerOne(1);
        final String currentGrid  =  oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xx o     "));
    }

    @Test
    public void getGrid_forPlayTwoSetSecondStone() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(3);
        ticTacToe.setPlayerOne(1);
        ticTacToe.setPlayerTwo(4);
        final String currentGrid  =  oneLineGridLayout.formatGrid(ticTacToe.getGrid());
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
        final String currentGrid  =  oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        System.out.println(currentGrid);
        assertThat(currentGrid, is("xxxoo    "));
    }

    @Test
    public void reset_forFilledGame_clearsGame() {
        ticTacToe.setPlayerOne(0);
        ticTacToe.reset();
        assertThat(grid.isEmpty(), is(true));
    }
}
