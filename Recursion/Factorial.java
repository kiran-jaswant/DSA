public class Factorial {
    public static int printFact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*printFact(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Factorial of "+ n+ " is "+ printFact(n));
    }
    
}
