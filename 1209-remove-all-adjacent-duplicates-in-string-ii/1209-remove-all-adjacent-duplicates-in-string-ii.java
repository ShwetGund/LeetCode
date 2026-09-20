class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Character> chars = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(!chars.isEmpty() && chars.peek() == ch) {
                counts.push(counts.pop() + 1);
            } else {
                chars.push(ch);
                counts.push(1);
            }

            if(counts.peek() == k) {
                chars.pop();
                counts.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        while(!chars.isEmpty()) {
            char ch = chars.pop();
            int count = counts.pop();

            for(int i = 0; i < count; i++) {
                result.append(ch);
            }
        }

        return result.reverse().toString();
    }
}