import java.util.Scanner;

public class TicTacToeUC5 {
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        board = new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

        
        Scanner scanner = new Scanner(System.in);
        String gameStatus = " a space is here; make a move";
        while (true) {
            print(board);
             String userMove = getUserMove();
             Object markMoveOnBoard = getGameStatus(board);
             if(!gameStatus.equals("space is not empty...TRY AGAIN!"))
             {
                System.out.println("space is not empty");
             }
             else{
                 System.out.println("make a move");}

             String computerMove = getComputerMove();
             System.out.println("computer move:"+ computerMove);
             markMoveBoard('0', computerMove);
             getGameStatus(board);
             if(!gameStatus.equals("Space is not empty...TRY AGAIN!")){
                 System.out.println("space is not empty");
             }
             else{
                 System.out.println("make a move");
         }


         System.out.println(gameStatus);
         scanner.close();
     }






        }

    private static Object getGameStatus(char[][] board) {
        return null;
    }

    private static void markMoveBoard(char c, String computerMove) {
    }

    private static String getUserMove() {
        return null;
    }

    private static void print(char[][] board) {
    }

    private static String getComputerMove() {
        return null;
    }


}
