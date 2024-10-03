import java.util.HashMap;

class phoneButtons {
    public static int minimumPushes(String word) {
        int count = 1;
        int index = 1;
        int sum = 0;

        for(char c: word.toCharArray()) {
            if(index > 8) {
                index = 2;
                count++;
            }
            else 
                index++;
            sum += count;
        }

        return sum;
    }

    public static void main(String[] args) {
        String kitty = "cat";
        System.out.println(minimumPushes(kitty));
    }
}
