package BinerySearch;

public class BinerySearch {
    public static int search(int[] num, int tgt){
        int n=num.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(tgt>num[mid])
              st=mid+1;
            else if(tgt<num[mid])
              end=mid-1;
            else
              return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 7, 9, 11};
        int target=11;
        int result = search(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}
