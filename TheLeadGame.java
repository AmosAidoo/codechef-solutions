import java.util.Scanner;
public class TheLeadGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, S = 0, T = 0, W = 1, L = 0;
        String ST, arr[];
        N = scan.nextInt();
        scan.nextLine();
        for (int i =1; i <= N; i++){
            ST = scan.nextLine();
            arr = ST.split(" ");
            S += Integer.parseInt(arr[0]);
            T += Integer.parseInt(arr[1]);
            
            if (Math.abs(S - T) > L){
                L = Math.abs(S - T);
                W = (S > T) ? 1 : 2;
            }            
        }
        System.out.println(W + " " + L);
        scan.close();
    }
}