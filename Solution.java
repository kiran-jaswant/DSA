public class Solution {
    public static int majorityElement(int[] nums) {
        int n= nums.length;
    

        if(n==1){
            return nums[0];
        }

        for(int i=0; i<n ;i++){
            int count=0;
            for(int j=i+1 ;j<n ;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>=Math.ceil(n/2) ){
                    return nums[i];
                }

            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int nums[]={2,2,3,3,3,3,2};
        System.out.println(majorityElement(nums));
    }
    
}
