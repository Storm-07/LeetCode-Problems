public class smallCharStrings {
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        // need helper method to find f(s) where f is the greatest amount of smallest value lexicons in a string

        int[] smallFreq = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            String query = queries[i];
            int qFreq = f(query); // f(s) for current query
            int count = 0;
            for(String word : words) {
                int wFreq = f(word);
                if(wFreq > qFreq) count++;
            }
            smallFreq[i] = count;
        }
        return smallFreq;
    }

    public static int f(String s) {
        char[] sArray = s.toCharArray();
        char smallestChar = sArray[0];
        int smallestFreq = 0;

        for(char a : sArray) { // find smallest value
            if(a < smallestChar) smallestChar = a;
        }

        for(char b : sArray) {
            if(b == smallestChar)
                smallestFreq++;
        }
        return smallestFreq;
    }

    public static void main(String[] args) {
        String[] queries = {"bbb", "cc"};
        String[] words = {"a", "aa", "aaa", "aaaa"};
        String[] queries2 = {"cbd"};
        String[] words2 = {"zaaaz"};
        int[] testarr = numSmallerByFrequency(queries2, words2);
        for(int n : testarr) System.out.print(n + " ");
    }
}
