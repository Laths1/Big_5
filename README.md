# BIG 5

### Group Members :

Anda Gwele 

Lathitha Nongauza

Luphumlo Hamla

Tshiamo Khosana

Uyazi Yako

### Group Mentor : Sihle Sithole
### Project Title :
### Project Page :

************
INSTRUCTIONS
************
*****
TOOLS
*****
********
CONCEPTS
********
***********
ASSUMPTIONS
***********
***********
LIMITATIONS
***********
*************************************
DOCUMENTATION AND CODING CONVENTIONS
*************************************
This section is included to ensure consistent code throughout the project.

### **Documentation:**
All methods/functions must include descriptive information about the method operations,parameters and return. 

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
    
