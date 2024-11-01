import java.util.Scanner;
public class Main {
    public static char[] a={'A','B','C'};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        rec(n,0,2,1);
    }
    public static void rec(int q,int from,int to,int t) {
        if (q>0){
            rec(q-1,from,t,to);
            System.out.println("Move disk "+q+" from "+a[from]+" to "+a[to]);
            rec(q-1,t,to,from);
        }
    }
}