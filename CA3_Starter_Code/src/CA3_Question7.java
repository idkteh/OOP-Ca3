import java.util.*;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question7
{
    /*
   Will repeatedly ask the user to enter the commands in the format
   buy company qty price
   or
   sell company qty price
   or
   quit
    */
    public static void main(String[] args) {
        double total_gain = 0;
        //Queue<CA3_Question6.Block> stock = new LinkedList<>();
        HashMap<String,Queue <CA3_Question6.Block>> stock = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String command="";
        do {
            System.out.print(">");
            command = in.next();
            if(command.equalsIgnoreCase("buy"))
            {
                System.out.println("Enter name of the company: ");
                String symbol = in.next();
                System.out.println("Enter the quantity of shares: ");
                int qty = in.nextInt();
                System.out.println("Enter the price of shares: ");
                double price = in.nextDouble();
                if(!stock.containsKey(symbol)){
                    stock.put(symbol, new LinkedList<>());
                }
                CA3_Question6.Block share = new CA3_Question6.Block(qty,price,symbol);
                stock.get(symbol).add(share);
            }
            else if(command.equals("sell"))
            {
                System.out.println("Enter name of the company: ");
                String symbol = in.next();

                System.out.println("Enter the quantity you want to sell: ");
                int qty = in.nextInt();

                System.out.println("Enter the price you want to sell for: ");
                double price = in.nextDouble();

                while(qty>0 &&!stock.isEmpty()){
                    CA3_Question6.Block peek = stock.get(symbol).peek();
                    double available_qty = peek.getShares();
                    if (available_qty <= qty){
                        qty = qty-peek.getShares();
                        double old_price = peek.getPrice();
                        double curren_price = price - old_price;
                        double gain = available_qty*curren_price;
                        System.out.println(gain);
                        total_gain+=gain;
                        stock.get(symbol).poll();
                    }else{  //it is running this
                        double old_price = peek.getPrice();
                        double curren_price = price - old_price;
                        double gain = qty*curren_price;
                        System.out.println(gain);
                        total_gain+=gain;
                        stock.get(symbol).poll();
                        qty = 0;


                    }
                }

            }
        }while(!command.equalsIgnoreCase("quit"));
        System.out.println(total_gain);
    }
}
