import java.util.Scanner;

class ATM {
	static int x;
    static double y;
    
    /**
     * 
     * @param ar
     */
	public static void main(String ar[]){
		Scanner sc =new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextDouble();
		if(x%5==0&&x+0.5<=y&&x<=2000&&y<=2000)
		{
			y=y-(x+0.5);
		}
        System.out.printf("%.2f",y);
        sc.close();
	}
}