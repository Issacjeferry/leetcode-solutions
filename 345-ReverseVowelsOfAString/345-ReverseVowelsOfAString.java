// Last updated: 5/27/2026, 12:34:29 PM
class Solution {
    public String reverseVowels(String s) {
        char arr[] =s.toCharArray();
        int st=0,end=s.length()-1;
        String ans = "aeiouAEIOU";
        while(st<=end){
            if(ans.indexOf(arr[st]) == -1){
                st++;
                continue;
            }
            if(ans.indexOf(arr[end]) == -1){
                end--;
                continue;
            }
            char t=arr[st];
            arr[st]=arr[end];
            arr[end]=t;       
            st++;
            end--; 
        }
        return new String(arr);
    }
}