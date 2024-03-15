package Baitap;
import java.util.Scanner;
public class hienthihinh {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lựa chọn:");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                // rectangle
                for (int i=0;i<3;i++){
                    for(int j=0;j<6;j++){
                        System.out.print("*  ");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                // triangle
                for (int i=0;i<5;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*  ");
                    }
                    System.out.println("*");
                }
                break;
            case 3:
                // upsidedown triangle
                for (int i=5;i>=0;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*  ");
                    }
                    System.out.println("*");
                }
                break;
            case 4:
                // exit
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
