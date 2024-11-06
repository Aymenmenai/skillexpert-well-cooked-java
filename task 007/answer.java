import java.util.Scanner;

class StringReverse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter your name :");
        String word = in.nextLine();
        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }

        System.out.printf("==> %s\n", reverse);

        in.close();
    }
}