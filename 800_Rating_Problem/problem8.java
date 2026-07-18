import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        

        while (t-- > 0) {
             int n = sc.nextInt();
            int m = sc.nextInt();
           String x=sc.next();
           String s=sc.next();
           int operation=0;
           if(x.contains(s)){
            System.out.println(0);
            continue;
           }
           int ans=-1;
           for(int i=1;i<=6;i++){
            if(x.contains(s)){
                ans=operation;
                break;

            }
            else{
                  x+=x;
                  operation++;
            }
           }
           if (ans == -1 && x.contains(s)) {
                 ans = operation;
                   System.out.println(ans);
                }
             else{
                 System.out.println(ans);

             }   
          
           

    }
}
}