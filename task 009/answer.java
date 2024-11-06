import java.util.Scanner;

class GCD {
    public static void main(String args[]) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("first number:");
        int a = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("second number:");
        int b = in2.nextInt();
        in1.close();
        in2.close();
        int s;
        if (a < b) {
            s = a;
        } else {
            s = b;
        }

        for (int i = s; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("LCM : " + (a*b)/i);
                return;
            }
        }

    }
}