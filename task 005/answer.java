import java.util.Scanner;

class Fibonacci{
    public void func(int num){
        for (int i =1;i<num;i++){
            System.out.printf("%d,",i + (i-1));
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = in.nextInt();

        Fibonacci fibonacci =  new Fibonacci();
        fibonacci.func(num);

        in.close();
    }
}