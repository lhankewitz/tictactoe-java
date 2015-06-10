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
public class SetCoordinatesForPlayerOneTest {
    private Grid grid;
    private TicTacToe ticTacToe;
    private OneLineGridLayout oneLineGridLayout;

    @Parameterized.Parameters(name = "{index}: setPlayerOne({0},{1})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                 {1,1, "x        "}
                ,{1,2, " x       "}
                ,{1,3, "  x      "}
                ,{2,1, "   x     "}
                ,{2,2, "    x    "}
                ,{2,3, "     x   "}
                ,{3,1, "      x  "}
                ,{3,2, "       x "}
                ,{3,3, "        x"}
        });
    }

    @Parameterized.Parameter
    public int row = 1;

    @Parameterized.Parameter(value = 1)
    public int column = 2;

    @Parameterized.Parameter(value = 2)
    public String expectedGridString;

    @Before
    public void setUp() {
        grid = new Grid();
        ticTacToe = new TicTacToe(grid);
        oneLineGridLayout = new OneLineGridLayout();
    }

    @Test
    public void setStoneForPlayerOneCorrectly() {
        ticTacToe.setPlayerOne(row, column);
        final String currentGrid  = oneLineGridLayout.formatGrid(ticTacToe.getGrid());
        assertThat(currentGrid, is(expectedGridString));
    }


    @Test
    public void setStoneWithIncorrectCoordinatesThrowException() {
        try {
            ticTacToe.setPlayerOne(4, 4);
            fail("Exception is expected for wrong coordinates");
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), containsString("4,4"));
        }
    }

}
