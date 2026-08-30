class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 0 or num == 1:
            return True

        r = num

        while r * r > num:
            r = (r + num // r) // 2
        return r * r == num