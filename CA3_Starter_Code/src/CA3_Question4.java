import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 *  Name: Ida Tehlarova
 *  Class Group: GD2b
 */
public class CA3_Question4 {

    /*
        filename: name of the file to test.
     */
    public static boolean validate(String filename) throws FileNotFoundException
    {
        Scanner fin = new Scanner(new File("\"C:\\Users\\idate\\OneDrive\\Dokumenty\\tags_valid.txt\""));
        Stack<Character> myStack = new Stack<>();

        while (fin.hasNextLine()) {
            Scanner in = new Scanner(fin.nextLine());
            while (in.hasNext()) {

            }
        }




        return false;
    }

    /*
        This function tests the files in the files array to see if
         they are valid.
         tags_valid.txt should return true;
         tags_invalid.txt should output as invalid;


     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] files = {"tags_valid.txt", "tags_invalid.txt"};
        for(String fName: files) {
            System.out.print(fName +": ");
            if (validate(fName)) {
                System.out.println("This file is valid");
            } else {
                System.out.println("This file is invalid");
            }
        }
    }
}
