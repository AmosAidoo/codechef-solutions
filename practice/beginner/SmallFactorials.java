import java.util.Scanner;
import java.math.BigInteger;

class SmallFactorials {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        int t, n;
        BigInteger bi;
        t = scan.nextInt();
        
        while(t-- > 0){
            n = scan.nextInt();
            bi = factorial(n);
            System.out.println(bi);
        }
        scan.close();
	}
	
	static BigInteger factorial(int n){
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
