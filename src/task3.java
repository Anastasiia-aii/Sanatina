import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                if (b[j] > b[j + 1]) {
                    int t = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            if (i == 0 || b[i] != b[i - 1]) {
                System.out.print(b[i] + " ");
            }
        }
    }
}