class Solution:
    def isPalindrome(self, s: str) -> bool:
        data = [sub.lower() for sub in s if sub.isalnum()]
        reversed_data = [sub for sub in reversed(data)]

        return data == reversed_data