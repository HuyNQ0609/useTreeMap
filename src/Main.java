import java.util.TreeMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "HaNoi University of Science and Technology";
        str = str.replaceAll(",","");
        String[] arr = str.split(" ");
        String key;
        Integer value;
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            key = s;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<String> set=map.keySet();
        for (String o : set) {
            key = o;
            System.out.println("Word '" + key + "' appear " + map.get(key) + " times");
        }
    }
}