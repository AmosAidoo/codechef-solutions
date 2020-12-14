import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Amos_Aidoo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        run();
    }
    
    static void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        try {
            int T = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < T; i++){
                st = new StringTokenizer(br.readLine());
                long L = Long.parseLong(st.nextToken());
                long R = Long.parseLong(st.nextToken());
                sb.append(xoring(L, R)).append("\n");
            }
            
            System.out.println(sb);
        } catch (IOException e){}
    }
    
    static String xoring(long L, long R) {
        long count = oddCount(L, R);
        return (count % 2 == 0) ? "Even" : "Odd";
    }
    
    private static long oddCount(long L, long R){
        //2 even numbers at the extremes
        if (L % 2 == 0 && R % 2 == 0)
            return (R - L) / 2;
        //2 odds numbers at the extremes
        else if (L % 2 == 1 && R % 2 == 1)
            return 2 + (((R - 1) - (L + 1)) / 2);
        //1 even, 1 odd numbers at the extremes
        else
            return ((R - L) + 1) / 2;        
    }
}
