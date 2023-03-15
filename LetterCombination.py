class LetterCombination(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        
        # Define the mapping of digits to letters
        mapping = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        
        # Base case: if the input string is empty, return an empty list
        if not digits:
            return []
        
        # Recursive case: iterate over all possible letters for the first digit,
        # and recursively call the function with the remaining digits
        first_digit = digits[0]
        rest_digits = digits[1:]
        rest_combinations = self.letterCombinations(rest_digits)
        result = []
        for letter in mapping[first_digit]:
            if not rest_combinations:
                result.append(letter)
            else:
                for combination in rest_combinations:
                    result.append(letter + combination)
        
        return result

# Create an instance of the Solution class
s = LetterCombination()

# Test the function with input "23" and print the output
output = s.letterCombinations("23")
print(output)
