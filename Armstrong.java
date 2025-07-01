public class Armstrong {

    public static int countDigits(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    public static void printArmstrong(int n){
        for(int i=1;i<=n;i++){
            int sum=0;
            int count=countDigits(i);
            int num=i;
            while(num>0){
                int lastdigit=num%10;
                sum+=Math.pow(lastdigit,count);
                num=num/10;

            }
            if(sum==i){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int n=2000;
        printArmstrong(n);
    }
    
}
