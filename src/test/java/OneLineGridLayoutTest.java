import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to test one line grid layout.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class OneLineGridLayoutTest {

    private OneLineGridLayout oneLineGridLayout;
    private Grid grid;

    @Before
    public void setUp() {
        grid = new Grid();
        oneLineGridLayout = new OneLineGridLayout();
    }

    @Test
    public void emptyGridPrintsLineOf9Blanks() {
        final String result = oneLineGridLayout.formatGrid(grid);
        assertThat(result, is("         "));
    }

    @Test
    public void formatFinishedGame() {
        TicTacToe ticTacToe = new TicTacToe(grid);
        ticTacToe.setPlayerOne(1,1);
        ticTacToe.setPlayerTwo(1, 2);
        ticTacToe.setPlayerOne(1, 3);
        ticTacToe.setPlayerTwo(2, 1);
        ticTacToe.setPlayerOne(2, 2);
        ticTacToe.setPlayerTwo(2, 3);
        ticTacToe.setPlayerOne(3, 1);
        ticTacToe.setPlayerTwo(3, 2);
        ticTacToe.setPlayerOne(3, 3);

        final String result = oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        assertThat(result, is("xoxoxoxox"));
    }


}
