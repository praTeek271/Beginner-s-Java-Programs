import java.util.Scanner;

public class FrstAndLastOccurence{
    public static int first=-1;
    public static int last=-1;

    public static void occence(String st,int l,char chr){
        if (l==st.length()){
            System.out.println("First Occurence in "+first);
            System.out.println("Last Occurence in "+last+1);
            return;
        }
        char currchar=st.charAt(l);
        if (currchar == chr){
            if (first==-1){
                first=l;
            }else{
                last=l;
            }
        }
        
        occence(st, l+1,chr);
    }

    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String st=sc.nextLine();
            occence(st, 0,'a');
        }
    }
    
}