package design_problems.tic_tac_toe.players;

import design_problems.tic_tac_toe.pieces.PieceType;
import design_problems.tic_tac_toe.pieces.PlayingPiece;

public class Player {
    String player_name;
    PlayingPiece piece_type;

    public Player(String name, PlayingPiece type){
        player_name = name;
        piece_type = type;
    }

    public PieceType getPieceType(){
        return piece_type.piece;
    }

    public String getPlayerName(){
        return player_name;
    }
    
}
