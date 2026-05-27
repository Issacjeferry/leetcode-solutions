// Last updated: 5/27/2026, 12:32:13 PM
class Solution {
    public boolean no(int m){
        while(m>0){
            if(m%10==0) return false;
            m/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int a=0;
        int b=0;
        int arr[]=new int[2];
        for(int i=1;i<n;i++){
            a=i;
            b=n-i;
            if(no(a)&&no(b)) {
                arr[0]=a;
                arr[1]=b;
                break;
            }
            
        }
        return arr;
    }
}