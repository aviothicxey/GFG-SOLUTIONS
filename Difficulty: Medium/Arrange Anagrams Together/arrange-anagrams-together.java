class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] strs) {
        // code here
        Map<String,  ArrayList<String>> res = new HashMap<>();
            for (String s : strs) {
                int[] count = new int[26];
                for (char c : s.toCharArray()) {
                    count[c - 'a']++;
                }
                String key = Arrays.toString(count);
                res.putIfAbsent(key, new ArrayList<>());
                res.get(key).add(s);
            }
        return new ArrayList<>(res.values());
        
    }
}