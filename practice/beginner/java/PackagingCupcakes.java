import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PackagingCupcakes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T, N;
        T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            N = Integer.parseInt(br.readLine());
            sb.append((int)(Math.ceil(N / 2) + 1)).append("\n");
        }
        System.out.print(sb);
    }
}