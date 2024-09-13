import java.util.Scanner;

public class fibonacciSeries {
    
    public static void main(String[] args) {
        int fiblength;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.:.. ");
        fiblength = s.nextInt(); //this number upto which the series will be printed
        //so if user input is 10, then 10 fib. series will be printed not below 10 nos will.

        int[] num = new int[fiblength];
        num[0] = 0;
        num[1] = 1;
        //start for loop from index 2 cause first 2 index assigned above
        for (int i = 2; i < fiblength; i++) {
            num[i] = num[i-1] + num[i-2];

        }

        for (int i = 0; i < fiblength; i++) {
            System.out.println(num[i]);
        }
    }
}
