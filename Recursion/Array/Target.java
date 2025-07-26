//Find the target element in array and retun its index using recursion

public class Target {
    static int findTargetIdx(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }
        return findTargetIdx(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int target=8;

        int ans =findTargetIdx(arr,target,0);
        System.out.println(ans);
    }
    
}
