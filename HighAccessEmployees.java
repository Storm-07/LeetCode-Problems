import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighAccessEmployees {
    public static List<String> findHighAccessEmployees(List<List<String>> access_times) {
        // initializing "times" hashmap to set keys to employee names and values to access times
        Map<String, List<Integer>> times = new HashMap<>();

        for(final List<String> access_time : access_times) { // since access times is a list of lists, we initialize another list to iterate as a for each loop
            times.putIfAbsent(access_time.get(0), new ArrayList<>()); // populating times with lists from accesstimes even if nonexistent
            times.get(access_time.get(0)).add(Integer.valueOf(access_time.get(1))); // I think adds individual access times
        }

        final List<String> result = new ArrayList<>(); // list of names to return (needs to be populated)

        for(final Map.Entry<String, List<Integer>> entry : times.entrySet()) { // another complicated foreach loop to parse times hashmap
            if(entry.getValue().size() < 3) // if the name occurs less than 3 times continue
                continue;

            Collections.sort(entry.getValue()); // sorts list of access times according to name?

            for(int i = 2; i < entry.getValue().size(); ++i) {
                if(entry.getValue().get(i) - entry.getValue().get(i - 2) < 100) { // checking to see if difference in all access times is less than an hour in 0000-2400 format
                    result.add(entry.getKey()); // if hour difference is less than 100 then add name to list to return
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<String>> access_times = new ArrayList<>();
        access_times.add(Arrays.asList("John", "0910"));
        access_times.add(Arrays.asList("Alice", "0920"));
        access_times.add(Arrays.asList("John", "0945"));
        access_times.add(Arrays.asList("John", "1000"));
        access_times.add(Arrays.asList("Alice", "1010"));
        access_times.add(Arrays.asList("Alice", "1000"));
        access_times.add(Arrays.asList("Bob", "1300"));
        access_times.add(Arrays.asList("Bob", "1400"));
        access_times.add(Arrays.asList("Bob", "1500"));

        List<String> highAccessEmployees = findHighAccessEmployees(access_times);
        System.out.println("Employees with high access:");
        for (String employee : highAccessEmployees) {
            System.out.println(employee);
        }
    }
}
