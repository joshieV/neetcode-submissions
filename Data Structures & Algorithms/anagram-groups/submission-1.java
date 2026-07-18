class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            map.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}