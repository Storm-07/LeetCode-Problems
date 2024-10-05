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

3/30/24 - SortByParity.java <br />
This one is rated easy on leetcode however I had trouble with it haha! Not a hard problem when you look at the code, similar to yesterday the trouble was mainly in the logic behind indexing. The solution I came to find utilized two pointer variables to traverse the array in the problem to sort by even or odd elements. The two pointer traversal method is one I see used a LOT in leetcode solution forums, and probably for good reason too, it beat 100% of users during runtime and 96% of users for memory usage, needless to say, it is efficient. I'll have to commit to using this type of traversal if I want to get things done quickly. Only downside is that it can be hard to keep track of two different elements moving at the same time, at least for me. <br />

3/31/24 - DistanceTraveled.java <br />
HAPPY EASTER CODERS! Today I got an "easy" problem from the leetcode shuffle again but I was foiled by my own foolishness. The description is easy to understand but I did overlook one detail that was included in the last clause of the second paragraph of the description. Yikes! If I learned anything today it would be that you should read the question very carefully everytime or else you'll end up tripping over every test case that comes your way! The code is very easy to understand with this problem. <br />

4/1/24 - WordSubSets.java (!)<br />
I understand the logic behind the solution I saw here, although I didn't have a lot of time to try it for myself. The big problem I had with this was that I could not get any elements from the final arraylist to print in the main method to test it. Apparently it works because it was accepted by the leetcode compiler however I do not fully comprehend it. <br />

4/2/24 - HarshadsNumber.java <br />
Easy problem today, might attempt another later but who knows. This problem was only tricky because you have to get the sum of the digits of an integer to start which means I created a helped method to convert the int to a string, add the numbers and then return the sum. Other than that, the logic is very easy to follow. <br />


4/3/24 - MinArrayValue.java (!) <br />
I'm not too sure how difficult this problem actually is because I don't have much time to look it over but from the looks of the solution, there is not a lot to it. I'm not sure why there is a division operation in the for loop but someday if I come back to look at this hopefully I'll be able to figure it out. I can at least tell there is a comparison between maximum values but that's it for now. <br />

4/5/23 - MaxAlphanumericValue.java <br />
This was an easy rated problem in leetcode. I had two methods to help get the job done. The helper method returns either the length of the string or the numeric value as asked by the question while the original method gets the helper method value and then parses the String array to compare and mark the maximum value between a string length and an alphanumeric value. Also I sadly missed a day yesterday so the streak is broken :'( <br />

4/6/24 - HighAccessEmployees.java (!)<br />
Wow this problem was the embodiment of the opposite problem I've been having with these leetcode problems. The description seemed difficult to understand at first and it was, however, I was able to understand it conceptually within about 10-15 minutes. The main problem was that I had no idea how to code it. I spent a little bit thinking about how to even parse a 2d List of strings but that knowledge is unknown to me. There are methods in the java library that I am unfamiliar with that allow you to manipulate a data structure like that that I simply do not know off the top of my head. Obviously the solution that I saw threw a hashmap at it to start lol. That makes sense though because of the structure of the list of lists supplied. I left a good amount of comments trying to explain what I at least thought was going on but I will definitely have to come back and try this one again someday. <br />

4/7/24 - BuyStockSellStock.java <br />
This problem is a little difficult to handle at first conceptually, but after looking it over it isn't too hard. Only part I don't understand is the first line within the for loop but the rest is easy to grasp. <br />


5/20/24 - ThirdMaxNumber.java <br />
Sorry for not updating in a while after being consistent. Today's problem is self-explanatory, find the third largest maximum in an array of integers. However if there are less than three elements in the array, return the first maximum. I had a slightly difficult time with this one but figured it out eventually, it's important to manage your data structures during problems like this. To be specific, I needed a hashset to keep track of values that had already been checked and maximum values to update continuously. The logic behind this one is tricky but it's a little easier to work backwards when updating values. I also learned what the "continue" statement does today. It is a java statement that skips a current iteration in a loop. Seems pretty helpful. <br />

10/2/24 - phoneButtons.java <br /> 
Another classic case of me not reading the problem correctly. This one had you remap phone numbers to a button, but I saw an example image of how the buttons were laid out and assumed that was the format we had to use. With custom mapping of buttons involved this problem seems not too hard. I don't have a lot of time to fully comprehend it but it's just traversal of a char array and incrementing a sum under certain conditions/iterations. <br />

10/3/24 - powerOfThree.java <br />
This problem is just returning true or false if a number is a power of three. I think if I had some time (since I'm rusty) I could figure this out with loops/recursion, but there was an interesting question at the bottom of the description that asked if it could be solved without using loops or recursion so I got some "help" to figure out the mathematical solution. Technically this solution is O(1) because the input doesn't necessitate using size or altering and the only actions in the method are logarithmic and arithmetic calculations. It's strange though because the submission claims that it is in the lower percentile for runtime speed but does beat many for memory. I wonder why that is since many of the submissions I saw in the java solutions tab involved loops. I'm no good with math so it's interesting to see how clean it can make the code: just 3 lines as opposed to 10+. I have to remember how logarithms work.. <br />

uniqueListOfLists.java <br/ >
Not too difficult of a medium problem. Traverse an array, create a list of unique integers, and append each repeated element to a new list of lists. I am not great at conceptualizing (?) the process so I think I initially created a helper method to check if a given array contained an element and then only added it if it was not in there. I failed to recognize that this approach did nothing to append repeated elements. The fixed solution checks each list in the list and uses the list method ".contains()" which I was blanking on to see if it is not in the current list and then adds it if not and the inner if statement within the first for loop appends a new empty list and adds repeated integers. <br />
