import java.util.Scanner;

public class stringImplementation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string and a value of i:");
        String s = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(s.substring(i));
    }
}
