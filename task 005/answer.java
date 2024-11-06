import java.util.Scanner;

class Fibonacci {
    public void func(int num) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < num; i++) {
            int c = a + b;
            System.out.printf(" %d ", c);
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = in.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.func(num);

        in.close();
    }
}