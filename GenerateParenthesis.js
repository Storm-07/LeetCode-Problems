/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    const result = [];
    
    /**
     * Recursive helper function to generate all valid parentheses combinations.
     * @param {string} s - The current string being built.
     * @param {number} open - The number of open parentheses in the string.
     * @param {number} close - The number of closed parentheses in the string.
     */
    function backtrack(s, open, close) {
        if (s.length === n * 2) {
            result.push(s);
            return;
        }
        
        if (open < n) {
            backtrack(s + "(", open + 1, close);
        }
        
        if (close < open) {
            backtrack(s + ")", open, close + 1);
        }
    }
    
    backtrack("", 0, 0);
    return result;  
};

let numpairs = 3;
console.log(generateParenthesis(numpairs));
