import java.util.Scanner;

public class ReverseString {
    public static void printrev(String st,int l){
        if (l==0){
            System.out.print(st.charAt(l));
            return;
        }
        System.out.print(st.charAt(l));
        printrev(st,l-1);
    }
    
    public static void main(String aSt[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string : ");
            String d=sc.nextLine();
            printrev(d, d.length()-1);
        }
    }
}
