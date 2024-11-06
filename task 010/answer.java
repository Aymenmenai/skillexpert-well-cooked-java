import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        String strnum = String.valueOf(num);

        int sum = 0;
        for (int i = 0; i < strnum.length(); i++) {
            char c = strnum.charAt(i);

            int n = c -'0';
            int s = (int) Math.pow(n, strnum.length());
            sum = s + sum;

        }
        System.out.println(sum);
    }
}