# BIG 5

### Group Members :

Anda Gwele 

Lathitha Nongauza

Luphumlo Hamla

Tshiamo Khosana


### Group Mentor : Sihle Sithole
### Project Title : Tic Tac Toe 
### Project Page : Tic Tac Toe Game

************
INSTRUCTIONS
************
We as the Big 5 we have 2 versions of Tic Tac Toe, we have the demo version and the android studio version.
The Demo version has to be run on the terminal and the android studio version has to be run on Android Studio.
Note: we also have a Mathematics game that Prints a mathematical expression and ask the user for the answer, this game is only a demo version it doesn't have an Android Studio version yet.
*****
TOOLS
*****
We have used android studio to build the apk; and use text editors (sublime, Visual studio code, notepad++) to write the codes for the demos.
********
CONCEPTS
********
***********
ASSUMPTIONS
***********
All our codes are original, and our games (the demos, and the android studio version) works pretty well with very little errors, that only a very good programmer can find them.
***********
LIMITATIONS
***********

*************************************
DOCUMENTATION AND CODING CONVENTIONS
*************************************
This section is included to ensure consistent code throughout the project.

### **Documentation:**
All methods/functions must include descriptive information about the method operations,parameters and return. 
All single line comments apply to code directly underneath.

**Single line comment:** //everything to the right of the slashes is a comment.

**Multi line comments:** 

                      /*                 
                      * everything                     
                      * between '/*'           
                      * and '*/'
                      * is a
                      * comment
                      */
**Javadoc:** 

          /**
          * explain what the method does.
          * @param x describe the parameter
          * @return explain what is returned
          */

          javadoc must appear directly above the class/method declaration.

**EXAMPLE:**

                /**
                * this method converts a temperature from celcius to fehrenheit and vice-versa.
                * @param t t(double) is the temperature that will be converted.
                * @param u u(string) is tells us if the temperature entered is celcuis or fehrenheit.
                * @return non-returning method, but prints the result.
                */
            static void tempConversion(double t, String u)
            {
                if(u.equals("c")){      //checks if the temperature is in celcius.
                   System.out.println(t +" "+u.toUpperCase() +" " + "is " + (t*1.8 +32) +" "+"F");
                   return;
                }else if(u.equals("f")){      //checks if the temperature is in fehrenheit.
                    System.out.println(t +" "+u.toUpperCase() +" " + "is " +((t-32.0)*(5.0/9.0))+" "+"C" );
                    return;
                }
                System.out.println("Invalid input");    // if u is neither celcuis or fehrenheit.
            }
 
   
### **Coding**

It is important to use self explanatory variable names. This makes reading your code easier.

### **TBA**
    
