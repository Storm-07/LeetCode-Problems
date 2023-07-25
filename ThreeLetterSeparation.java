import java.util.ArrayList;

class ThreeLetterSeparation {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> groups = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            count++;

            if (count == k) {
                groups.add(sb.toString());
                sb.setLength(0);
                count = 0;
            }
        }

        // Add any remaining characters to the groups
        if (sb.length() > 0) {
            // Append the fill character until the StringBuilder has k characters
            while (sb.length() < k) {
                sb.append(fill);
            }
            groups.add(sb.toString());
        }

        return groups.toArray(new String[0]);
    }
}
