import java.util.HashMap;
import java.util.Scanner;

public class problem7{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
               HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            if (map.size() == 1) {
                System.out.println("YES");
            }

            else if (map.size() > 2) {
                System.out.println("NO");
            }

            else {

                int f1 = 0, f2 = 0;

                for (int freq : map.values()) {
                    if (f1 == 0)
                        f1 = freq;
                    else
                        f2 = freq;
                }

                if (Math.abs(f1 - f2) <= 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
    
}

