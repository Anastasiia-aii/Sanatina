import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] t = new int[n][];
        for (int i = 0; i < n; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                t[i][j] = scanner.nextInt();
            }
        }
        int max = ma(t);
        System.out.println(max);
    }
    public static int ma(int[][] t) {
        for (int i = t.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                t[i][j] += Math.max(t[i + 1][j], t[i + 1][j + 1]);
            }
        }
        return t[0][0];
    }
}