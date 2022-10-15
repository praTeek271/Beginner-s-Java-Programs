public class RemoveDublicate {
    public static boolean[] map=new boolean[26];

    public static void removeChar(String str,int indx,String NewString) {
        if (indx==str.length()){
            System.out.println(NewString);
            return;
        }
        char currele=str.charAt(indx);
        if (map[currele-'a']==false){
            NewString+=currele;
            map[currele-'a']=true;
            removeChar(str, indx+1, NewString);
        }
        else{
            removeChar(str, indx+1, NewString);
        }
        
    }

    public static void main(String[] args) {
        // this code is applicable for lower case letters
        String st="sstddweer";
        removeChar(st, 0, "");
        
    }
    
}

    

