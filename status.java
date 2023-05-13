import java.util.Scanner;

public class StatusApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your status: ");
        String status = input.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
    }
}
