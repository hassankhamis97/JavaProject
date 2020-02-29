/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Salah Kamal
 */
public class TicTacTeo {

    private static Move findRandomMove(ArrayList<Move> b) {
        Move v = null;
        ArrayList<Move> remainMoves = new ArrayList<>();
        for(int i = 0; i<9; i++){
            if(b.get(i).PositionTxt.isEmpty()){
                remainMoves.add(b.get(i));
            }
                
        }
        int i = (int)(Math.random() * remainMoves.size());
        return remainMoves.get(i);
    }

    static class Move {

        public String PositionTxt;
        public int PositionIndex;

        public Move(String x, int y) {
            PositionIndex = y;
            PositionTxt = x;
        }

        public Move() {

        }
    }

    static Boolean isMovesLeft(ArrayList<Move> board) {
        for (int i = 0; i < 9; i++) {
            if (board.get(i).PositionTxt.equals("")) {
                return true;
            }
        }
        return false;
    }

    static int evaluate(ArrayList<Move> b) {

        // Checking for Rows for X or O victory. 
        if (b.get(0).PositionTxt.equalsIgnoreCase(b.get(1).PositionTxt)
                && b.get(0).PositionTxt.equalsIgnoreCase(b.get(2).PositionTxt)) {
            if (b.get(0).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(0).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }
        if (b.get(3).PositionTxt.equalsIgnoreCase(b.get(4).PositionTxt)
                && b.get(3).PositionTxt.equalsIgnoreCase(b.get(5).PositionTxt)) {
            if (b.get(3).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(3).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }
        if (b.get(6).PositionTxt.equalsIgnoreCase(b.get(7).PositionTxt)
                && b.get(6).PositionTxt.equalsIgnoreCase(b.get(8).PositionTxt)) {
            if (b.get(6).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(6).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }

        // Checking for Columns for X or O victory. 
        if (b.get(
                0).PositionTxt.equalsIgnoreCase(b.get(3).PositionTxt)
                && b.get(0).PositionTxt.equalsIgnoreCase(b.get(6).PositionTxt)) {
            if (b.get(0).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(0).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }

        if (b.get(
                1).PositionTxt.equalsIgnoreCase(b.get(4).PositionTxt)
                && b.get(1).PositionTxt.equalsIgnoreCase(b.get(7).PositionTxt)) {
            if (b.get(1).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(1).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }
        if (b.get(
                2).PositionTxt.equalsIgnoreCase(b.get(5).PositionTxt)
                && b.get(2).PositionTxt.equalsIgnoreCase(b.get(8).PositionTxt)) {
            if (b.get(2).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(2).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }

        // Checking for Diagonals for X or O victory. 
        if (b.get(
                0).PositionTxt.equalsIgnoreCase(b.get(4).PositionTxt)
                && b.get(0).PositionTxt.equalsIgnoreCase(b.get(8).PositionTxt)) {
            if (b.get(0).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(0).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }

        if (b.get(
                2).PositionTxt.equalsIgnoreCase(b.get(4).PositionTxt)
                && b.get(2).PositionTxt.equalsIgnoreCase(b.get(6).PositionTxt)) {
            if (b.get(2).PositionTxt.equalsIgnoreCase("x")) {
                return +10;
            } else if (b.get(2).PositionTxt.equalsIgnoreCase("o")) {
                return -10;
            }
        }

        // Else if none of them have won then return 0 
        return 0;
    }

    static int minimax(ArrayList<Move> board,
            int depth, Boolean isMax) {
        int score = evaluate(board);

        // If Maximizer has won the game 
        // return his/her evaluated score 
        if (score == 10) {
            return score;
        }

        // If Minimizer has won the game 
        // return his/her evaluated score 
        if (score == -10) {
            return score;
        }
        if (isMovesLeft(board) == false) {
            return 0;
        }
        if (isMax) {
            int best = -1000;

            // Traverse all cells 
            for (int i = 0; i < 9; i++) {
                // Check if cell is empty 
                if (board.get(i).PositionTxt.isEmpty()) {
                    // Make the move 
                    board.get(i).PositionTxt = "x";

                    // Call minimax recursively and choose 
                    // the maximum value 
                    best = Math.max(best, minimax(board,
                            depth + 1, !isMax));

                    // Undo the move 
                    board.get(i).PositionTxt = "";
                }
            }

            return best;
        } else {
            int best = 1000;

            // Traverse all cells 
            for (int i = 0; i < 9; i++) {
                // Check if cell is empty 
                if (board.get(i).PositionTxt.isEmpty()) {
                    // Make the move 
                    board.get(i).PositionTxt = "o";

                    // Call minimax recursively and choose 
                    // the minimum value 
                    best = Math.min(best, minimax(board,
                            depth + 1, !isMax));

                    // Undo the move 
                    board.get(i).PositionTxt = "";
                }
            }

            return best;
        }
    }
    // This will return the best possible 
    // move for the player 

    static Move findBestMove(ArrayList<Move> board) {
        int bestVal = -1000;
        Move bestMove = new Move();
        bestMove.PositionIndex = -1;
        bestMove.PositionTxt = "";

        // Traverse all cells, evaluate minimax function  
        // for all empty cells. And return the cell  
        // with optimal value. 
        for (int i = 0; i < 9; i++) {
            // Check if cell is empty 
            if (board.get(i).PositionTxt.isEmpty()) {
                // Make the move 
                board.get(i).PositionTxt = "x";

                // compute evaluation function for this 
                // move. 
                int moveVal = minimax(board, 0, false);

                // Undo the move 
                board.get(i).PositionTxt = "";

                // If the value of the current move is 
                // more than the best value, then update 
                // best/ 
                if (moveVal > bestVal) {
                    bestMove.PositionIndex = i;
                    bestVal = moveVal;
                }
            }
        }

        System.out.printf("The value of the best Move "
                + "is : %d\n\n", bestVal);

        return bestMove;
    }

    public static void main(String[] args) {
        ArrayList<Move> b = new ArrayList<>();
        b.add(new Move("o", 0));
        b.add(new Move("", 1));
        b.add(new Move("", 2));
        b.add(new Move("", 3));
        b.add(new Move("x", 4));
        b.add(new Move("", 5));
        b.add(new Move("", 6));
        b.add(new Move("", 7));
        b.add(new Move("o", 8));
        Scanner scan = new Scanner(System.in);
        boolean f = true;
        System.out.print("Enter 1 for Easy ,3 for Hard:");
        int x = scan.nextInt();
        if (x == 3) {
            Move bestMove = findBestMove(b);
            System.out.println("index= " + bestMove.PositionIndex);
            System.out.println("txt= " + bestMove.PositionTxt);
        } else if (x == 1) {
            Move bestMove = findRandomMove(b);
            System.out.println("index= " + bestMove.PositionIndex);
            System.out.println("txt= " + bestMove.PositionTxt);
        } else if (x == 2){
            Move bestMove ;
            if(f){
                bestMove = findBestMove(b);
                f = !f;
            }else{
                bestMove = findRandomMove(b);
                f = !f;
            }
            System.out.println("index= " + bestMove.PositionIndex);
            System.out.println("txt= " + bestMove.PositionTxt);
        }
    }
}
