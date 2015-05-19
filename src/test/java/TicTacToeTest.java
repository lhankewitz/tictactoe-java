import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to Test the tic tac toe game kata.
 *
 * @author lumiha
 * @since 19/05/15.
 * <p>
 * []ToTest: show first stone
 * []ToTest: show opponent stone
 * []ToTest: Play one wins in row
 * []ToTest: player one wins in column
 * []ToTest: play one wins in diagonal
 * []ToTest: play two wins
 * []ToTest: match
 * []ToTest: layout field
 * []ToTest:
 */
public class TicTacToeTest {
    @Test
    public void testEnvFunctioning() {
        assertThat("A", is("A"));
    }
}
