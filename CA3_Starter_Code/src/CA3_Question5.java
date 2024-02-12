import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *  Name: Ida Tehlarova
 *  Class Group: GD2b
 */

public class CA3_Question5
{

    public static void main(String[] args)
    {
        System.out.println("Type if you want to put flights in takeoff queue or land queue, next to clear queues and quit for ending the program: ");
        Queue<String> takeoff = new LinkedList<>();
        Queue<String> land = new LinkedList<>();
        Scanner inp = new Scanner(System.in);
        String command = inp.nextLine();

        while (!"quit".equals(command)){

            if (command.equals("takeoff")) {
                System.out.println("Type your flight number: ");
                command = inp.nextLine();
                takeoff.add(command);
            }else if (command.equals("land")){
                System.out.println("Type your flight number: ");
                command = inp.nextLine();
                land.add(command);
            } else{
                System.out.println("Misspelled command, try again!");
            }
            if(command.equals("next")){
                if(!land.isEmpty()){
                    String x = land.poll();
                    System.out.println(x);
                }else if (!takeoff.isEmpty()){
                    String y = takeoff.poll();
                    System.out.println(y);
                }else{
                    System.out.println("No more planes!");
                }
            }
            System.out.println("Type if you want to put flights in takeoff queue or land queue, next to clear queues and quit for ending the program: ");
            command = inp.nextLine();

        }


        //takeoff.offer("Flight-100");
        //System.out.println(takeoff);
    }
}
