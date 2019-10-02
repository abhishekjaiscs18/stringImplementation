import java.util.Scanner;

public class stringImplementation3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        s=s.replace('a','*');
        System.out.println(s);
    }
}
