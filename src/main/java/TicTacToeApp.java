/**
 * Class to play ttt
 *
 * @author lumiha
 * @since 19/05/15.
 */
public class TicTacToeApp {

    public static void main(String[] args) {
        Grid grid = new Grid();
        final TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.setPlayerOne(1, 1);
        ticTacToe.setPlayerTwo(1, 2);
        ticTacToe.setPlayerOne(2, 2);
        ticTacToe.setPlayerTwo(2, 1);
        ticTacToe.setPlayerOne(3, 3);

        System.out.println(new FramedGridLayout().formatGrid(grid));

        System.out.println("Winner is " + ticTacToe.getWinner());
    }

}
