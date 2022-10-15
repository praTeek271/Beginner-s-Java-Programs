// we will be taking   "Low=0"  and "High=len(arr)-1"
//recursive function----
public class QuickSort {
    //
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return(i);
    }

    public static void quicksort(int arr[],int low,int high) {
        if (low<high){
            int pidx=partition(arr,low,high);
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);
        }
    }
    public static void main(String y[]){
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        quicksort(arr,0,n-1);
        //print

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
