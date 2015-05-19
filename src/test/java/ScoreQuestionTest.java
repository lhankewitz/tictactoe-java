import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to ...
 *
 * @author lumiha
 * @since 19/05/15.
 */
public class ScoreQuestionTest {


    private final ScoreChecker scoreChecker = new ScoreChecker();

    @Test
    public void getWinner_forPlayOneInFirstRowWinner_returnsPlayerOne() {
        final char result = scoreChecker.getWinner("xxxoo    ");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInSecondRowWinner_returnsPlayerOne() {
        //                             012345678
        final char result = scoreChecker.getWinner("oo xxx   ");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInThirdRowWinner_returnsPlayerOne() {
        //                             012345678
        final char result = scoreChecker.getWinner("oo    xxx");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInFistColumnWinner_returnsPlayerOne() {
        final char result = scoreChecker.getWinner("xo xo x  ");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInSecondColumnWinner_returnsPlayerOne() {
        final char result = scoreChecker.getWinner("ox ox  x ");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInThirdColumnWinner_returnsPlayerOne() {
        final char result = scoreChecker.getWinner("o xo x  x");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInTopLeft2BottomRightWinner_returnsPlayerOne() {
        final char result = scoreChecker.getWinner("xo ox   x");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInTopRight2BottomLeftWinner_returnsPlayerOne() {
        final char result = scoreChecker.getWinner(" oxox x  ");
        assertThat(result, is(ScoreChecker.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayTwoInFirstRowWinner_returnsPlayerTwo() {
        final char result = scoreChecker.getWinner("oooxx xx ");
        assertThat(result, is(ScoreChecker.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forPlayTwoInSecondRowWinner_returnsPlayerTwo() {
        final char result = scoreChecker.getWinner("xx ooox  ");
        assertThat(result, is(ScoreChecker.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forMatch_returnsMatch() {
        final char result = scoreChecker.getWinner("oxxxxooox");
        assertThat(result, is('~') );
    }

}
