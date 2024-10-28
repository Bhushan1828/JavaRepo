import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Entered Number is "+result+".");
        sc.close();

    }
}