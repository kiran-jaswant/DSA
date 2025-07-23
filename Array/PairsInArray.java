public class PairsInArray {

    public static void printPairs(int numbers[]){

        int n= numbers.length;
        int count=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+ numbers[i]+","+ numbers[j]+") ");
                count++;

            }
            System.out.println();
        }
        System.out.println("Total pairs in the array are:" + count);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,16};
        printPairs(numbers);
    }
    
}
