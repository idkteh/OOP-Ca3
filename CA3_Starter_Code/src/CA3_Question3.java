import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.TreeMap;
/**
 *  Name: Ida Tehlarova
 *  Class Group: GD2b
 */


// use hashmap
    // if we use treemap the items are going to be in ascending order when we take them out
public class CA3_Question3
{
    public void main(){
        int x = 4;
    }
    public static void readFile(String fileName)
    {
    TreeMap<String,HashSet<Integer>> map = new TreeMap<>();
    if (map.contains(token)){
        map.get(token).add(lineNumber);
    }else{
        HashSet <Integer> set = new HashSet<>();
        set.add("ln number");
        map.put(token,set);
    }

    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile("src/CA3_Question1.java");
    }
}
