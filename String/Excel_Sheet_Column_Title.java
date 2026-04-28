class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;  
            int remainder = n % 26;
            char ch = (char) ('A' + remainder);
            sb.append(ch);
            n = n / 26;
        }

        return sb.reverse().toString();
    }
}
