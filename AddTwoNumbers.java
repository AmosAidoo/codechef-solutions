import java.util.Scanner;

public class AddTwoNumbers {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Number of test cases
        int n = scan.nextInt();
        int [] arr = new int[n*2];

        //Numbers to add
        for(int i=0;i< arr.length;i++){
            arr[i] = scan.nextInt();
        }

        for (int i=0;i+1 <arr.length;i+=2){
            System.out.println(sum (arr[i],arr[i+1]));
        }
        scan.close();
    }
         
    public static int sum (int a, int b) {
        return a+b;
    }
  
}