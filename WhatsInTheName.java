import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class WhatsInTheName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String st[] = br.readLine().split(" ");
			
			for (int i = 0; i < st.length; i++){
				if (i == st.length - 1) st[i] = Character.toUpperCase(st[i].charAt(0)) + st[i].substring(1).toLowerCase();
				else st[i] = Character.toUpperCase(st[i].charAt(0)) + ".";
				System.out.print(st[i] + " ");
			}
			System.out.print("\n");
        }
    }
}