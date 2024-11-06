import java.util.Scanner;

class PrimeNumber {

    public boolean check(int num) {
        if (num <= 0){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        PrimeNumber primeNumber = new PrimeNumber();
        boolean result = primeNumber.check(num);
        if (result) {
            System.out.printf("%d is prime\n", num);
        } else {
            System.out.printf("%d isn't prime\n", num);
        }

        in.close();
    }
}