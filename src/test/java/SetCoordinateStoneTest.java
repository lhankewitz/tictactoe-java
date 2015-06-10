import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to test the stones via parameterized test.
 *
 * @author lumiha
 * @since 10/06/15.
 */
@RunWith(Parameterized.class)
public class SetCoordinateStoneTest {
    private Grid grid;
    private TicTacToe ticTacToe;

    @Parameterized.Parameters(name = "{index}: setPlayerOne({0},{1})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,1, "x        "},
                {2,1, " x       "},
                {3,1, "  x      "},
                {1,2, "   x     "}
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public int xPos = 2;

    @Parameterized.Parameter(value = 1) // first data value (0) is default
    public int yPos = 1;

    @Parameterized.Parameter(value = 2)
    public String expectedGridString = " x       ";

    @Before
    public void setUp() {
        grid = new Grid();
        ticTacToe = new TicTacToe(grid);
    }

    @Test
    public void setStoneCorrectly() {
        ticTacToe.setPlayerOne(xPos, yPos);
        final String currentGrid  = ticTacToe.getGrid();
        assertThat(currentGrid, is(expectedGridString));
    }

}
