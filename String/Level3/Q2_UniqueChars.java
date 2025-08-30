import java.util.*;

class Q2_UniqueChars {
    public static int strLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }
    public static char[] uniqueChars(String s) {
        int n = strLength(s), k = 0;
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == c) { found = true; break; }
            if (!found) res[k++] = c;
        }
        return Arrays.copyOf(res, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(uniqueChars(s));
    }
}
