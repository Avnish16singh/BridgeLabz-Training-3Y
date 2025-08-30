import java.util.*;

class Q6_FreqNested {
    public static String[] freq(String s) {
        char[] arr = s.toCharArray();
        int[] f = new int[arr.length];
        Arrays.fill(f, -1);
        for (int i = 0; i < arr.length; i++) {
            if (f[i] == 0) continue;
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { count++; f[j] = 0; }
            }
            f[i] = count;
        }
        String[] res = new String[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++)
            if (f[i] > 0) res[k++] = arr[i] + " -> " + f[i];
        return Arrays.copyOf(res, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (String r : freq(s)) System.out.println(r);
    }
}
