import java.util.Scanner;
class NumberMirror {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            int n = scan.nextInt();
            System.out.println(n);
        }
    }
}