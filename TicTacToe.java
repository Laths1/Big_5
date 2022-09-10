import java.util.*; //this star calls all the classes and methods on java including the Array one
public class TicTacToe{

    public static void main(String[] args){
         // listing all solution combinations. 
         ArrayList<Integer> row_1 = new ArrayList<>(Arrays.asList(0,1,2));
         ArrayList<Integer> row_2 = new ArrayList<>(Arrays.asList(3,4,5));
         ArrayList<Integer> row_3 = new ArrayList<>(Arrays.asList(6,7,8));
         ArrayList<Integer> column_1 = new ArrayList<>(Arrays.asList(0,3,6));
         ArrayList<Integer> column_2 = new ArrayList<>(Arrays.asList(1,4,7));
         ArrayList<Integer> column_3 = new ArrayList<>(Arrays.asList(2,5,8));
         ArrayList<Integer> diagonal_1 = new ArrayList<>(Arrays.asList(0,4,8));
         ArrayList<Integer> diagonal_2 = new ArrayList<>(Arrays.asList(2,4,6));
 
         //combining all solution into one list.
         ArrayList<ArrayList<Integer>> solutions = new ArrayList<ArrayList<Integer>>();
         solutions.add(row_1);
         solutions.add(row_2);
         solutions.add(row_3);
         solutions.add(column_1);
         solutions.add(column_2);
         solutions.add(column_3);
         solutions.add(diagonal_1);
         solutions.add(diagonal_2);
 
        Game(solutions);
    }
    public static int userInput(String s){      
        //gets input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter" +" "+s+":");
        return sc.nextInt(); 
    }
    /**checkEmptyIndex
     * This method checks if the user chose an empty index to enter X or O.If an index contains a value, this method is called again until the user chooses an empty index.
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
    /**checkAnswer
     * This method compares the position on the borad with valid solutions.
     * @param solutions ArrayList of valid possible solutions.
     * @param cArray 3x3 matrix of the game.
     * @return returns false if length of solutions is 0, this would be a draw. returns true if the position on the board matches with a valid solution.
     */
    public static boolean checkAnswer(ArrayList<ArrayList<Integer>>solutions,int[][] cArray){
        System.out.println(solutions.size());
        int[] indices ={cArray[0][0],cArray[0][1],cArray[0][2],
                        cArray[1][0],cArray[1][1],cArray[1][2],
                        cArray[2][0],cArray[2][1],cArray[2][2]};

        ArrayList<ArrayList<Integer>> sols =possibleSolution(solutions,cArray);
        // System.out.println(sols);
        // if there are no possible solution, return false.
        if(sols.size()==0) return false;
        //check the possible solutions for a win.
        for(int i=0;i<sols.size();i++){
            //check if the number at index x is not equal to 0 and if its equal to number at index y and z respectively.
            ArrayList<Integer> ans =sols.get(i);
            if((indices[ans.get(0)]!=0)&&(indices[ans.get(1)]!=0)&&(indices[ans.get(2)]!=0)){
                if( (indices[ans.get(0)]==indices[ans.get(1)]) && 
                    (indices[ans.get(0)]==indices[ans.get(2)]) && 
                    (indices[ans.get(1)]==indices[ans.get(2)])){ 
            System.out.println(indices[ans.get(0)]+" "+"wins");
            return true; 
                }
            }
        }
        return false;
    }
    /**frequencyCount
     * This method counts how many times a certain number occurs within the possible solutions
     * @param lst ArrayList of solution combination
     * @param num The number that is counted
     * @param cArray 3x3 matrix of the game
     * @return The frequency of the given number
     */
    public static int frequencyCount(ArrayList<Integer> lst, int num, int[][] cArray){
        int[] indices ={cArray[0][0],cArray[0][1],cArray[0][2],
                        cArray[1][0],cArray[1][1],cArray[1][2],
                        cArray[2][0],cArray[2][1],cArray[2][2]};
        int count =0;
        for(int i: lst){
            if(indices[i]==num) count+=1; 
        }
        return count;
    }
    /**possibleSolution:
     * This method checks for valid solutions.The indices for the solutions are grouped in an arrayList.A solution is valid if all the values in that group are the same.If there exists at least one value that is different to others, the solution is eliminated.
     * @param sol All the possible solutions in an arraylist.
     * @param pArray 3x3 matrix of the game.
     * @return returns an arraylist containing valid solutions.
     */
    public static ArrayList<ArrayList<Integer>> possibleSolution(ArrayList<ArrayList<Integer>> sol,int[][]pArray){ 
        // System.out.println(sol.size());
        ArrayList<Integer> empty = new ArrayList<Integer>();   
       //checking if row 1 is an invalid option.
       if(frequencyCount(sol.get(0),6,pArray)>=1 && frequencyCount(sol.get(0),3,pArray)>=1) sol.set(0,empty );
       //checking if row 2 is an invalid option.
       if(frequencyCount(sol.get(1),6,pArray)>=1 && frequencyCount(sol.get(1),3,pArray)>=1) sol.set(1,empty );
       //checking if row 3 is an invalid option.
       if(frequencyCount(sol.get(2),6,pArray)>=1 && frequencyCount(sol.get(2),3,pArray)>=1) sol.set(2,empty );
       //checking if column 1 is an invalid option.
       if(frequencyCount(sol.get(3),6,pArray)>=1 && frequencyCount(sol.get(3),3,pArray)>=1) sol.set(3,empty );
       //checking if column 2 is an invalid option.
       if(frequencyCount(sol.get(4),6,pArray)>=1 && frequencyCount(sol.get(4),3,pArray)>=1) sol.set(4,empty );
       //checking if column 3 is an invalid option.
       if(frequencyCount(sol.get(5),6,pArray)>=1 && frequencyCount(sol.get(5),3,pArray)>=1) sol.set(5,empty );
       //checking diagonal 1 is an invalid option.
       if(frequencyCount(sol.get(6),6,pArray)>=1 && frequencyCount(sol.get(6),3,pArray)>=1) sol.set(6,empty );
       //checking diagonal 2 is an invalid option.
       if(frequencyCount(sol.get(7),6,pArray)>=1 && frequencyCount(sol.get(7),3,pArray)>=1) sol.set(7,empty );
       
    // copying sol array
    ArrayList<ArrayList<Integer>> sol2 = new ArrayList<ArrayList<Integer>>();
    for(ArrayList<Integer> i:sol){
        sol2.add(i);
    }
    // removing empty arraylist from sol
       int cnt=0;
       for(ArrayList<Integer> i:sol){
          if(i.size()==0){
             sol2.remove(cnt);
             cnt-=1;
          }
          cnt+=1;
       }
        return sol2;
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
    public static void Game(ArrayList<ArrayList<Integer>> solutions){
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
            //prints 2d array.
            displayGame(array);
            // checks for solutions after the 4th move.
            if(checkAnsCounter>3){     
                if(checkAnswer(solutions,array)==true) return;
            }
            checkAnsCounter+=1;  
        }
        System.out.println("Draw");
    }
}
