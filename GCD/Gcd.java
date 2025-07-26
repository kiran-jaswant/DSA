public class Gcd {
    static int normalGcd(int x,int y){
        for(int i=Math.min(x,y);i>0;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 1;
    }

    static int iterativeGcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;

        }
        return y;
    }

    //Recursive approach is based on the Euclidian Algorithm
    //GCD(x,y)= GCD(y , x%y)
    //GCD(x,0)= x

    static int recursiveGcd(int x ,int y){
        if(y==0){
            return x;
        }

        return recursiveGcd(y, x%y);

    }
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 13;

        System.out.println("GCD using normal gcd: "+normalGcd(num1, num2));

        System.out.println("GCD using iterative approach: "+ iterativeGcd(num1,num2));

        System.out.println("GCD using recursive appproach: "+ recursiveGcd(num1,num2));
    }

}
