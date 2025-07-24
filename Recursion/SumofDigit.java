public class SumofDigit {
    public static int sumDigit(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + sumDigit(n/10);
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sumDigit(n));
    }
    
}
