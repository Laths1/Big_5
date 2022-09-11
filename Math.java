import java.util.*;

//THIS IS LEVEL 1 I NEED TO DO 2 MORE LEVELS
public class Math
{
    /**randomNumGenerator
     * This method generates a random number.
     * @param n Range from which a number is extracted.
     * @return number chosen.
     */
    public static int randomNumGenerator(int n){
        Random randomNum= new Random();
        return randomNum.nextInt(n);
    }
    /**stagePrinter
     * Prints the stage the user is doing.
     * @param n Integer value of the stage.
     */
    public static void stagePrinter(int n){
        System.out.println();
		System.out.println("Welcome to stage"+" "+n);
		System.out.println();
    }
    //STAGE 1 TO 10
	public static void level_1()
	{
        int stageCounter = 1;
        for(int i= 0;i<10;i++){
            //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
            int Wrongcount=0; //if the user input wrong number 
            int Rightcount=0; //if the user input correct number
            int triesW=3; //if user keeps entering wrong numbers

            //creating scanner which will take user input
            Scanner user1 = new Scanner(System.in);
            
            //creating a loop that will compare the user input with the answer that we want.
            int Answer=0;
            while(Wrongcount<4 && Rightcount<5)
            {
                stagePrinter(stageCounter);
                //creating 5 random numbers 
                int Num1=randomNumGenerator(10);
                int Num2= randomNumGenerator(10)+1;			
                int Num3= randomNumGenerator(10)-1;	
                int Num4= randomNumGenerator(10)+2;	
                int Num5= randomNumGenerator(10)-2;
                
                if(stageCounter==1||stageCounter==6){
                    System.out.println("Solve : ");
                    System.out.println(Num1+" + "+ Num2+ " + "+ Num3+" + " +Num4+ " + " + Num5+ " =  ");
                    Answer= Num1+Num2+Num3+Num4+Num5;
                }else
                if(stageCounter==2|| stageCounter ==7){
                    System.out.println("Solve : ");
                    System.out.println(Num1+" - "+ Num2+ " - "+ Num3+" - " +Num4+ " - " + Num5+ " =  ");
                    Answer= Num1-Num2-Num3-Num4-Num5;
                }else
                if(stageCounter==3|| stageCounter ==8){
                    System.out.println("Solve : ");
                    System.out.println(Num1+" * "+ Num2+ " * "+ Num3+" * " +Num4+ " * " + Num5+ " =  ");
                    Answer= Num1*Num2*Num3*Num4*Num5;
                }else
                if(stageCounter==4|| stageCounter ==9){
                    if(Num2==0) Num2+=1;    //Underminig division by 0 error.
                    System.out.println("Solve : ");
                    System.out.println(Num1+" ÷ "+ Num2+ " =  ");
                    Answer= Num1/Num2;
                }else
                if(stageCounter==5|| stageCounter ==10){
                    if(Num5==0) Num5+=1;    //Underminig division by 0 error.
                    System.out.println("Solve : ");
                    System.out.println(Num1+" + "+ Num2+ " - "+ Num3+" * " +Num4+ " ÷ " + Num5+ " =  ");
                    Answer= Num1+Num2-Num3*Num4/Num5;
                }

                //this gives the user another chance if he/she didn't get the answer right on the first try...
                try
                {
                    int User1=user1.nextInt();
                    System.out.println("Enter your answer..."+ User1);
                    Rightcount++;

                    if( Rightcount<4 && Answer!=User1)
                        {
                        System.out.println("Try again...");
                        //System.out.println("Enter your answer: "+User1);
                        
                            if (Rightcount==3 && User1!=Answer)
                            {
                                // The method is terminated if the user runs out of tries.
                                System.out.println("You have ran out of lucks!..");
                                System.out.println("The answer is = "+ Answer);
                                System.out.println("Better Luck next Time!..");
                                return;
                            }
                            else if (Rightcount !=3 && User1==Answer)
                            {
                                // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                                System.out.println("Congratulations you've got it after "+ Rightcount+" Tries !");
                                
                                break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                            }
                    }
                    //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                    else if (Answer==User1) 
                    {
                        System.out.println("Congratulations you've got it" );
                        System.out.println("You got it after "+Rightcount+" tries");
                        stageCounter+=1;
                        break;//this is temporaly
                    }
                }
                catch(InputMismatchException e)
                {
                    Wrongcount++;
                    System.out.println("You have "+triesW+" tries left");
                    triesW--;
                    System.out.println("Wrong input!,Try again...");
                    //System.out.println("You have "+triesW+" tries left");
                    user1 = new Scanner(System.in);

                    continue;
                }
            }
    }
	}
	// END OF STAGE 1 TO 10
    	public static void main(String[] args)
	{
		level_1();
	}
}
