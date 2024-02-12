import java.sql.SQLOutput;
import java.util.Scanner;
import  java.util.Stack;
/**
 *  Name: Ida Tehlarova
 *  Class Group: GD2b
 */
public class CA3_Question8 {

    /*
        Reads in an equation from the user
     */
        public static void main(String[] args) {
           Scanner in = new Scanner (System.in);
           Stack <Integer> results = new Stack <Integer>();
           System.out.println("Enter one number or operator per line, Q to quit");
           boolean done = false;
           while (!done){
               String input = in.nextLine();
               if (input.equals("+")){
                   results.push(results.pop()+results.pop());
               }else if(input.equals("-")){
                   Integer arg2 = results.pop();
                   results.push(results.pop() - arg2);
               }else if (input.equals("*") || input.equals("x")){
                   results.push(results.pop() * results.pop());
               }else if (input.equals("/")){
                   Integer arg2 = results.pop();
                   results.push(results.pop() / arg2);
               }else if (input.equals("Q") || input.equals ("q")){
                   done = true;
               }else{
                   results.push(Integer.parseInt(input));
               }
               System.out.println(results);
           }
        }
    }












