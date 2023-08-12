class Solution {
    public int countAsterisks(String s) {
        int barCount = 0;      // Counter for '|'
        int asteriskCount = 0; // Counter for '*'
        
        for (char ch : s.toCharArray()) {
            // Check if the current character is '|'
            // If yes, increment the barCount
            barCount += ch == '|' ? 1 : 0;
            
            // Check if barCount is 0 (no '|' encountered)
            // and the current character is '*'
            // If yes, increment the asteriskCount
            asteriskCount += barCount == 0 && ch == '*' ? 1 : 0;
            
            // Check if barCount is 2 (two consecutive '|')
            // If yes, reset barCount to 0
            barCount = barCount == 2 ? 0 : barCount;
        }
        
        return asteriskCount; // Return the total asterisk count
    }
}
