# Last updated: 5/27/2026, 12:35:41 PM
class Solution(object):
    def containsDuplicate(self, nums):
        se=set(nums)
        if(len(se)!=len(nums)):
            return True
        else:
            return False 