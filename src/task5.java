import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        int D=in.nextInt();
        int M=in.nextInt();
        int G=in.nextInt();
        if(M==2) {
            M=14;
            G--;
        }
        else if(M==1) {
            M=13;
            G--;
        }
        int day = (D + (13 * (M + 1)) / 5 + G % 100 + (G % 100 / 4) + (G/ 100 / 4) - (2 * G/ 100)) % 7;
        switch (day) {
            case 0:
                System.out.print("Saturday");
                break;
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
        }
    }
}