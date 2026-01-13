// for 2 X 2 chess Board 
package BackTracking;



public class NQueens2X2 {

    public static void nqueen(char board[][] , int row ){
        //base case 
        if(row == board.length){
            printBoard(board);
            return;
        }
        

        //column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nqueen(board, row+1); // function call 
            board[row][j] = 'x'; // BackTracking Step
        }
    }


    public static void printBoard(char board[][]){
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");       
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 2 ; 
        char board[][] = new char[n][n];

        // initialize 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nqueen(board , 0 ); 
    }
}
