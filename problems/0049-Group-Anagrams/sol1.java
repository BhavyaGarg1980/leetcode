// ==========================================================
// 49. Group Anagrams
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 99%)
// Memory     : 49.1 MB (Beats 94%)
// Link       : https://leetcode.com/problems/group-anagrams/
// ==========================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}