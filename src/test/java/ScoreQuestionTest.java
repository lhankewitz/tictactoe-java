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
    public void getWinner_forPlayOneInFirstColumnWinner_returnsPlayerOne() {
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
                s.matches("x.{2}x.{2}x.{2}")
             || s.matches("xxx.{3}.{3}")
             || s.matches(".{3}xxx.{3}")
             || s.matches(".{3}.{3}xxx")
             || s.matches(".x.{2}x.{2}x.")
             || s.matches(".{2}x.{2}x.{2}x")
                ){
            return 'x';
        } else return '~';
    }
}
