public class Hamsters {
    public static int minimumBuckets(String hamsters) {
        int count = 0;
        StringBuilder sb = new StringBuilder(hamsters);

        for(int i = 0; i < hamsters.length(); i++) {
            if(sb.charAt(i) == 'H') {
                if(i - 1 >= 0 && sb.charAt(i - 1) == 'B') continue;
                if(i + 1 < sb.length() && sb.charAt(i + 1) == '.') {
                    count++;
                    sb.setCharAt(i + 1, 'B');
                    continue;    
                }
                if(i - 1 >= 0 && sb.charAt(i - 1) == '.') {
                    count++;
                    continue;
                }
                return -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String hampter = ".HHH.";
        System.out.println(minimumBuckets(hampter));
    }
}
