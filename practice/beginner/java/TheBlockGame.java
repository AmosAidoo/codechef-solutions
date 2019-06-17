import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TheBlockGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String s = br.readLine();
            System.out.println((s.equals(new StringBuilder(s).reverse().toString())) ? "wins" : "losses");
        }
    }
}