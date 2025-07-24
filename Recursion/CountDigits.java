public class CountDigits {
    public static int countDig(int n){
        if(n==0){
            return 0;
        }

        return 1+countDig(n/10);
    }
    public static void main(String[] args) {
        int n=1234578;
        System.out.println(countDig(n));
    }
    
}
