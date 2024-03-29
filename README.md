# LeetCode-Problems
I'm not really sure what to put in this README file so I'll just write down the day I complete each problem. <br />
(!): means I haven't fully comprehended problem

5/18/22 - KthLargestElement.java <br />
5/22/22 - IslandPerimeter.java <br />
8/7/22 - TwoSum.java <br />
8/8/22 - AddTwoNumbers.java (!)<br />
8/17/22 - LongestSubStringWithoutRepeatingChars.java <br />
8/20/22 - MedianOfTwoArrays.java <br />
12/30/22 - LongestPalindrome.java (!)<br />
1/23/23 - ReverseInteger.java (tried this one for a couple hours only to find a much simpler solution using math :') )<br />
1/26/23 - PalindromeInteger.java <br />
1/27/23 - MostRainwater.java <br />
3/9/23 - romanToInt.py <br />
3/9/23 - LongestCommonPrefix.js <br />
3/10/23 - Three_Sum.java <br />
3/14/23 - LetterCombination.py <br />
3/16/23 - RemoveNode.js <br />
3/17/23 - ValidParenthesis.py <br />
3/19/23 - MergeTwoLists.py <br />
3/20/23 - GenerateParenthesis.js <br />
  - Recursive functions within functions are allowed <br />
  - 'push' method is a javascript method that adds elements to an array(?) <br />
  
7/23/23 - OptimalDivision.py <br />
  - format is arr[0]/(arr[1]/arr[2]/.../arr[N - 1]) <br />
  - .join function joins elements of an iterable by a string separator: '/'.join = x/y/z if arr is [x,y,z] (works for tuples, lists, etc.)
  - .format function will take values given as parameters and place them into a string.
    ex: str = "hello my name is {} and I like {}".format(name, concept) if name = storm and concept = coding, it will fill in the blanks. <br />

7/24/23 - BestPokerHand.java <br />
  - be wary of nested for loops when counting <br />

7/25/23 - ThreeLetterSeparation.java <br />
 - Stringbuilder sb = new Stringbuilder(); <br />
 - sb.append(char or str?)
 - sb.setLength(0) clears the stringbuilder <br />
 - You can convert arraylists to arrays easily if it is more convenient to use one (see return line) <br />

7/27/23 - ChunkArray.js 
 - const and let and var for variables/fields in js. <br />
 - equivalents in js are more akin to triple equals signs at least for numbers. <br />
 - .push function is used to append elements to an array (haha just noticed I wasn't sure about this on 3/20/23) <br />
 - O(n) time complexity for both runtime and memory. One loop is used and variables are used proportionately <br />

7/31/23 - NumberComplement.py
 - self is a default parameter supplied to functions in python. Used to acess variables from instances of the class (I think?) <br />
 - while loop logic is self explanatory <br />
 - int() function in python takes any integer represented as a string and converts it to whatever base that is supplied in the second parameter (I think) <br />
 - [::-1] is used to reverse a list, tuple, etc. I believe the colons have to do with parsing and the -1 ignores the front because that is the sign which is not needed <br />

8/2/23 - createCounter.js
 - I think const and let are mainly what we use in functions for variables, var seems to be used for function declarations? <br />
 - If you want to invoke functions used within a function, you must encapsulate them within a return block. (I think; refer to code) <br />

8/5/23 - maxAncestorDiff.java (!)<br />
I am having a hard time digesting the solution for this one as it was not mine. I understand how most of this works it's just that I noticed that the if statement in the recursive method seems to only check leaf nodes (nodes that do not have any children). The problem I see with this is that it is not making comparisons between ancestors and descendants with children nodes even if they contain a greater absolute difference. However this solution still passes the test cases, so someday I will have to come back to this one and try and figure out why it works. <br />

8/6/23 - SearchInRotatedSortedArray.java <br />
Very Easy problem, solved in about 2-3 minutes. Iterate through array, if indexed int is equal to the target then return true. <br />

8/7/23 - GreatestCommonDivisor.java <br />
Not too bad, only issue was that I did not know how to actually calculate gcd mathematically. so apparently it is a euclidian algorithm, I am a little too tired at the moment to break it down. Feel free to come back to check out how the modulo process works later. Other than that finding the greatest and smallest elements of an array is simple. <br />

8/12/23 - AstericsCount.java <br />
TERNARAY CONDITIONAL OPERATOR: <br />
EXAMPLE) barCount += ch == '|' ? 1 : 0; <br />
equivalent to: <br />
if (ch == '|') { <br />
    barCount += 1; <br />
} else { <br />
    barCount += 0; <br />
} <br />


## Began Working on A+ certification so there may be a gap (8/1/23 - 2/10/24) <br />

1/24/24 - potions.java <br />
I figured this medium level java question out without any help after not coding for months however it did not pass test cases completely because it has a time complexity of O(N^2) :( <br />

1/27/24 - FizzBuzz.java <br />
Could've sworn I did the fizzbuzz problem already, must've stored it in a local folder or something instead of my coding folder. Maybe on a different machine, didn't need much help with this one either. Could probably be optimized but I can confidently say that about any code I write, only thing I looked up was how to convert int to string in java which is just 'String.valueOf(int)'. <br />

3/17/24 - MinDeletions.java <br />
This one was a tough guy. I enlisted the help of chatGPT after trying it for half an hour or so but neither of us could get it to function properly haha. The answer that I came to was a solution from the discussion forum. Took a while to figure out how it worked but eventually got it. the comments are a little ambiguous to understand but if you walk through each statement in that large return of the method, it makes sense eventually. <br />

3/27/24 - SimilarRectangles.java <br />
Not a super difficult problem if you know how to traverse 2d int arrays in java but the problem is I couldn't submit again due to the large scale test cases exceeding the time limit. Even when I tried a few of the solutions from the forums using hashmaps and hashmap methods, some of the final test cases resulted in blatantly incorrect results which is strange. I will cake this up to a draw today but if you can figure it out props to you. <br />

3/28/24 - NumOccurences.java <br />
Had to brush up on hashmap knowledge with this one. Here's what a few of the methods from the java library do as far as I know. '.put()' inserts a new key, value element into the hashmap, '.getOrDefault()' finds a certain key and either returns the value of that key, or a specified default parameter. '.values()' returns only the values of the map and not the keys. Took a little bit of conceptual thinking to see how this one works. <br />

3/29/24 - Hamsters.java <br />
Haven't used stringbuilder in a little while but this wasn't too hard to understand. Some of the logic checking for successful hamster feeding cases was a bit confusing but that's it. Just messing around with indexing, checking prior and subsequent indexes. <br />
