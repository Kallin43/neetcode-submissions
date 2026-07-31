class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        for(int right = s1.length()-1; right<s2.length(); right++){
            String temp = s2.substring(left, right+1);
            char[] tempch = temp.toCharArray();
            Arrays.sort(tempch);
            if(Arrays.equals(tempch, ch1)){
                return true;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
