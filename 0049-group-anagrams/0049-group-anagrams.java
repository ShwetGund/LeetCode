class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            // Create a list if this key doesn't exist
            map.putIfAbsent(key, new ArrayList<>());

            // Add the original word to that group
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}