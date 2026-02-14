class Solution(object):
    def twoSum(self, nums, target):
        result  = {}

        for i in range(len(nums)):
            needed = target - nums[i]

            if needed in result:
                return [result[needed], i]

            result[nums[i]] = i
        return None

        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        