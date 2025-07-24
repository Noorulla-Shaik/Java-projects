import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR ROLL NUMBER :");
        String number = s.nextLine();
        System.out.println("ENTER YOUR NAME :");
        String name = s.nextLine();
        System.out.println("ENTER YOUR BRANCH :");
        String branch = s.nextLine();
        System.out.println("ENTER YOUR YEAR");
        int years = s.nextInt();
        System.out.println("YOUR DETALIS ARE ");
System.out.println("NAME  ="+name);
System.out.println("ROLL NUMBER ="+number);
System.out.println("BRANCH ="+branch);
System.out.println("YEAR ="+years);
}
}
