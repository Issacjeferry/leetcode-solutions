// Last updated: 5/27/2026, 12:34:05 PM


class Solution {
    public boolean makesquare(int[] nums) {
        int sum = 0;

        for(int n: nums){
            sum+=n;
        }

        if(sum%4!=0){
            return false;
        }

        int target = sum/4;

        Arrays.sort(nums);
        reverse(nums);

        int[] sets = new int[4];

        return backtracking(nums, 0, sets, target);
    }

    private boolean backtracking(int nums[], int index, int[] set, int target){
        if(index==nums.length){
            return true;
        }

        int num = nums[index];

        for(int i=0; i<set.length; i++){
            if(set[i]+num > target){
                continue;
            }

            set[i] += num;
            if(backtracking(nums, index+1, set, target)){
                return true;
            }
            set[i] -= num;

            if(set[i]==0){
                break;
            }
        }
        return false;
    }

    private void reverse(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}