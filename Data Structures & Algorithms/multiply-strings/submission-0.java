class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int multiplication = digit1 * digit2;
                int carryPosition = i + j;
                int currentPosition = i + j + 1;
                int total = multiplication + result[currentPosition];
                result[currentPosition] = total % 10;
                result[carryPosition] += total / 10;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int digit : result) {
            if (answer.length() == 0 && digit == 0) {
                continue;
            }
            answer.append(digit);
        }
        return answer.toString();
    }
}