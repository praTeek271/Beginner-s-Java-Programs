public class SubSequence{
    public static void subsequence(String str,int indx,String newstString) {
        if (indx==str.length()){
            System.out.println(newstString);
            return;
        }


        char currele=str.charAt(indx);
        //char will join 
        subsequence(str, indx+1, newstString+currele);
        //char will not join
        subsequence(str, indx+1, newstString);
        
    }

    public static void main(String[] args) {
        subsequence("abc", 0, "");
    }
    
}