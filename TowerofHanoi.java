import java.util.Scanner;

public class TowerofHanoi{
    public static void shiftdisk(int n,String src,String help, String dest) {
        if (n==1) {
            System.out.println("Transfer disk  "+n+"  from  "+src+" to "+dest);
            return;
        }
        shiftdisk(n-1, src, dest, help);
        System.out.println("Transfer disk  "+n+"  from  "+src+" to "+dest);
        shiftdisk(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of disk : ");
            int n=sc.nextInt();
            shiftdisk(n, "A", "B", "C");
        }
    }
}