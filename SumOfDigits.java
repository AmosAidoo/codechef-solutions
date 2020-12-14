import java.util.Scanner;;

class SumOfDigits {
	public static void main (String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            int t, n;
            t = scan.nextInt();
            
            while(t-- > 0){
                n = scan.nextInt();
                System.out.println(sum_of_digits(n));
            }
        }    
    }
    
    static int sum_of_digits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
