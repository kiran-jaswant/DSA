//Find the max element from array using recursion 

public class Max {
    static int findMax(int [] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }

        int smallAns=findMax(arr, i+1);

        if(arr[i]>smallAns ){
            return arr[i];
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,15,4,7,2};

        int ans=findMax(arr,0);
        System.out.println(ans);
    }
    
}
