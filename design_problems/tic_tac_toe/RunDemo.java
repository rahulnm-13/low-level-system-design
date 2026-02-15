package design_problems.tic_tac_toe;

import design_problems.tic_tac_toe.board.*;
import design_problems.tic_tac_toe.game.*;
import design_problems.tic_tac_toe.pieces.PieceO;
import design_problems.tic_tac_toe.pieces.PieceX;
import design_problems.tic_tac_toe.pieces.PlayingPiece;
import design_problems.tic_tac_toe.players.Player;

public class RunDemo {

    public static void main(String[] args) {
        Board board = new Board(3);
        Game game = new Game(board);
        PlayingPiece pieceX = new PieceX();
        PlayingPiece pieceO = new PieceO();
        Player p1 = new Player("Rahul", pieceX);
        Player p2 = new Player("Muddu", pieceO);
    
        game.addPlayerToGame(p1);
        game.addPlayerToGame(p2);

        game.startGame();

    }

}
