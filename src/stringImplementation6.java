import java.util.Scanner;

public class stringImplementation6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        char[] a=s.toCharArray();
        int totalWeight=0;
        for (int i=0;i<s.length();i++){
            int j=a[i];
            totalWeight=totalWeight+j;
        }
        System.out.println(totalWeight);
    }
}
