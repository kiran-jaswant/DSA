package Array;
import java.util.*;

public class LargestNumber {
    public static int largestNum(int numbers[]){
        int max=Integer.MIN_VALUE;

        for(int i=0 ;i<numbers.length ;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int numbers[]=new int[n];
        for(int i=0 ; i<n ; i++){
            numbers[i]=sc.nextInt();

        }

        System.out.println("The largest number in the array is:"+ largestNum(numbers));
    }
}
