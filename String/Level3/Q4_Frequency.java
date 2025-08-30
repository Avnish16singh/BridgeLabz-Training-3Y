import java.util.*;

class Q4_Frequency {
    public static int[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        int[][] res = new int[s.length()][2];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) { res[k][0] = c; res[k][1] = freq[c]; freq[c] = 0; k++; }
        }
        return Arrays.copyOf(res, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[][] res = frequency(s);
        for (int[] r : res) System.out.println((char)r[0] + " -> " + r[1]);
    }
}
