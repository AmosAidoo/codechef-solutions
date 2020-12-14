import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class LifeTheUniverseAndEverything {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

        while (true){
            int i = Integer.parseInt(br.readLine());
            if (i == 42)
                break;
            System.out.println(i);
        }
        br.close();
    }
}