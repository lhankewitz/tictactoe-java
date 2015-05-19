/**
 * Class to play ttt
 *
 * @author lumiha
 * @since 19/05/15.
 */
public class TicTacToeApp {

    public static void main(String[] args) {
        final TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.setPlayerOne(0);
        ticTacToe.setPlayerTwo(1);
        ticTacToe.setPlayerOne(4);
        ticTacToe.setPlayerTwo(3);
        ticTacToe.setPlayerOne(8);

        System.out.println("Winner is " + ticTacToe.getWinner());
    }

}
