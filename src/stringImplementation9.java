import java.util.Scanner;

public class stringImplementation9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string and a character");
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        char[] a=s.toCharArray();
        for(int i =0;i<s.length();i++){
            if(a[i]==c){
                System.out.println(i);
                break;
            }
        }
    }
}
