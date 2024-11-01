import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = 0,s=0;

        while (N > 0) {
            k = k * 10 + N % 10;
            N /= 10;
        }
        System.out.println(k);

    }
}