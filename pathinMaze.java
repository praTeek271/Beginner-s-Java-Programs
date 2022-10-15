public class pathinMaze {
    public static int countpath(int i,int j,int a,int b){
        if (i==3||j==3){
            return(0);
        }

        if (i==a-1 && j==b-1){
            return(1);
        }
        // move downwards
        int downwardscountpath=countpath(i+1, j, a, b);
        int h=i+1;
        System.out.println("moved to ("+(h)+","+j+")");
        //move rightwards
        int rightwardscountpath=countpath(i, j+1, a, b);
        int k=j+1;
        System.out.println("moved to ("+i+","+(k)+")");
        return (downwardscountpath+rightwardscountpath);
    }

    public static void main(String[] args) {
        int a=3, b=3;
        int i=0,j=0;
        System.out.println(countpath(i, j, a, b));
    }
    
}
