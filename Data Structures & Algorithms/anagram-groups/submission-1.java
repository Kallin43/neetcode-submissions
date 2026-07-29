class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String word = strs[i];
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedword = new String(arr);
            if(!map.containsKey(sortedword)){
                map.put(sortedword, new ArrayList<>());
            }
            map.get(sortedword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
