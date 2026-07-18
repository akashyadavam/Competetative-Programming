import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
         while (t-- > 0) {

             int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }  
            
           boolean fla=false;
            for (int i = 0; i < n; i++) {
                if(arr[i]==k){
                    fla=true;
                    break;
                }
            } 
            if(fla){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
    }
}
}
