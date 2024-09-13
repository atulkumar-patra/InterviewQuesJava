public class sumOfGivenDigits {
    public static void main(String[] args) {
        int n= 332;
        int rem=0,sum=0,temp;
        temp = n;
        while (temp > 0) {
            rem = temp % 10; //get the last digit
            sum = sum + rem;//add the digits
            temp = temp/10;//remove last digit
        }
        System.out.println("Given: " + n + " and sum is: " + sum);
    }
}
