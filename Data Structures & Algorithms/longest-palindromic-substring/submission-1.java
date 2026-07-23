class Solution {
    public String longestPalindrome(String s) {
        String test = "";
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                String curr = s.substring(i, j+1);
                if(isPalindrome(curr) && curr.length()>test.length()){
                    test = curr;
                }
            }
        }
        return test;
    }
    public boolean isPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
