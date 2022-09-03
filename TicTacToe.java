import java.util.*; //this star calls all the classes and methods on java including the Array one
public class TicTacToe{

    public static void main(String[] args){
        Game();
    }
    public static int userInput(String s){      
        //gets input from user.
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
    public static int[] checkEmptyIndex(int[][] eArray, int[] v){ 
        //gets row index.       
        int row = userInput("row"); 
        //gets column index.    
        int column = userInput("column"); 
         //creates array to store row and column indices.     
        int[] values = v;     
        
        // checks if the chosen index is unchanged
        if(eArray[row][column]==0){
            values[0]=row; 
            values[1]=column; 
            return values;
        }
        //if its been changed, checkEmptyIndex is called again.
        else{
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
            //Horizontal line.
            System.out.println(); 
            System.out.println("---------------"); 
          }
    }
    
    
    /**
     * Game
     * The 3x3 matrix is declared.Includes alternating X and O
     * @retun void
     */
    public static void Game(){
        //3x3 matrix.
        int[][] array= new int[3][3];  

        int checkAnsCounter=0;
        int x_o_flipper=3;      
        int[] row_column=new int[2];
        for(int turnCounter=0; turnCounter<9;turnCounter++){
            row_column=checkEmptyIndex(array,row_column);
            array[row_column[0]][row_column[1]] = x_o_flipper;
             // if o is entered, then the next value is 1.
            if(x_o_flipper == 3){      
                x_o_flipper=6;
            }else{
                x_o_flipper=3;
            }
            // checks for solutions after the 4th move.
            if(checkAnsCounter>3){      
                checkAnswer(array);
            }
            //prints 2d array.
            displayGame(array);     
        }
    }
}
