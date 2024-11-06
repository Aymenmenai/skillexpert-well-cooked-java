import java.util.Scanner;

class Palindrome {
    public void checker(String input){
        String word = new StringBuilder(input).reverse().toString();
        if(word.equalsIgnoreCase(input)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a word: ");
        String answer = in.nextLine();
        Palindrome palindrome = new Palindrome();
        palindrome.checker(answer);
        in.close();

    }
}