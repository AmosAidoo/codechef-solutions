import java.util.Scanner;

/**
 * @author Amos Aidoo
 */

public class EnormousInputTest {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,t[];
        int count = 0;

        n = input.nextInt();
        k = input.nextInt();

        t = new int[n];

        for (int i=0; i<t.length;i++){
            t[i] = input.nextInt();
            if(t[i]%k==0){
                count+=1;
            }
        }
        System.out.println(count);
        input.close();
    }
}
