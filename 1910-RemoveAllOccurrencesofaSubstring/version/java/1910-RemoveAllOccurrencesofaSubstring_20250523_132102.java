// Last updated: 23/05/2025, 13:21:02
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");  // removes leftmost occurrence
        }
        return s;
    }
}
