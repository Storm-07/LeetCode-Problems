import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
       int i=0,j=0,ans=0;
        
       HashSet<Character>set=new HashSet<>();
       while(j<s.length()){
           if(!set.contains(s.charAt(j))) { // if set does not contain current index / duplicate char
               set.add(s.charAt(j));
               ans=Math.max(ans,set.size());
               j++;
           }
           else { /*if set DOES contain current index, go back and remove the first index.
                    still not entirely sure but my guess is that the repeated index will always
                    be the first as the loop continues. increment 'i' and coninue.*/
               set.remove(s.charAt(i));
               i++;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        String str = "abcabcbbzebra"; // "zebra" is longest, ans = 5

        System.out.println(lengthOfLongestSubstring(str));
    }
}
