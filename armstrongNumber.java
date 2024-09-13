import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {

        int n;
        int temp, digit = 0, last = 0;
        double sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number...");
        n = s.nextInt();

        // find the length of entered number
        temp = n;
        while (temp > 0) {
            // "/" with 10 will remove last digit
            temp /= 10;
            digit++;

        }
        System.out.println("length of number: " + digit);
        // do calculation > last digit with power no of digits and add all if it matches
        // with original number then its armstrong.
        temp = n;
        while (temp > 0) {
            last = temp % 10; // get the last digit
            sum = sum + Math.pow(last, digit);// do the power with length of last digit
            temp = temp / 10;// remove the last digit

        }
        if (n == sum) {
            System.out.println("its an armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}
