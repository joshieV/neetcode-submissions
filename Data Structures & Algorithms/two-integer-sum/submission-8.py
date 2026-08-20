class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}

        for i in range(len(nums)):
            curr = nums[i]
            needed = target - curr

            if needed in map:
                return [map[needed], i]
            
            map[curr] = i