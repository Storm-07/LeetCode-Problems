/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    // idea is to use first as template and iterate each word letter by letter
    if (strs.length === 0) {
    return "";
    }
    
    let prefix = strs[0];
    
    for (let i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) !== 0) {
        prefix = prefix.substring(0, prefix.length - 1);
        if (prefix === "") {
            return "";
        }
        }       
    }
    
    return prefix;
};

let strs = ["flavor", "flow", "flight"];
console.log(longestCommonPrefix(strs)); 
