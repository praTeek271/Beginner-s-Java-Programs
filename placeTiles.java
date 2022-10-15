//for a floor of size  n X m
// And we have supply of tiles of size 1 X m

public class placeTiles {
    public static int placetiles(int n,int m){
    if (n==m){
        return (2);
    }
    if (n<m){
        return(1);
    }
    //verticslly
    int vertical= placetiles(n-m, m);

    //horizontally
    int horizontal=placetiles(n-1, m);
        return(vertical+horizontal);
    }

    public static void main(String[] args) {
        int n=4,m=2;
       System.out.println(placetiles(n, m));
    }
    
}
