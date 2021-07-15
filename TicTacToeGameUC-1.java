public class TicTacToeGameUC1 {




    public static void main(String args[]) {
        char[] ch = new char[10];

        for(int i=1;i< ch.length; i++){
            ch[i] = ' ';

        }
        System.out.println(ch[1] + "|" + ch[2] + "|" + ch[3]);
        System.out.println("------------------");
        System.out.println( ch[4] + "|" + ch[5] + "|" + ch[6] );
        System.out.println("------------------");
        System.out.println( ch[7] + "|" + ch[8] + "|" + ch[9]);
        System.out.println("------------------");
    }
}

