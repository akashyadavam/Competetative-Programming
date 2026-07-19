import java.util.ArrayList;
import java.util.Scanner;

public class problem13 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
             int[] a = new int[n];
             int max=Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]>max){
                    max=a[i];
                }
            }

                ArrayList<Integer> b= new ArrayList<>();
                ArrayList<Integer> c= new ArrayList<>();
                 for (int i = 0; i < n; i++) {
                    if(a[i]!=max){
                    b.add(a[i]);}
                    else{
                        c.add(max);
                    }

                 }
                 if(b.size()==0) {
                    System.out.println(-1);continue;
                 }
                 System.out.println(b.size()+" "+c.size());
                  for (int i = 0; i <b.size(); i++) {
                 System.out.print(b.get(i)+" ");
                }
                 System.out.println();
                   for (int i = 0; i <c.size(); i++) {
                 System.out.print(c.get(i)+" ");}
                 System.out.println();


            }
   } 
}
