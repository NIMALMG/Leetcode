class Solution:
    def reverse(self, x: int) -> int:
        sign = 1
        if(x<0):
            sign = -1
        
        x = abs(x)
        res = 0
        
        while(x > 0):
            digit = x%10
            x = x//10

            if( (-2**31)//10 > res or res > (2**31)//10 ):
                return 0
            
            res = res*10 + digit
        
        return res*sign
