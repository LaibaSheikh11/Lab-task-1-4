import java.util.Scanner;
public class Tasktwo {
    public static void main(String[] args) {

        System.out.println("******ODD AND EVEN NUMBER:********");
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }
}