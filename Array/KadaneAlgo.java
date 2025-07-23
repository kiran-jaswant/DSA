public class KadaneAlgo {
    public static int maxSubArrSum(int [] arr){
        int n= arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            
            if(currSum>maxSum){
                maxSum=currSum;
                }
            
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int sum=maxSubArrSum(arr);
        System.out.println("sum: "+ sum);

        
    }
    
}
