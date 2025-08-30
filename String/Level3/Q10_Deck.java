import java.util.*;

class Q10_Deck {
    static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    static String[] initDeck(){
        String[] deck=new String[suits.length*ranks.length];
        int k=0; for(String s:suits) for(String r:ranks) deck[k++]=r+" of "+s;
        return deck;
    }
    static void shuffle(String[] deck){
        for(int i=0;i<deck.length;i++){
            int r=i+(int)(Math.random()*(deck.length-i));
            String t=deck[i]; deck[i]=deck[r]; deck[r]=t;
        }
    }
    static String[][] distribute(String[] deck,int n,int players){
        if(n<players) return null;
        String[][] res=new String[players][n/players];
        int k=0;
        for(int i=0;i<players;i++)
            for(int j=0;j<n/players;j++) res[i][j]=deck[k++];
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), p=sc.nextInt();
        String[] deck=initDeck();
        shuffle(deck);
        String[][] res=distribute(deck,n,p);
        for(int i=0;i<p;i++){
            System.out.print("Player "+(i+1)+": ");
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
