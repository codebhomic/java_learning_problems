import java.util.*;

class Patterns {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        String num1 = "";
        String num2 = "";
        for (int i = 1; i <= n; i++) {
            num1 = num1 + i;
            System.out.print(num1 + num2);
            num2 = i + num2;
            // for (int j = i-1; j >0; j--) {
            //     System.out.print(j);
            // }
            System.out.print("\n");
        }
    }
}
