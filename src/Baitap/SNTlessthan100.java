package Baitap;

public class SNTlessthan100 {
    public static void main(String[] args) {
        for (int n=2; n<=100; n++){
            int count =0;
            for (int i=1; i<=n; i++){
                if (n%i==0){count++;}
            }
            if (count>2){
                continue;
            }
            else {
                System.out.println(n);
            }
        }
    }
}
