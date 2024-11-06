import java.util.Arrays;

class Reverse {
    public static void main(String args[]) {
        String[] arr = { "One", "Two", "Three", "Four", "Five" };
        int length = arr.length;
        String[] reverseArr = new String[length];

        for (int i = 0; i < length; i++) {
            reverseArr[i] = arr[length - i - 1];
        }
        System.out.println("Normal Array \n");
        System.out.printf(Arrays.toString(arr));

        System.out.println("Reverse Array \n");
        System.out.printf(Arrays.toString(reverseArr));
    }
}