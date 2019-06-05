import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t, n, a, b;
        String input, a_b[];
        t = scan.nextInt();
        scan.nextLine();
        while(t-- > 0){
            input = scan.nextLine();
            a_b = input.split(" ");
            a = Integer.parseInt(a_b[0]);
            b = Integer.parseInt(a_b[1]);
            
            System.out.println(rem(a, b));
        }
    }
    
    static int rem(int a, int b){
        while((a - b) >= 0){
            a = a - b;
        }
        return a;
    } 
}
