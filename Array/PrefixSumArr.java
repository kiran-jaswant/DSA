public class PrefixSumArr {
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void printPrefixSumArr(int [] arr){
         int n=arr.length;
         int [] prefix=new int[n];

         int sum=0;
         int maxSum=Integer.MIN_VALUE;
         //creating prefix sum array
         prefix[0]=arr[0];
         for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];

         }
         //print prefix arr
         printArr(prefix);
         
         //finding sum of max subarray using prefix sum array
         for(int i=0;i<n;i++){       //start idx
            for(int j=i;j<n;j++){    //end idx
                if(i==0){
                    sum=prefix[i];
                }else{
                 sum=prefix[j]-prefix[i-1];
                }
                 if(sum>maxSum){
                    maxSum=sum;
                 }
            }
         }
         System.out.println("max sub of subarray is "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printPrefixSumArr(arr);
    }
    
}
