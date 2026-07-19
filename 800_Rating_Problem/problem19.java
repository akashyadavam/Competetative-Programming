import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

             int n = sc.nextInt();
            int[] arr = new int[n];
            int minus=0;int plus=0;
              for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==-1){
                    minus++;
                }
                if(arr[i]==1){
                    plus++;
                }
            }
            int op=0;
            while(minus>plus){
                op++;
                minus--;
                plus++;
            }
            op=minus%2+op;
            System.out.println(op);

    }
}
}
