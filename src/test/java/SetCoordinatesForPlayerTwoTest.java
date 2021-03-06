import com.sepoe.tictactoe.game.TicTacToe;
import com.sepoe.tictactoe.grid.Grid;
import com.sepoe.tictactoe.grid.layout.OneLineGridLayout;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Class to test the stones via parameterized test.
 *
 * @author lumiha
 * @since 10/06/15.
 */
@RunWith(Parameterized.class)
public class SetCoordinatesForPlayerTwoTest {
    private Grid grid;
    private TicTacToe ticTacToe;
    private OneLineGridLayout oneLineGridLayout;

    @Parameterized.Parameters(name = "{index}: setPlayerTwo({0},{1})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                 {1,1, "o       x"}
                ,{1,2, " o      x"}
                ,{1,3, "  o     x"}
                ,{2,1, "   o    x"}
                ,{2,2, "    o   x"}
                ,{2,3, "     o  x"}
                ,{3,1, "      o x"}
                ,{3,2, "       ox"}
        });
    }

    @Parameterized.Parameter
    public int row = 1;

    @Parameterized.Parameter(value = 1)
    public int column = 2;

    @Parameterized.Parameter(value = 2)
    public String expectedGridString = " x       ";

    @Before
    public void setUp() {
        grid = new Grid();
        ticTacToe = new TicTacToe(grid);
        oneLineGridLayout = new OneLineGridLayout();
    }

    @Test
    public void setStoneForPlayerCorrectly() {
        ticTacToe.setPlayerOne(3, 3);
        ticTacToe.setPlayerTwo(row, column);
        final String currentGrid  = oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        assertThat(currentGrid, is(expectedGridString));
    }

    @Test
    public void set3_3_StoneForPlayerTwoCorrectly() {
        ticTacToe.setPlayerOne(1, 1);
        ticTacToe.setPlayerTwo(3, 3);
        final String currentGrid  =oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        assertThat(currentGrid, is("x       o"));
    }

    @Test
    public void setStoneWithIncorrectCoordinatesThrowException() {
        try {
            ticTacToe.setPlayerOne(1, 1);
            ticTacToe.setPlayerTwo(4, 4);
            fail("Exception is expected for wrong coordinates");
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), containsString("4,4"));
        }
    }

}
