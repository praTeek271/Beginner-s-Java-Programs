import java.util.ArrayList;


public class printSubsetOfNNaturalnum {

    public static void printset(ArrayList<Integer> d){
        for (int i=0;i<d.size();i++){
            System.out.print(d.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubset(int n,ArrayList<Integer> sub){
        if (n==0){
            printset(sub);
            return;
        }
        
        //add hoga
        sub.add(n);
        findsubset(n-1, sub);

        //add nahi hoga
        sub.remove(sub.size()-1);
        findsubset(n-1, sub);
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList <Integer> subset= new ArrayList<>();
        findsubset(n, subset);
    }
    
}
