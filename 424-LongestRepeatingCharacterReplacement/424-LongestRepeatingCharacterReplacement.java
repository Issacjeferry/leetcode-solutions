// Last updated: 5/27/2026, 12:34:14 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0;
        int max=0,maxfre=0;
        int arr[] = new int[26];
        int l=0;
        while(right<s.length()){
            arr[s.charAt(right)-'A']++;
            maxfre =Math.max(maxfre,arr[s.charAt(right)-'A']);
            while((right-left+1) - maxfre >k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}