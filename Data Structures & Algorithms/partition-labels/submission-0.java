class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }
        int start = 0;
        int idx = 0;
        for(int i = 0; i<s.length(); i++){
            idx = Math.max(idx, map.get(s.charAt(i)));
            if(i==idx){
                result.add(idx-start+1);
                start = i+1;
            }
        }
        return result;
    }
}
