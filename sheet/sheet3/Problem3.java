import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for(int i=1; i <= n; i++){
            for(int j = 1; j <= i; j++){
            System.out.print(j);
            }
            System.out.println();
        }
    }
}