public class Power {
    static int power(int p,int q){
        if(q==0){
            return 1;

        }

        if(q%2==0){
            int smallpow=power(p,q/2);
            return smallpow* smallpow;
        }else{
            int smallpow=power(p,q/2);
            return p*smallpow*smallpow;

        }

        
    }
    public static void main(String[] args) {
        int p=2;
        int q=5;

        int ans=power(p,q);
        System.out.println(ans);
    }
    
}
