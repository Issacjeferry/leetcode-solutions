# Last updated: 5/27/2026, 12:35:07 PM
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        l=[]
        s=len(nums)
        for i in range(len(nums)):
            if nums[i]!=0:
                l.append(nums[i])
        n=len(l)
        for i in range(n):
            nums[i]=l[i]      
        for i in range(n,s):
            nums[i]=0
        return nums