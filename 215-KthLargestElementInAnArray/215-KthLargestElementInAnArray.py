# Last updated: 5/27/2026, 12:35:45 PM
class Solution(object):
    def findKthLargest(self, nums, k):
        nums.sort(reverse=True)
        print(nums)
        return nums[k-1]