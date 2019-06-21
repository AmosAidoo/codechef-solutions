import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0){
            int n, k, xors, large, prev_xor = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            String s[] = br.readLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(s[i]);
            }

            for (int i = 0; i < k; i++)
                    prev_xor ^= arr[i];
            large = prev_xor;

            for (int i = k;i < n; i++){
                prev_xor = (prev_xor ^ arr[i - k]) ^ arr[i]; 
                large = Math.max(prev_xor, large);
            }

            System.out.println(large);
        }
    }
    
}
