import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.Scanner;

/**
 *  Name:Ida Tehlarova
 *  Class Group:GD2b
 */
public class CA3_Question1
{
    public static void runSimulation()
    {
        CA3_Question1 q = new CA3_Question1();
        q.parkingStack1();
    }

    public void parkingStack1 (){
        Deque<Integer> street = new ArrayDeque<>();
        Deque<Integer> parking = new ArrayDeque<>();

        System.out.println("Write positive and negative numbers to add od remove numbers, \"0\" for exit");

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while(i!=0){
            if (i<0){
               int remove = Math.abs(i);
               int move = street.peek();
               while (move!= remove-1)
               {
                   street.pop();
                   parking.push(move);
                   move =  move-1;
               }
               i = in.nextInt();
            }else{
                street.push(i);
                i= in.nextInt();
            }
        }
        System.out.println(street);
        System.out.println(parking);

    }

    public static void main(String[] args) {
        runSimulation();
    }
}
