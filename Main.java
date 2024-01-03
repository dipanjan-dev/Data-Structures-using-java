package Day1;
/*
 * TODAY IS 03/01/2024
 * TODAY'S TOPIC IS BASIC OF ARRAY 
 * 1. WHAT IS ARRAY
 * 2. CREATE AN ARRAY 
 * 3. PRINT AN ARRAY 
 * 4. USER DEFINE VALUE IN ARRAY WITH USER DEFINE SIZE
 * 5. OTHER PRINTING METHOD 
 * 
 */

import java.util.Scanner;

/*
  * ------------WHAT IS ARRAY? 
    ARRAY IS ONE TYPE OF DATA STRUCTURE, IN JAVA ARRAY IS CONTAIN SIGNLE DATA TYPE WHICH REFERS SOME VALUES
    IN JAVA ARRAY EACH ELEMENT HAS IT'S OWN INDEX NUMBER STARTING OF AN ARRAY INDEX IS 0


    THIS IS A BASIC ARRAY EXAMPLE WITH INDEX NUMBER REFERENCE : 
    ----------------------------------------------------
    | 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 | 100 |
    ----------------------------------------------------
     0     1    2    3    4    5    6    7    8    9   


     LE'S CREATE A REAL LIFE ARRAY :
  */

public class Main {
    public static void main(String[] args){
        // HERE WE ARE DEFINE NEW ARRAY WHICH HAS MEMORY CAPACITY IS 5 ( starting from 0 to 4) BECAUSE INDEXING IS STATING FROM 0.

        int arr[] = new int[5];
        // ADDING VALUE USING INDEX NUMBER
        // ***** BY DEFULT ARRAY ALL ELEMENT VALUE IS 0 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        // LET'S PRINT THE ARRAY USING FOR LOOP
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        /*  SO IN THIS LOOP WHAT WE ARE DOING  :- int i=0  here we are using  i as a index number and we are 
        increasing it following the arr.length method. in this method we can get the length of an array. 
        so as out i is increasing means we got the index number.
        then in System.out.println we are printing the value using i means index number .*/


        // USER DEFINE ARRAY OR DYNAMIC ARRAY MEANS IN THIS ARRAY EVERYTHING IS DEFINE BY THE USER 
        


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the memory size : ");
        int memory = sc.nextInt();
        
        int Dyarr[] = new int[memory];
        
        // SAME FOR LOOP FOR ADDING THE VALUE 
        for(int n=0;n<Dyarr.length;n++){
            Dyarr[n] = sc.nextInt();
        }

        for(int i=0;i<=Dyarr.length;i++){
            System.out.print(Dyarr[i]+",");
        }


        /* 
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
         *                                                  Index 3 out of bounds for length 3
         * 
         * -------------> THIS IS THE BASIC ISSUE WHEN SOME ONE WANT TO PRINT AN ARRAY INDEX OUT OF BOUNDS MEANS YOU WANT TO ACCESS MEMORY WHICH ARE NOT EVEN CREATED.
        */
    }
}
