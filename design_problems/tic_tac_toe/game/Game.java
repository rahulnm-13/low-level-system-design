package design_problems.tic_tac_toe.game;

import java.util.Deque;
import java.util.LinkedList;
import design_problems.tic_tac_toe.board.Board;
import design_problems.tic_tac_toe.players.Player;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board board;
    Boolean isWinner = true;

    public Game(Board board){
        players = new LinkedList<>();
        this.board = board;
    }

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void removePlayerFromGame(Player player){
        players.remove(player);
    }

    public String startGame(){
        while(isWinner) {
            Player turn = players.removeFirst();
    
            int freeCells = board.getFreeCells();
            if(freeCells <= 0){
                isWinner = false;
                continue;
            }

            board.printBoard();

            System.out.println("Player: "+turn.getPlayerName()+", Enter row, column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean placePiece = board.placePieceOnBoard(turn, inputRow, inputColumn);

            if(!placePiece){
                System.out.println("Incorrect cell provided, take your turn again");
                players.addFirst(turn);
                continue;
            }

            boolean checkWinner = board.checkForWinner(inputRow, inputColumn);

            if(checkWinner){
                System.out.println("Player: "+turn.getPlayerName()+" has WON the game");
                isWinner = false;
                board.printBoard();
                continue;
            }

            players.addLast(turn);

        }

        return "---- Game Tied ----";
    }
}
