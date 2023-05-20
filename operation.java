import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int sum = a + b;
        System.out.println(sum);
        int diff = b - a;
        System.out.println(diff);
        int multiply = a * b;
        System.out.println(multiply);

        //addition by taking input

        Scanner sumOperation = new Scanner(System.in);
        int num1 = sumOperation.nextInt();
        int num2 = sumOperation.nextInt();
        int sumNumbers = num1 + num2;
        System.out.println("sum of numbers is: "+ sumNumbers);
    }
}
