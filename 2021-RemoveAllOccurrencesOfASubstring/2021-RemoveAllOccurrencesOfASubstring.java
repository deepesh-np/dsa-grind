// Last updated: 03/06/2025, 09:54:25
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");  // removes leftmost occurrence
        }
        return s;
    }
}
