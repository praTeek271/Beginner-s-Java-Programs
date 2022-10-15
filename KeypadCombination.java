public class KeypadCombination {
    public static String[] keypad={".","abc","def","ghi","jkl","lmo","pqrs","tu","vwx","yz"};

    public static void printcomb(String str,String cmbinations,int indx){
        if(indx==str.length()){
            System.out.print(cmbinations+"  ");
            return;
        }

        char currele=str.charAt(indx);
        String mapping =keypad[currele-'0'];

        for (int i=0;i<mapping.length();i++){
            printcomb(str, cmbinations+mapping.charAt(i), indx+1);
        }
    }
    public static void main(String[] args) {
        String str="16";
        printcomb(str, "", 0);
    }
}
