import java.util.*;

class Q8_Anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()) return false;
        int[] fa=new int[256], fb=new int[256];
        for(char c:a.toCharArray()) fa[c]++;
        for(char c:b.toCharArray()) fb[c]++;
        return Arrays.equals(fa,fb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(), b=sc.nextLine();
        System.out.println(isAnagram(a,b));
    }
}
