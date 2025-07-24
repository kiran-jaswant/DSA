public class Febonacci {
    public static int printFibo(int n){
        if(n==1 || n==0){
            return n;
        }

        return printFibo(n-1)+printFibo(n-2);
    }
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            System.out.print(printFibo(i)+" ");
        }
    }
    
}
