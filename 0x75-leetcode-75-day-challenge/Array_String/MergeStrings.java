public class MergeStrings {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        int length1 = word1.length();
        int length2 = word2.length();
        int max = Math.max(length1, length2);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < max; i++) {
            if (i < length1) {
                sb.append(word1.charAt(i));
            }
            if (i < length2) {
                sb.append(word2.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
