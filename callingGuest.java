public class callingGuest{
    public static int calling(int n){
        if (n<=1){
            return 1;

        }
        //single
        int way1=calling(n-1);

        //paired
        int way2=(n-1)*calling(n-2);
        return(way1+way2);
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(calling(n));
    }
}