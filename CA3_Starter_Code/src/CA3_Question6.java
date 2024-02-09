import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *  Name: Ida Tehlarova
 *  Class Group: GD2b
 */
public class CA3_Question6
{
    public static class Block {
        private int shares;
        private double price;

        public Block(int shares, double price) {
            this.shares = shares;
            this.price = price;
        }

        public int getShares() {
            return shares;
        }

        public void setShares(int shares) {
            this.shares = shares;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "CA3_Question6.Block{" +
                    "shares=" + shares +
                    ", price=" + price +
                    '}';
        }
    }

    /*
    Will repeatedly ask the user to enter the commands in the format
    buy qty price
    or
    sell qty price
    or
    quit
     */
    public static void main(String[] args) {
        double total_gain = 0;
        Queue<Block> stock = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        String command="";
            do {
            System.out.print(">");
            command = in.next();
            if(command.equalsIgnoreCase("buy"))
            {
                System.out.println("Enter the quantity of shares: ");
                int qty = in.nextInt();
                System.out.println("Enter the price of shares: ");
                double price = in.nextDouble();
                Block share = new Block(qty,price);
                stock.add(share);
            }
            else if(command.equals("sell"))
            {
                System.out.println("Enter the quantity you want to sell: ");
                int qty = in.nextInt();

                System.out.println("Enter the price you want to sell for: ");
                double price = in.nextDouble();


                while(qty>0 &&!stock.isEmpty()){
                   Block peek = stock.peek();
                   double available_qty = peek.getShares();
                   if (available_qty <= qty){
                       qty = qty-peek.getShares();
                       double old_price = peek.getPrice();
                       double curren_price = price - old_price;
                       double gain = available_qty*curren_price;
                       System.out.println(gain);
                       total_gain+=gain;
                       stock.poll();
                   }else{  //it is running this
                       double old_price = peek.getPrice();
                       double curren_price = price - old_price;
                       double gain = qty*curren_price;
                       System.out.println(gain);
                       total_gain+=gain;
                       stock.poll();
                       qty = 0;


                   }
                }

            }
        }while(!command.equalsIgnoreCase("quit"));
        System.out.println(total_gain);
    }

}