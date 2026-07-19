import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxgap=arr[0]-0;
             for (int i = 1; i <n; i++) {
                maxgap=Math.max(maxgap, arr[i]-arr[i-1]);
                
               
            }
             maxgap=Math.max(maxgap, 2*(x-arr[n-1]));
            System.out.println(maxgap);
            

        }
    }
    
}
