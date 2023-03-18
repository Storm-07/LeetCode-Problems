class ValidParenthesis(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        # create dictionary that maps each closing parenthesis to its opening
        mapping = {")": "(", "}": "{", "]": "["}
    
        # iterate each character in the string
        for char in s:
            if char in mapping:
                top_element = stack.pop() if stack else '#'
                if mapping[char] != top_element:
                    return False
            else:
                stack.append(char)
            
        return not stack
    
sample = ValidParenthesis()
output = sample.isValid("({[()]})")
print(output)
