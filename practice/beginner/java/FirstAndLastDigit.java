import java.util.Scanner;
class FirstAndLastDigit {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T-- > 0){
		    int N = scan.nextInt();
		    int n = (int)Math.floor(Math.log10(N));
		    int result = N % 10 + N / (int)Math.pow(10, n);
		    System.out.println(result);
        }
        scan.close();
	}
}