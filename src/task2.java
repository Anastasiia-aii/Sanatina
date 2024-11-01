import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = "";
        int k = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                k++;
            } else {
                b += a.charAt(i - 1)  +""+ k;
                k = 1;
            }
        }
        if (a.length() > 0) {
            b += a.charAt(a.length() - 1)+""  + k;
        }

        System.out.print(b);
    }
}
