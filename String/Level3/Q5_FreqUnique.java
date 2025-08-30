import java.util.*;

class Q5_FreqUnique {
    public static char[] uniqueChars(String s) {
        char[] res = new char[s.length()]; int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); boolean f = false;
            for (int j = 0; j < i; j++) if (s.charAt(j) == c) { f = true; break; }
            if (!f) res[k++] = c;
        }
        return Arrays.copyOf(res, k);
    }
    public static String[][] freq(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = "" + unique[i];
            res[i][1] = "" + freq[unique[i]];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = freq(s);
        for (String[] r : res) System.out.println(r[0] + " -> " + r[1]);
    }
}
