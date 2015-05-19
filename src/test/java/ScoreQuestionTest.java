import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to play ticTacToe.
 *
 * @author lumiha
 * @since 19/05/15.
 */
public class ScoreQuestionTest {


    private final TicTacToe ticTacToe = new TicTacToe();

    @Test
    public void getWinner_forPlayOneInFirstRowWinner_returnsPlayerOne() {
        final char result = ticTacToe.getWinner("xxxoo    ");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInSecondRowWinner_returnsPlayerOne() {
        //                             012345678
        final char result = ticTacToe.getWinner("oo xxx   ");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInThirdRowWinner_returnsPlayerOne() {
        //                             012345678
        final char result = ticTacToe.getWinner("oo    xxx");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInFistColumnWinner_returnsPlayerOne() {
        final char result = ticTacToe.getWinner("xo xo x  ");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInSecondColumnWinner_returnsPlayerOne() {
        final char result = ticTacToe.getWinner("ox ox  x ");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInThirdColumnWinner_returnsPlayerOne() {
        final char result = ticTacToe.getWinner("o xo x  x");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInTopLeft2BottomRightWinner_returnsPlayerOne() {
        final char result = ticTacToe.getWinner("xo ox   x");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInTopRight2BottomLeftWinner_returnsPlayerOne() {
        final char result = ticTacToe.getWinner(" oxox x  ");
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayTwoInFirstRowWinner_returnsPlayerTwo() {
        final char result = ticTacToe.getWinner("oooxx xx ");
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forPlayTwoInSecondRowWinner_returnsPlayerTwo() {
        final char result = ticTacToe.getWinner("xx ooox  ");
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forPlayTwoInThirdRowWinner_returnsPlayerTwo() {
        //                             012345678
        final char result = ticTacToe.getWinner("xx   xooo");
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forMatch_returnsMatch() {
        final char result = ticTacToe.getWinner("oxxxxooox");
        assertThat(result, is('~') );
    }

}
