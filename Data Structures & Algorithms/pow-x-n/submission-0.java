class Solution {

    public double myPow(double x, int n) {
        long exponent = n;
        if (exponent < 0) {
            x = 1 / x;
            exponent = -exponent;
        }
        return power(x, exponent);
    }

    private double power(double x, long exponent) {
        if (exponent == 0) {
            return 1;
        }
        double half = power(x, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        }
        return half * half * x;
    }
}