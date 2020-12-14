import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
 
public class TurboSort {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            
            while (t-- > 0)
                arr.add(scan.nextInt());
            
            Collections.sort(arr);
            
            arr.forEach(e -> System.out.println(e));
        }
    }
} 