import java.util.*;
public class CheckWin {
    /**checkAnswer
     * This method compares the position on the borad with valid solutions.
     * @param solutions ArrayList of valid possible solutions.
     * @param cArray 3x3 matrix of the game.
     * @return returns false if length of solutions is 0, this would be a draw. returns true if the position on the board matches with a valid solution.
     */
    public boolean checkAnswer(ArrayList<ArrayList<Integer>>solutions,int[][] cArray){
        //System.out.println(solutions.size());
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
    private int frequencyCount(ArrayList<Integer> lst, int num, int[][] cArray){
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
    private ArrayList<ArrayList<Integer>> possibleSolution(ArrayList<ArrayList<Integer>> sol,int[][]pArray){ 
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
}
