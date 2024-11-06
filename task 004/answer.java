import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Entree a number: ");
        int num = in.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum = i * sum;
        }

        System.out.println(sum);

        in.close();

    }
}