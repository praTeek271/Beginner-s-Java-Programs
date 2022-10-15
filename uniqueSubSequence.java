import java.util.HashSet;

public class uniqueSubSequence {
    public static void uniqsubsequence(String str,int indx,String newstString,HashSet<String> hs) {
        if (indx==str.length()){
            if (hs.contains(newstString)){
                return;
            }else{
            System.out.println(newstString);
            hs.add(newstString);
            return;}
        }


        char currele=str.charAt(indx);
        //char will join 
       
        uniqsubsequence(str, indx+1, newstString+currele,hs);
        //char will not join
        uniqsubsequence(str, indx+1, newstString,hs);
        
    }

    public static void main(String[] args) {
        HashSet <String> hs=new HashSet<>();
        uniqsubsequence("abs", 0, "",hs);
    }
    
}
