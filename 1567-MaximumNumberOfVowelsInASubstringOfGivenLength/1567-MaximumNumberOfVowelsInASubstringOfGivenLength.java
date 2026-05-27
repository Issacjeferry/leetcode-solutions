// Last updated: 5/27/2026, 12:32:00 PM
class Solution {
    public boolean isVowel(char c){
        return c=='a' || c=='e' ||c=='i' || c=='o' ||c=='u';
    }
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        int max=c;
        for(int i=1;i<s.length()-k+1;i++){
            if(isVowel(s.charAt(i-1))){
                c--;
            }if(isVowel(s.charAt(i+k-1))){
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}