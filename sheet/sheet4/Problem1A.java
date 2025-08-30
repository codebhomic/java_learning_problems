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

    public static void main(String[] args) {
        // task1();
    }
}
