import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
/**
 *  Name: Ida Tehlarova
 *  Class Group: GD2b
 */


// use hashmap
// if we use treemap the items are going to be in ascending order when we take them out
public class CA3_Question3
{
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, HashSet<Integer>> map = new TreeMap<>();
        Scanner fin = new Scanner(new File("CA3_Starter_Code/src/CA3_Question1.java"));
        int lineNumber = 1;
        while (fin.hasNextLine()) {
            Scanner in = new Scanner(fin.nextLine());
            in.useDelimiter("[^A-Za-z0-9]");
            while (in.hasNext()) {
                String token = in.next();
                if (map.containsKey(token)) {
                    map.get(token).add(lineNumber);
                } else {
                    HashSet<Integer> set = new HashSet<>();
                    set.add(lineNumber);
                    map.put(token, set);
                }
            }
            lineNumber++;
        }
        System.out.println(map);
    }
}




