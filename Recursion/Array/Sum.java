//Sum of all array elements using recursion

public class Sum {
    static int findSum(int [] arr,int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i]+findSum(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};

        int ans=findSum(arr,0);
        System.out.println(ans);
    }
    
}
