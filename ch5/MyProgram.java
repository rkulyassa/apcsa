/**
 * Ch 4 & 5 test review
 * 
 * @author Ryan Kulyassa
 * @date 10/12
*/

import java.util.Scanner;
public class MyProgram
{
   public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = kb.nextInt();
       
       // 1) Without changing data type of any variables or parameters, how can this error be fixed?
       printMultiples(number + "", 5);
       // adding "" will convert any primitive data type to string
       
       
       // 2) Without changing data types of price and roundedPrice, how can this error be fixed?
       double price = 34.2332;
       int roundedPrice = (int) Math.round(price);
       System.out.println(roundedPrice);
   }
   public static void printMultiples(String s, int times){
       String newString = "";
       for(int i = 0; i < times; i++){
           newString += s;
       }
       System.out.println(newString);
   }
   
}