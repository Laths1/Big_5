import java.util.Scanner;
import java.util.Arrays;
public class TicTacToe{

    public static void main(String[] args){
        Game();
    }
    public static int userInput(String s){      //gets input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter" +" "+s+":");
        return sc.nextInt();
    }
    /**
     * checkEmptyIndex
     * @param eArray 3x3 matrix of the game
     * @param v is int array of row and column
     * @return integer array containing row and column
     */
    public static int[] checkEmptyIndex(int[][] eArray, int[] v)
    
    {        
        int row = userInput("row");     //gets row index.
        int column = userInput("column");       //gets column index.
        int[] values = v;        //creates array to store row an column.
        if(eArray[row][column]==0)
        // checks if the chosen index is unchanged
        {
            values[0]=row; 
            values[1]=column; 
            return values;
        }else
        //if its been changed, this method is called again.
        {
            System.out.println("Index is occupied");
            checkEmptyIndex(eArray,values);
        }
         return values;  
    }
    public static boolean checkAnswer(int[][] cArray){
        
        return true;
    }
    public static void displayGame(int[][] dArray){
        for(int i=0; i<dArray.length; i++) {
            // inner loop for column
            for(int j=0; j<dArray[0].length; j++) {
                System.out.print("|");
                System.out.print(" ");
                System.out.print(dArray[i][j] + " ");
                System.out.print("|");
            }
            System.out.println(); // new line
            System.out.println("---------------"); // new line
          }
    }
    
    public static void Game()
    /**
     * Creats 2D array of the TicTacToe game.
     * @return void
     */
    {
        int[][] array= new int[3][3];       //3x3 matrix.
        int checkAnsCounter=0;
        int x_o_flipper=3;      
        int[] row_column=new int[2];
        for(int turnCounter=0; turnCounter<9;turnCounter++){
            row_column=checkEmptyIndex(array,row_column);
            array[row_column[0]][row_column[1]] = x_o_flipper;

            if(x_o_flipper == 3){       // if o is entered, then the next value is 1.
                x_o_flipper=6;
            }else{
                x_o_flipper=3;
            }

            if(checkAnsCounter>3){      // checks for solutions after the 4th move.
                checkAnswer(array);
            }
            displayGame(array);     //prints 2d array.
        }
    }
}