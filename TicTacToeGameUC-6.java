import java.util.Random;
public class TicTacToeUC6 {
    public static void main(String[] args){
        Random r = new Random();
        int chance = r.nextInt(2);
        if (chance == 1) {
            System.out.println("tails computer will play");   //computer play
        } else {
            System.out.println("heads user will play");   //user play


        }




    }
}
