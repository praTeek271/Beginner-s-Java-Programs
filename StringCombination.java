public class StringCombination{
    public static void printpermutations(String str, String permutation){
        //Stopping Case
        if (str.length()==0){
            System.out.print(permutation+"  ");
            return;
        }

        for (int i=0;i<str.length();i++){
            char currele=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            printpermutations(newString, permutation+currele);
        }
    }
    
    
    
    public static void main(String[] args) {
        String str="abc";
        printpermutations(str, "");
    }
}