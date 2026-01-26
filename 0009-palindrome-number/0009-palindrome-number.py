class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
            
   
        key = str(x)
        
        if key == key[::-1]:
            return True
        return False