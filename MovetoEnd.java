public class MovetoEnd {
    public static void moveChar(String srt,int count,int indx,char ele,String NewString) {
        if (indx==srt.length()-1){
            for (int i=0;i<count;i++){
                NewString+=ele;
            }
            System.out.println(NewString);
            return;
        }
        char currele=srt.charAt(indx);
        if (currele==ele){
            count++;
        }else{
            NewString+=currele;

        }
        moveChar(srt, count, indx+1, ele,NewString);
    }

    public static void main(String[] args) {
        String st="Assseftd";
        moveChar(st, 0, 0, 's',"");
    }
    
}
