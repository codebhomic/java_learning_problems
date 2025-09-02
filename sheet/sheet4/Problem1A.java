
import java.util.Scanner;

class Problem1A {

    public static void task1() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("M" + i);
        }
    }

    public static void task2() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.print("\n");
        }
    }

    public static void task3() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("A" + i + "B" + i);
        }
    }

    public static void task4() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i * i);
        }
    }

    public static void task5() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i % 3);
        }
    }

    public static void task6() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("y" + j);
            }
            System.out.print("\n");
        }
    }

    public static void task7() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "*" + i + "-" + i + "=" + (i * i - i));
        }
    }

    public static void task8() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int term1 = i;
            int term2 = i * i;
            int term3 = i * i * i;
            int result = term1 + term2 + term3;

            System.out.printf("%d + %d * %d + %d * %d * %d = %d%n",
                    i, i, i, i, i, i, result);
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
}
