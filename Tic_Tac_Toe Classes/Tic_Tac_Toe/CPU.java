import java.io.*;
import java.util.Random;
import java.util.Scanner;
class CPUA{

    public static String arr[][] = { {"1.1","2.1","3.1"}, {"1.2","2.2","3.2"},{"1.3","2.3","3.3"}};;// array position(column.row)
    public static String chra;
    public static String chara;
    public static int wins,losses,row,column,cnt ;

    public  CPUA(String arr[][]){
        this.arr = arr;
        this.chra = chra; // user 
        this.chara = chara; // computer

    } //constructor
    
     public static void Board(){ // displaying of board
        try{
 
        
  
          
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("|");
              
                System.out.print(" ");
                System.out.print(arr[i][j] + " ");
                System.out.print("|");
                
           
                }
               System.out.println();  
               System.out.println("-----------------------"); 
               
            }
 
            System.out.println();
        
        }
        catch(Exception e){
            System.out.print("error");
        }
  
} 
public static void GPU(){ //                                                       game starting 
       cnt = 0;

    System.out.println("Choose character( y <x> or <o>)");
    Scanner in = new Scanner(System.in);
    String chra = in.nextLine();
    
    System.out.println("enter opposite character for the computer to use <x> or <o>");
     in = new Scanner(System.in);
   String chara = in.nextLine();


    for(int i = 0;i < 5;i++){
  System.out.println("enter row");
    in = new Scanner(System.in);
    row = in.nextInt(); //row input
    System.out.println("enter column");
     in = new Scanner(System.in);
    column = in.nextInt(); // column input

   arr[row-1][column-1] = chra;
   Board();
   Random random = new Random();
   arr[random.nextInt(1,3)-1][random.nextInt(1,3)-1] = chara;
   Board();
   cnt++;
   if(cnt ==3){
    System.out.println("suppose to check for winner at this point");
   }
  
    }

}
 
}

     
