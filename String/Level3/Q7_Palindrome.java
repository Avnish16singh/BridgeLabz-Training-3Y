import java.util.*;

class Q7_Palindrome {
    public static boolean isPalindrome1(String s) {
        int i=0,j=s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    public static boolean isPalindrome2(String s, int i, int j) {
        if (i>=j) return true;
        if (s.charAt(i)!=s.charAt(j)) return false;
        return isPalindrome2(s,i+1,j-1);
    }
    public static boolean isPalindrome3(String s) {
        char[] arr = s.toCharArray();
        String rev=""; for(int i=arr.length-1;i>=0;i--) rev+=arr[i];
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindrome1(s));
        System.out.println(isPalindrome2(s,0,s.length()-1));
        System.out.println(isPalindrome3(s));
    }
}
