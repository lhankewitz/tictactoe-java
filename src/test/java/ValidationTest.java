import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Class to test validation of tictactoe
 *
 * @author lumiha
 * @since 19/05/15.
 */
public class ValidationTest {

    private final Grid grid = new Grid();
    private final TicTacToe ticTacToe = new TicTacToe(grid);

    @Test
    public void settingStone_whereTheStoneHadAlreadyBeenSet_throwsException() {
        try {
            ticTacToe.setPlayerOne(0);
            ticTacToe.setPlayerTwo(0);
            fail("Should not be reached because no setting of same stone possible");
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), containsString("Stone already set"));
        }
    }
}
