import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> buzzList = new ArrayList<String>();

        for(int i = 1; i <= n; i++) {
            // FizzBuzz if i is divisible by 3 & 5
            // Fizz if i is divisible by 3
            // Buzz if i is divisible by 5
            // i elsewise
            String iS = String.valueOf(i);

            if(i % 3 == 0 && i % 5 == 0) {
                buzzList.add("FizzBuzz");
            }
            
            if(i % 3 != 0 && i % 5 == 0) {
                buzzList.add("Buzz");
            }
            
            if(i % 3 == 0 && i % 5 != 0) {
                buzzList.add("Fizz");
            }
            
            if(i % 3 != 0 && i % 5 != 0) {
                buzzList.add(iS);
            }
        }
        return buzzList;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
