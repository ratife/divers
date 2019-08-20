import java.math.BigInteger;

public class Fibonaci {
	
	public static void main(String[] args) {
		System.out.println(lenNthKbonacci(300,2000));
	}
	static BigInteger tab[];
	static int  lenNthKbonacci(int k, int n) {
	    tab = new BigInteger[n+1];
	    for(int i=0;i<k;i++)
	       tab[i]=BigInteger.valueOf(1);
	    tab[k] = BigInteger.valueOf(k);
	    BigInteger res =  fib(k,n);
	    return res.toString().length();
	}

	static BigInteger fib(int k,int n){
	    if(tab[n]!=null)
	        return tab[n];
	    BigInteger ret = BigInteger.valueOf(0);
	    for(int i=1;i<=k;i++){
	        if(tab[n-i]==null){
	            tab[n-i] = fib(k,n-i);
	        }
	        ret = ret.add(tab[n-i]);
	    }
	    tab[n] = ret;
	    return ret;
	}
}
