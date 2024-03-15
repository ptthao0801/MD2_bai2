package Baitap;
import java.util.Scanner;
public class hienthi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số các số nguyên tố muốn in ra:");
        int number = scanner.nextInt();
        int countSNT =0;
            for (int n=2; ; n++){
                int count =0;
                for (int i=1; i<=n; i++){
                    if (n%i==0){count++;}
                }
                if (count>2){
                    continue;
                }
                else {
                    System.out.println(n);
                    countSNT++;
                    if (countSNT==number){break;}
                }
            }
        }
    }
