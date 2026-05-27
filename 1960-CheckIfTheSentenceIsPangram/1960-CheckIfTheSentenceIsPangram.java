// Last updated: 5/27/2026, 12:31:38 PM
class Solution {
    public boolean checkIfPangram(String a) {
        int arr[] = new int[26];
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                return false;

        }
        return true;
    }
}