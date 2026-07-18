import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA APP =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("---------------------");
        System.out.println("Welcome " + name);
        System.out.println("Age : " + age);
        System.out.println("---------------------");

        sc.close();
    }
}
