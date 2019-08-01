import java.util.Scanner;

public class Main{
    static Scanner input = new Scanner(System.in);
    static String[] board = {"0", "1", "2",
                          "3", "4", "5",
                          "6", "7", "8"};

    public static void printBoard(){
        System.out.println(board[0] + board[1] + board[2]);
        System.out.println(board[3] + board[4] + board[5]);
        System.out.println(board[6] + board[7] + board[8]);
    }

    public static boolean isEmpty(int space){
        if(board[space] == "X" || board[space] == "O")
            return false;
        return true;
    }

    static String player = "X";
    public static void main(String[] args){
        int i = 0;
        while(i < 9){
            printBoard();
            System.out.println("where do you want to move? ");
            int userIn = input.nextInt();
            if(isEmpty(userIn)){
                board[userIn] = player;
                if(player == "X"){
                    player = "O";
                }
                else if(player == "O"){
                    player = "X";
                }
                i++;
            }else{
                System.out.println("space taken");
            }
        }
    }
}