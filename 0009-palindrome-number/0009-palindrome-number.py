class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        x = str(x)
        return x==x[::-1]
            
   
        key = str(x)
        
        if key == key[::-1]:
            return True
        return False