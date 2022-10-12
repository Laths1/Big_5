import java.util.*;

//THIS IS LEVEL 1 I NEED TO DO 2 MORE LEVELS


public class Math
{
	//START OF STAGE 1

	//In this function i am creating 5 random numbers
	// which are all less than 10
	public static void Number()
	{
		System.out.println();
		System.out.println("Welcome to stage 1");
		System.out.println();
		//creating 5 random numbers 

		Random num1= new Random();
		int Num1= num1.nextInt(10);
		
		Random num2= new Random();	
		int Num2= num2.nextInt(10)+1;		

		Random num3= new Random();	
		int Num3= num3.nextInt(10)-1;
		
		Random num4= new Random();	
		int Num4= num4.nextInt(10)+2;

		Random num5= new Random();	
		int Num5= num5.nextInt(10)-2;

		// done creating those 5 random numbers

		//creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
		int Wrongcount=0; //if the user input wrong number 
		int Rightcount=0; //if the user input correct number
		int triesW=3; //if user keeps entering wrong numbers


		//creating scanner which will take user input
		Scanner user1 = new Scanner(System.in);
		
		
		//creating a loop that will compare the user input with the answer that we want.
		while(Wrongcount<4)
		{
			System.out.println("Solve : ");
			System.out.println(Num1+" + "+ Num2+ " + "+ Num3+" + " +Num4+ " + " + Num5+ " =  ");
			int Answer1= Num1+Num2+Num3+Num4+Num5;

			//this gives the user another chance if he/she didn't get the answer right on the first try...
			try
			{
				int User1=user1.nextInt();
				System.out.println("Enter your answer..."+ User1);
				Rightcount++;

				if( Rightcount<4 && Answer1!=User1)
					{
					System.out.println("Try again...");
					//System.out.println("Enter your answer: "+User1);
					
						if (Rightcount==3 && User1!=Answer1)
						{
							
							System.out.println("You have ran out of lucks!..");
							System.out.println("The answer is = "+ Answer1);
							System.out.println("Better Luck next Time!..");
							break;
						}
						else if (Rightcount !=3 && User1==Answer1)
						{
							// im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
							System.out.println("Congratulations you've got it after "+ Rightcount+" Tries !");
							Number1();
							break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
						}
				}
			

				//this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
				else if (Answer1==User1) 
				{
					System.out.println("Congratulations you've got it" );
					System.out.println("You got it after "+Rightcount+" tries");
					Number1();
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

	// END OF STAGE 1


	//START OF STAGE 2

    //In this function i am creating 5 random numbers which are all less than 10

    public static void Number1()
    {
    	System.out.println();
        System.out.println("Welcome to stage 2");
        System.out.println();
        //creating 5 random numbers 

        Random n1= new Random();
        int N1= n1.nextInt(10);
        
        Random n2= new Random();  
        int N2= n2.nextInt(10)+1;       

        Random n3= new Random();  
        int N3= n3.nextInt(10)-1;
        
        Random n4= new Random();  
        int N4= n4.nextInt(10)+2;

        Random n5= new Random();  
        int N5= n5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount1=0; //if the user input wrong number 
        int Rightcount1=0; //if the user input correct number
        int triesW1=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user2 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount1<4)
        {
            System.out.println("Solve : ");
            System.out.println(N1+" - "+ N2+ " - "+ N3+" - " +N4+ " - " + N5+ " =  ");
            int Answer2= N1-N2-N3-N4-N5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User2=user2.nextInt();
                System.out.println("Enter your answer..."+ User2);
                Rightcount1++;

                if( Rightcount1<4 && Answer2!=User2)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount1==3 && User2!=Answer2)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer2);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount1 !=3 && User2==Answer2)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount1+" Tries !");
                            Number2();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer2==User2) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount1+" tries");
                    Number2();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount1++;
                System.out.println("You have "+triesW1+" tries left");
                triesW1--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user2 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 2


    //START OF STAGE 3
     public static void Number2()
    {   
        System.out.println();
        System.out.println("Welcome to stage 3");
        System.out.println();
        //creating 5 random numbers 

        Random nu1= new Random();
        int Nu1= nu1.nextInt(10);
        
        Random nu2= new Random();  
        int Nu2= nu2.nextInt(10)+1;       

        Random nu3= new Random();  
        int Nu3= nu3.nextInt(10)-1;
        
        Random nu4= new Random();  
        int Nu4= nu4.nextInt(10)+2;

        Random nu5= new Random();  
        int Nu5= nu5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount2=0; //if the user input wrong number 
        int Rightcount2=0; //if the user input correct number
        int triesW2=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user3 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount2<4)
        {
            System.out.println("Solve : ");
            System.out.println(Nu1+" * "+ Nu2+ " * "+ Nu3+" * " +Nu4+ " * " + Nu5+ " =  ");
            int Answer3= Nu1*Nu2*Nu3*Nu4*Nu5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User3=user3.nextInt();
                System.out.println("Enter your answer..."+ User3);
                Rightcount2++;

                if( Rightcount2<4 && Answer3!=User3)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount2==3 && User3!=Answer3)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer3);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount2 !=3 && User3==Answer3)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount2+" Tries !");
                            Number3();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer3==User3) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount2+" tries");
                    Number3();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount2++;
                System.out.println("You have "+triesW2+" tries left");
                triesW2--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user3 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 3


    //START OF STAGE 4
     //In this function i am creating 5 random numbers which are all less than 10

    public static void Number3()
    {   
        System.out.println();
        System.out.println("Welcome to stage 4");
        System.out.println();
        //creating 5 random numbers 

        Random nums1= new Random();
        int Nums1= nums1.nextInt(10);
        
        Random nums2= new Random();  
        int Nums2= nums2.nextInt(10)+1;       

        Random nums3= new Random();  
        int Nums3= nums3.nextInt(10)-1;
        
        Random nums4= new Random();  
        int Nums4= nums4.nextInt(10)+2;

        Random nums5= new Random();  
        int Nums5= nums5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount3=0; //if the user input wrong number 
        int Rightcount3=0; //if the user input correct number
        int triesW3=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user4 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount3<4)
        {
            System.out.println("Solve : ");
            System.out.println(Nums1+" ÷ "+ Nums2+ " ÷ "+ Nums3+" ÷ " +Nums4+ " ÷ " + Nums5+ " =  ");
            int Answer4= Nums1/Nums2/Nums3/Nums4/Nums5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User4=user4.nextInt();
                System.out.println("Enter your answer..."+ User4);
                Rightcount3++;

                if( Rightcount3<4 && Answer4!=User4)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount3==3 && User4!=Answer4)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer4);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount3 !=3 && User4==Answer4)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount3+" Tries !");
                            Number4();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer4==User4) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount3+" tries");
                    Number4();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount3++;
                System.out.println("You have "+triesW3+" tries left");
                triesW3--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user4 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 4


    //START OF STAGE 5
     public static void Number4()
    {   
        System.out.println();
        System.out.println("Welcome to stage 5");
        System.out.println();
        //creating 5 random numbers 

        Random numS1= new Random();
        int NumS1= numS1.nextInt(10);
        
        Random numS2= new Random();  
        int NumS2= numS2.nextInt(10)+1;       

        Random numS3= new Random();  
        int NumS3= numS3.nextInt(10)-1;
        
        Random numS4= new Random();  
        int NumS4= numS4.nextInt(10)+2;

        Random numS5= new Random();  
        int NumS5= numS5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount4=0; //if the user input wrong number 
        int Rightcount4=0; //if the user input correct number
        int triesW4=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user5 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount4<4)
        {
            System.out.println("Solve : ");
            System.out.println(NumS1+" + "+ NumS2+ " - "+ NumS3+" * " +NumS4+ " ÷ " + NumS5+ " =  ");
            int Answer5= NumS1+NumS2-NumS3*NumS4/NumS5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User5=user5.nextInt();
                System.out.println("Enter your answer..."+ User5);
                Rightcount4++;

                if( Rightcount4<4 && Answer5!=User5)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount4==3 && User5!=Answer5)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer5);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount4 !=3 && User5==Answer5)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount4+" Tries !");
                            Number5();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer5==User5) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount4+" tries");
                    Number5();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount4++;
                System.out.println("You have "+triesW4+" tries left");
                triesW4--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user5 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 5


    //START OF STAGE 6  IM NOT SURE IF THIS IS GOING TO WORK BUT IM TRYING, PLEASE GOD LET IT WORK





    //In this function i am creating 5 random numbers
	// which are all less than 10
	public static void Number5()
	{
		System.out.println();
		System.out.println("Welcome to stage 6");
		System.out.println();
		//creating 5 random numbers 

		Random num1= new Random();
		int Num1= num1.nextInt(10);
		
		Random num2= new Random();	
		int Num2= num2.nextInt(10)+1;		

		Random num3= new Random();	
		int Num3= num3.nextInt(10)-1;
		
		Random num4= new Random();	
		int Num4= num4.nextInt(10)+2;

		Random num5= new Random();	
		int Num5= num5.nextInt(10)-2;

		// done creating those 5 random numbers

		//creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
		int Wrongcount=0; //if the user input wrong number 
		int Rightcount=0; //if the user input correct number
		int triesW=3; //if user keeps entering wrong numbers


		//creating scanner which will take user input
		Scanner user1 = new Scanner(System.in);
		
		
		//creating a loop that will compare the user input with the answer that we want.
		while(Wrongcount<4)
		{
			System.out.println("Solve : ");
			System.out.println(Num1+" + "+ Num2+ " + "+ Num3+" + " +Num4+ " + " + Num5+ " =  ");
			int Answer1= Num1+Num2+Num3+Num4+Num5;

			//this gives the user another chance if he/she didn't get the answer right on the first try...
			try
			{
				int User1=user1.nextInt();
				System.out.println("Enter your answer..."+ User1);
				Rightcount++;

				if( Rightcount<4 && Answer1!=User1)
					{
					System.out.println("Try again...");
					//System.out.println("Enter your answer: "+User1);
					
						if (Rightcount==3 && User1!=Answer1)
						{
							
							System.out.println("You have ran out of lucks!..");
							System.out.println("The answer is = "+ Answer1);
							System.out.println("Better Luck next Time!..");
							break;
						}
						else if (Rightcount !=3 && User1==Answer1)
						{
							// im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
							System.out.println("Congratulations you've got it after "+ Rightcount+" Tries !");
							Number6();
							break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
						}
				}
			

				//this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
				else if (Answer1==User1) 
				{
					System.out.println("Congratulations you've got it" );
					System.out.println("You got it after "+Rightcount+" tries");
					Number6();
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

	// END OF STAGE 6


	//START OF STAGE 7

    //In this function i am creating 5 random numbers which are all less than 10

    public static void Number6()
    {
    	System.out.println();
        System.out.println("Welcome to stage 7");
        System.out.println();
        //creating 5 random numbers 

        Random n1= new Random();
        int N1= n1.nextInt(10);
        
        Random n2= new Random();  
        int N2= n2.nextInt(10)+1;       

        Random n3= new Random();  
        int N3= n3.nextInt(10)-1;
        
        Random n4= new Random();  
        int N4= n4.nextInt(10)+2;

        Random n5= new Random();  
        int N5= n5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount1=0; //if the user input wrong number 
        int Rightcount1=0; //if the user input correct number
        int triesW1=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user2 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount1<4)
        {
            System.out.println("Solve : ");
            System.out.println(N1+" - "+ N2+ " - "+ N3+" - " +N4+ " - " + N5+ " =  ");
            int Answer2= N1-N2-N3-N4-N5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User2=user2.nextInt();
                System.out.println("Enter your answer..."+ User2);
                Rightcount1++;

                if( Rightcount1<4 && Answer2!=User2)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount1==3 && User2!=Answer2)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer2);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount1 !=3 && User2==Answer2)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount1+" Tries !");
                            Number7();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer2==User2) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount1+" tries");
                    Number7();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount1++;
                System.out.println("You have "+triesW1+" tries left");
                triesW1--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user2 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 6


    //START OF STAGE 8
     public static void Number7()
    {   
        System.out.println();
        System.out.println("Welcome to stage 8");
        System.out.println();
        //creating 5 random numbers 

        Random nu1= new Random();
        int Nu1= nu1.nextInt(10);
        
        Random nu2= new Random();  
        int Nu2= nu2.nextInt(10)+1;       

        Random nu3= new Random();  
        int Nu3= nu3.nextInt(10)-1;
        
        Random nu4= new Random();  
        int Nu4= nu4.nextInt(10)+2;

        Random nu5= new Random();  
        int Nu5= nu5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount2=0; //if the user input wrong number 
        int Rightcount2=0; //if the user input correct number
        int triesW2=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user3 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount2<4)
        {
            System.out.println("Solve : ");
            System.out.println(Nu1+" * "+ Nu2+ " * "+ Nu3+" * " +Nu4+ " * " + Nu5+ " =  ");
            int Answer3= Nu1*Nu2*Nu3*Nu4*Nu5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User3=user3.nextInt();
                System.out.println("Enter your answer..."+ User3);
                Rightcount2++;

                if( Rightcount2<4 && Answer3!=User3)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount2==3 && User3!=Answer3)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer3);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount2 !=3 && User3==Answer3)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount2+" Tries !");
                            Number8();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer3==User3) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount2+" tries");
                    Number8();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount2++;
                System.out.println("You have "+triesW2+" tries left");
                triesW2--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user3 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 8


    //START OF STAGE 9
     //In this function i am creating 5 random numbers which are all less than 10

    public static void Number8()
    {   
        System.out.println();
        System.out.println("Welcome to stage 4");
        System.out.println();
        //creating 5 random numbers 

        Random nums1= new Random();
        int Nums1= nums1.nextInt(10);
        
        Random nums2= new Random();  
        int Nums2= nums2.nextInt(10)+1;       

        Random nums3= new Random();  
        int Nums3= nums3.nextInt(10)-1;
        
        Random nums4= new Random();  
        int Nums4= nums4.nextInt(10)+2;

        Random nums5= new Random();  
        int Nums5= nums5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount3=0; //if the user input wrong number 
        int Rightcount3=0; //if the user input correct number
        int triesW3=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user4 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount3<4)
        {
            System.out.println("Solve : ");
            System.out.println(Nums1+" ÷ "+ Nums2+ " ÷ "+ Nums3+" ÷ " +Nums4+ " ÷ " + Nums5+ " =  ");
            int Answer4= Nums1/Nums2/Nums3/Nums4/Nums5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User4=user4.nextInt();
                System.out.println("Enter your answer..."+ User4);
                Rightcount3++;

                if( Rightcount3<4 && Answer4!=User4)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount3==3 && User4!=Answer4)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer4);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount3 !=3 && User4==Answer4)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount3+" Tries !");
                            Number9();
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer4==User4) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount3+" tries");
                    Number9();
                    break;//this is temporaly
                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount3++;
                System.out.println("You have "+triesW3+" tries left");
                triesW3--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user4 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 9


    //START OF STAGE 10
     public static void Number9()
    {   
        System.out.println();
        System.out.println("Welcome to stage 5");
        System.out.println();
        //creating 5 random numbers 

        Random numS1= new Random();
        int NumS1= numS1.nextInt(10);
        
        Random numS2= new Random();  
        int NumS2= numS2.nextInt(10)+1;       

        Random numS3= new Random();  
        int NumS3= numS3.nextInt(10)-1;
        
        Random numS4= new Random();  
        int NumS4= numS4.nextInt(10)+2;

        Random numS5= new Random();  
        int NumS5= numS5.nextInt(10)-2;

        // done creating those 5 random numbers

        //creating an Int that will allow the user to repeat his/her answer 3 times if he/she doesn't get the answer right
        int Wrongcount4=0; //if the user input wrong number 
        int Rightcount4=0; //if the user input correct number
        int triesW4=3; //if user keeps entering wrong numbers


        //creating scanner which will take user input
        Scanner user5 = new Scanner(System.in);
        
        
        //creating a loop that will compare the user input with the answer that we want.
        while(Wrongcount4<4)
        {
            System.out.println("Solve : ");
            System.out.println(NumS1+" + "+ NumS2+ " - "+ NumS3+" * " +NumS4+ " ÷ " + NumS5+ " =  ");
            int Answer5= NumS1+NumS2-NumS3*NumS4/NumS5;

            //this gives the user another chance if he/she didn't get the answer right on the first try...
            try
            {
                int User5=user5.nextInt();
                System.out.println("Enter your answer..."+ User5);
                Rightcount4++;

                if( Rightcount4<4 && Answer5!=User5)
                    {
                    System.out.println("Try again...");
                    //System.out.println("Enter your answer: "+User1);
                    
                        if (Rightcount4==3 && User5!=Answer5)
                        {
                            
                            System.out.println("You have ran out of lucks!..");
                            System.out.println("The answer is = "+ Answer5);
                            System.out.println("Better Luck next Time!..");
                            break;
                        }
                        else if (Rightcount4 !=3 && User5==Answer5)
                        {
                            // im still thinking about this one but the goal here is to make this part of the code to direct the user to the second level
                            System.out.println("Congratulations you've got it after "+ Rightcount4+" Tries !");
                            System.out.println("Congratulations you have finished the game");
                            break;  //this is a temporary break code since im trying to figure out how to connect the code that will re direct me to the second level
                        }
                }
            

                //this is the asks the user if she/ he wants to go to the second level after she/he got the answer in the first try.
                else if (Answer5==User5) 
                {
                    System.out.println("Congratulations you've got it" );
                    System.out.println("You got it after "+Rightcount4+" tries");
                    System.out.println("Congratulations you have finished the game");
                    break;//this is temporaly

                }
            }

            catch(InputMismatchException e)
            {
                Wrongcount4++;
                System.out.println("You have "+triesW4+" tries left");
                triesW4--;
                System.out.println("Wrong input!,Try again...");
                //System.out.println("You have "+triesW+" tries left");
                user5 = new Scanner(System.in);

                continue;
            }
        }
    }

    // END OF STAGE 10


	public static void main(String[] args)
	{
		Number();
	}
}