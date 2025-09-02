import java.util.Scanner;

class Program1 {

    public static void task1() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void task2() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2 == 0)
                System.out.print(0);
                else
                System.out.print(1);
            }
            System.out.print("\n");
        }
    }

    public static void task3() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i+i; j++) {
                if(j<=i)
                System.out.print(j);
                else
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void task6() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void task7() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task6();
        task7();
    }
}
