import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to test the output of the game status.
 *
 * @author lumiha
 * @since 10/06/15.
 */
public class PrintGameStatusTest {

    private Grid grid;
    private TicTacToe ticTacToe;
    private GridPrinter gridPrinter;

    @Before
    public void setUp() {
        grid = new Grid();
        ticTacToe = new TicTacToe(grid);

        // Player one wins with last stone
        ticTacToe.setPlayerOne(1,1);
        ticTacToe.setPlayerTwo(1, 2);
        ticTacToe.setPlayerOne(1, 3);
        ticTacToe.setPlayerTwo(2, 1);
        ticTacToe.setPlayerOne(2, 2);
        ticTacToe.setPlayerTwo(2, 3);
        ticTacToe.setPlayerOne(3, 1);
        ticTacToe.setPlayerTwo(3, 2);
        ticTacToe.setPlayerOne(3, 3);

        gridPrinter = new GridPrinter(grid);
    }

    @Test
    public void printGrid() {
        final String result = gridPrinter.formatGrid();
        String expected =
                 "   1|2|3" + "\n"
                + "  +-----+" + "\n"
                + "1 |x|o|x|" + "\n"
                + "- |-+-+-|" + "\n"
                + "2 |o|x|o|" + "\n"
                + "- |-+-+-|" + "\n"
                + "3 |x|o|x|" + "\n"
                + "  +-----+" + "\n";

        System.out.println(expected);
        assertThat(result, is(
                expected
        ));
    }
}
