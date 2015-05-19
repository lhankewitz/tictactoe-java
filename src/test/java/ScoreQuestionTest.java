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


    private static final char REG_EXP_PLAYER_CODE = 'p';

    @Test
    public void getWinner_forPlayOneInFirstRowWinner_returnsPlayerOne() {
        final char result = getWinner("xxxoo    ");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInSecondRowWinner_returnsPlayerOne() {
        //                             012345678
        final char result = getWinner("oo xxx   ");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInThirdRowWinner_returnsPlayerOne() {
        //                             012345678
        final char result = getWinner("oo    xxx");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInFistColumnWinner_returnsPlayerOne() {
        final char result = getWinner("xo xo x  ");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInSecondColumnWinner_returnsPlayerOne() {
        final char result = getWinner("ox ox  x ");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInThirdColumnWinner_returnsPlayerOne() {
        final char result = getWinner("o xo x  x");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInTopLeft2BottomRightWinner_returnsPlayerOne() {
        final char result = getWinner("xo ox   x");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayOneInTopRight2BottomLeftWinner_returnsPlayerOne() {
        final char result = getWinner(" oxox x  ");
        assertThat(result, is('x') );
    }

    @Test
    public void getWinner_forPlayTwoInSecondRowWinner_returnsPlayerTwo() {
        final char result = getWinner("xx ooox  ");
        assertThat(result, is('o') );
    }

    @Test
    public void getWinner_forMatch_returnsMatch() {
        final char result = getWinner("oxxxxooox");
        assertThat(result, is('~') );
    }


    public char getWinner(final String s) {
        if (s.matches(".{3}ooo.{3}")) return 'o';
        else if(
                matchLeftColumn(s)
             || matchMiddleColumn(s)
             || matchRightColumn(s)
             || matchTopRow(s)
             || matchSecondRow(s)
             || matchBottomRow(s)
             || matchTopLeft2BottomRight(s, 'x')
             || matchTopRight2BottomLeft(s, 'x')
                ){
            return 'x';
        }  else return '~';
    }

    private boolean matchTopRight2BottomLeft(final String grid, final char player) {
        return grid.matches(".{2}p.p.p.{2}".replace(REG_EXP_PLAYER_CODE, player));
    }

    private boolean matchTopLeft2BottomRight(final String grid, final char player) {
        return grid.matches("p.{3}p.{3}p".replace(REG_EXP_PLAYER_CODE, player));
    }

    private boolean matchBottomRow(final String s) {
        return s.matches(".{3}.{3}x{3}");
    }

    private boolean matchSecondRow(final String s) {
        return s.matches(".{3}x{3}.{3}");
    }

    private boolean matchTopRow(final String s) {
        return s.matches("x{3}.{3}.{3}");
    }

    private boolean matchRightColumn(final String s) {
        return s.matches(".{2}x.{2}x.{2}x");
    }

    private boolean matchMiddleColumn(final String s) {
        return s.matches(".x.{2}x.{2}x.");
    }

    private boolean matchLeftColumn(final String s) {
        return s.matches("x.{2}x.{2}x.{2}");
    }
}
