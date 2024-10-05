import java.util.ArrayList;
import java.util.List;

public class uniqueListOfLists {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> uniques = new ArrayList<>();

        for(int num : nums) {
            boolean added = false;

            for(List<Integer> row : uniques) { // adds unique numbers to existing "row"
                if(!row.contains(num)) {
                    row.add(num);
                    added = true;
                    break;
                }
            }

            if(!added) { // creates a new row to add repeat number if num is a repeat (added remains false)
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                uniques.add(newRow);
            }
        }
        return uniques;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
}
