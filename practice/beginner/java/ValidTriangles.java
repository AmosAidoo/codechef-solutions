import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ValidTriangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            String[] s = br.readLine().split(" ");
            int sum = 0;
            for (String i : s)
                sum += Integer.parseInt(i);
            System.out.println(sum == 180 ? "YES" : "NO");
        }
        br.close();
    }
}