import java.util.Scanner;
//Write a program to reverse a  number  

class ReverseN{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number is: " + reversed);

        scanner.close();
    }

}

