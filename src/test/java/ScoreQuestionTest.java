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


    private final Grid grid = new Grid();
    private final TicTacToe ticTacToe = new TicTacToe(grid);

    @Test
    public void getWinner_forPlayOneInFirstRowWinner_returnsPlayerOne() {
        final String gridValue = "xxxoo    ";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInSecondRowWinner_returnsPlayerOne() {
        //                             012345678
        final String gridValue = "oo xxx   ";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInThirdRowWinner_returnsPlayerOne() {
        //                             012345678
        final String gridValue = "oo    xxx";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInFistColumnWinner_returnsPlayerOne() {
        final String gridValue = "xo xo x  ";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInSecondColumnWinner_returnsPlayerOne() {
        final String gridValue = "ox ox  x ";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInThirdColumnWinner_returnsPlayerOne() {
        final String gridValue = "o xo x  x";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInTopLeft2BottomRightWinner_returnsPlayerOne() {
        final String gridValue = "xo ox   x";
        grid.setGrid(gridValue);
        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayOneInTopRight2BottomLeftWinner_returnsPlayerOne() {
        final String gridValue = " oxox x  ";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_ONE) );
    }

    @Test
    public void getWinner_forPlayTwoInFirstRowWinner_returnsPlayerTwo() {
        final String gridValue = "oooxx xx ";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forPlayTwoInSecondRowWinner_returnsPlayerTwo() {
        final String gridValue = "xx ooox  ";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forPlayTwoInThirdRowWinner_returnsPlayerTwo() {
        //                             012345678
        final String gridValue = "xx   xooo";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forPlayTwoInTopRight2BottomLeftWinner_returnsPlayerTwo() {
        final String gridValue = "xxoxo o  ";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.PLAYER_TWO) );
    }

    @Test
    public void getWinner_forMatch_returnsMatch() {
        final String gridValue = "oxxxxooox";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.MATCH) );
    }

    @Test
    public void getWinner_forUnfinishedGame_returnsOpenGame() {
        final String gridValue = "xoxoxoox ";
        grid.setGrid(gridValue);

        final char result = ticTacToe.getWinner();
        assertThat(result, is(TicTacToe.OPEN) );
    }

}
