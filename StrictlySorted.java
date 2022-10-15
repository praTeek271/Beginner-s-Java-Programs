// import java.util.Scanner;

public class StrictlySorted {
    public static Boolean checksort(int indx,int lst[]) {
        
        if(indx==lst.length-1){
            return (true);
        }
        
        if (lst[indx]<lst[indx+1]){
            return checksort(indx+1, lst);
        }else{
            return(false);
        }
    }

    public static void main(String[] args) {
  
        int[] lst={1,2,3,4,5};
        System.out.println(checksort(0, lst));
    }
}
