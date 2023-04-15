import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    private static int sumValues(Map<String, Integer> map){
        Set<String> set = map.keySet();
        int sum = 0;
        for(String key : set){
            sum += map.get(key);
        }

        return sum;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Size of map is:- " + map.size());

        System.out.println(map);

        if (map.containsKey("one")) {

            Integer a = map.get("one");

            System.out.println("value for key" + " \"one\" is: " + a);
        }

        map.computeIfAbsent("four", k -> sumValues(map));

        System.out.println(map);
    }
}