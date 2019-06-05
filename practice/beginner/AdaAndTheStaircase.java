/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){//Scanner object to recieve user input
            //Variable declarations
            int T, N, K, h[];
            String nums[], nk[];
            //Inputs
            T = scan.nextInt();
            scan.nextLine();
            for(int t = 1; t <= T; t++){
                String N_K = scan.nextLine();
                
                String hn = scan.nextLine();

                nk = N_K.split(" ");
                nums = hn.split(" ");
                N = Integer.parseInt(nk[0]);
                K = Integer.parseInt(nk[1]);
                h = new int[N + 1];

                for(int i = 1; i < h.length; i++){
                    h[i] = Integer.parseInt(nums[i - 1]);
                }

                int intermediateSteps = intermediate_steps(K, h);
                System.out.println(intermediateSteps);
            }
        }
        
    }
    
    static int intermediate_steps(int K, int h[]){
        //Store number of intermediate steps
        int intermediate_steps = 0;
        
        for(int i = 0; (i+1) < h.length; i++){
            //hd = Height difference
            int hd = h[i+1] - h[i];
            
            if (hd % K != 0)
                intermediate_steps += (hd / K);
            else
                intermediate_steps += (hd / K) - 1;
        }
        return intermediate_steps;
    }
}
