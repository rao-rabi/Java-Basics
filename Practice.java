import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        
        //calculate the area of circle
        System.out.println("Enter the radius:");
        Scanner area = new Scanner(System.in);
        int radius = area.nextInt();
        double areaOfCircle = (3.14) * (radius * radius);
        System.out.println("The area of circle is: " + areaOfCircle);

        //write a table
        System.out.println("Enter the number to get its table:");
        Scanner table = new Scanner(System.in);
        int num = table.nextInt();
        System.out.println(num * 1);
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(num * 4);
        System.out.println(num * 5);
        System.out.println(num * 6);
        System.out.println(num * 7);
        System.out.println(num * 8);
        System.out.println(num * 9);
        System.out.println(num * 10);
    }
}
