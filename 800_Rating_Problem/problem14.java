import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

             while (t-- > 0) {
            int[] arr = new int[3];

            for (int i = 0; i <= 2; i++) {
                arr[i] = sc.nextInt();
            } 
            int a=arr[0];
            int b=arr[1];
            int c=arr[2];
            if(c%2==0){
                b=b;
            }
            else{
                b=b-1;
            }
            if(a>b){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
            
    }
}
}
