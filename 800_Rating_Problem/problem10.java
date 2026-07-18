import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
          while (t-- > 0) {
            int i,j;
            int ans=0;
            for(i=0;i<10;i++){
                String  s=sc.next();
                for(j=0;j<10;j++){
                 int   top    = i;
                  int  left   = j;
                   int bottom = 9 - i;
                    int right  = 9 - j;
                    if(s.charAt(j)=='X'){
                        int a=(Math.min(top,Math.min(left,Math.min(bottom,right))));
                        ans=ans+a+1;
                    }
                }
            } 
            System.out.println(ans);       
    }
    
}
}
