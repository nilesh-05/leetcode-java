class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        else if(n==1)
            return x;
        else{
            double newPow = myPow(x,n/2);
            if(n%2==0)
                return newPow * newPow;
            else {
                if(n>0)
                    return newPow * x * newPow;
                else 
                    return (newPow * newPow)/x;
            }
                
        }
    }
}