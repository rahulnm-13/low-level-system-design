package design_problems.tic_tac_toe.board;

import design_problems.tic_tac_toe.pieces.PieceType;
import design_problems.tic_tac_toe.players.Player;

public class Board {
    int size;
    PieceType[][] board;
    int free_cells;

    public Board(int n){
        size = n;
        board = new PieceType[n][n];
        free_cells = n*n;
    }

    public void printBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] != null){
                    System.out.print("  "+board[i][j]+"  |");
                }
                else{
                    System.out.print("     |");
                }
            }
            System.out.println();
        }
    }

    public int getFreeCells() {
        return free_cells;
    }

    public boolean placePieceOnBoard(Player player, int row, int col){
        if(row >= size || col >= size){
            return false;
        }

        if(board[row][col] == null){
            board[row][col] = player.getPieceType();
            return true;
        }

        return false;
    }

    public boolean checkForWinner(int row, int col){
        boolean foundAWinner = false;
        for(int rowIdx=0; rowIdx<size; rowIdx++){
            if(board[row][col] == board[rowIdx][col]){
                foundAWinner = true;
            }
            else{
                foundAWinner = false;
                break;
            }
        }
        if(foundAWinner) return foundAWinner;
        for(int colIdx=0; colIdx<size; colIdx++){
            if(board[row][col] == board[row][colIdx]){
                foundAWinner = true;
            }
            else{
                foundAWinner = false;
                break;
            }
        }
        if(foundAWinner) return foundAWinner;
        for(int cell=0; cell<size; cell++){
            if(board[row][col] == board[cell][cell]){
                foundAWinner = true;
            }
            else{
                foundAWinner = false;
                break;
            }
        }
        if(foundAWinner) return foundAWinner;
        for(int cell=0; cell<size; cell++){
            if(board[row][col] == board[cell][size-cell-1]){
                foundAWinner = true;
            }
            else{
                foundAWinner = false;
                break;
            }
        }

        return foundAWinner;
    }
    
}
