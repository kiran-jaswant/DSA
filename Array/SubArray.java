public class SubArray{
    public static void printSubArrays(int [] arr){
        int n=arr.length;
        int count=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                
                    
                }
                count++;
                if(sum>maxSum){
                    maxSum=sum;
                }
                System.out.println();
                System.out.println("Sum of this subarray is "+sum);
                
                sum=0;

            }
        }
        System.out.println("Total numbers of subarrays:" + count);
        System.out.println("Max sum among all subarrays is:"+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArrays(arr);
    }
}