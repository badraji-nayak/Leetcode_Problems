class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int low=0;
        long high=x;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            if(mid*mid<=x){
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }            
        }
        return (int)high;
    }
}