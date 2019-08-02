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

    public static boolean checkForWin(){
        if(board[0] == "X" && board[1] == "X" && board[2] == "X")
            return false;
        if(board[3] == "X" && board[4] == "X" && board[5] == "X")
            return false;
        if(board[6] == "X" && board[7] == "X" && board[8] == "X")
            return false;
        if(board[0] == "X" && board[3] == "X" && board[6] == "X")
            return false;
        if(board[1] == "X" && board[4] == "X" && board[7] == "X")
            return false;
        if(board[2] == "X" && board[5] == "X" && board[8] == "X")
            return false;
        if(board[0] == "X" && board[4] == "X" && board[8] == "X")
            return false;
        if(board[2] == "X" && board[4] == "X" && board[6] == "X")
            return false;
        
        if(board[0] == "O" && board[1] == "O" && board[2] == "O")
            return false;
        if(board[3] == "O" && board[4] == "O" && board[5] == "O")
            return false;
        if(board[6] == "O" && board[7] == "O" && board[8] == "O")
            return false;
        if(board[0] == "O" && board[3] == "O" && board[6] == "O")
            return false;
        if(board[1] == "O" && board[4] == "O" && board[7] == "O")
            return false;
        if(board[2] == "O" && board[5] == "O" && board[8] == "O")
            return false;
        if(board[0] == "O" && board[4] == "O" && board[8] == "O")
            return false;
        if(board[2] == "O" && board[4] == "O" && board[6] == "O")
            return false;
        
        return true;
    }

    static String player = "X";
    public static void main(String[] args){
        int i = 0;
        while(i < 9 && checkForWin()){
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