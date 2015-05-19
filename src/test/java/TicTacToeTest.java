import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to Test the tic tac toe game kata.
 *
 * @author lumiha
 * @since 19/05/15.

 []ToTest: show first stone
 []ToTest: show opponent stone

 */
public class TicTacToeTest {
    @Test
    public void testEnvFunctioning() {
        assertThat("A", is("A") );
    }
}
