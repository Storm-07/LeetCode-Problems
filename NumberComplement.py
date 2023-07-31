class NumberCompliment(object):
    def findComplement(self, num):
        revbin = ''
        while num > 0:
            if num % 2 == 1:
                revbin += '0'
            else:
                revbin += '1'
            num = num // 2
        return int(revbin[::-1], 2)
    
    if __name__ == '__main__':
        print(findComplement(1, 5))
        print(findComplement(1, 6))
        print(findComplement(1, 7))
