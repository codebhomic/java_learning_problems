
import java.util.Scanner;

class Program {

    public static void task1() {
        Scanner scn = new Scanner(System.in);
        int[] a;
        int n, SIZE, sumb3 = 0, suma3 = 0;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        for (int i = 0; i < SIZE; i++) {
            suma3 += a[i] > 3 ? a[i] : 0;
            sumb3 += a[i] < 3 ? a[i] : 0;
        }
        System.out.println("Below 3: " + sumb3);
        System.out.println("Above 3: " + suma3);
    }

    public static void task2() {
        Scanner scn = new Scanner(System.in);
        int[] a;
        int n, SIZE;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        System.out.println("Array: ");
        for (int i = 0; i < SIZE; i++) {
            if (a[i] >= 100 && a[i] <= 200 && a[i] % 4 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    public static void task3() {
        //how will we going to describe size dynamically
    }

    public static void task4() {
        Scanner scn = new Scanner(System.in);
        int[] a;
        int n, SIZE, smallest, greatest;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        smallest = a[0];
        greatest = a[0];
        for (int i = 0; i < SIZE; i++) {
            if (smallest > a[i]) {
                smallest = a[i];
            }
            if (greatest < a[i]) {
                greatest = a[i];
            }
        }
        System.out.print("Sum is: ");
        System.out.println(smallest + greatest);
    }

    public static void task5() {
        Scanner scn = new Scanner(System.in);
        int[] a;
        int n, SIZE, b = 0;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        for (int i = 0; i < SIZE; i++) {
            if (a[i] % 2 != 0) {
                b++;
                System.out.print(a[i]);
            } else {
                continue;
            }
            System.out.print("#");
        }
        System.out.println("\nSize: " + b);
    }

    public static void task6() {
        Scanner scn = new Scanner(System.in);
        int[] a;
        int n, SIZE;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        System.out.println("Array: ");
        for (int i = 0; i < SIZE; i++) {
            if (a[i] >= 3 && a[i] <= 99 && a[i] % 3 == 0 && a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }

    public static void task7() {
        Scanner scn = new Scanner(System.in);
        int[] a,b,c;
        int n, ASIZE, BSIZE,j=0;
        System.out.print("Enter Size of Arrays A: ");
        ASIZE = scn.nextInt();
        a = new int[ASIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < ASIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        System.out.print("Enter Size of Arrays B: ");
        BSIZE = scn.nextInt();
        b = new int[BSIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < BSIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            b[i] = n;
        }
        int CSIZE = a.length + b.length;
        c = new int[CSIZE];
        System.out.println("Array: ");
        for (int i = 0; i < ASIZE; i++) {
            if (a[i] % 2 != 0 && a[i] % 3 != 0) {
                c[j++] = a[i];
            }
        }
        for (int i = 0; i < BSIZE; i++) {
            if (b[i] % 2 != 0 && b[i] % 3 != 0) {
                c[j++] = b[i];
            }
        }
        System.out.println("Size: "+j);
        System.out.println("Array: ");
        for (int i = 0; i < CSIZE; i++) {
            if(c[i]!=0)
            System.out.println(c[i]);
        }
    }

    public static void task9() {
        Scanner scn = new Scanner(System.in);
        int[] a;
        int n, SIZE;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        System.out.println("Array: ");
        for (int i = 0; i < SIZE; i++) {
            if (a[i] >= 3 && a[i] <= 99 && (a[i] % 3 == 0 || a[i] % 4 == 0) && a[i] % 12 != 0) {
                System.out.println(a[i]);
            }
        }
    }

    public static void taskn2() {
        Scanner scn = new Scanner(System.in);
        int[] a, b;
        int n, SIZE, j = 0;
        boolean found = false;
        System.out.print("Enter Size of Arrays: ");
        SIZE = scn.nextInt();
        a = new int[SIZE];
        b = new int[SIZE];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            n = scn.nextInt();
            a[i] = n;
        }
        for (int i = 0; i < SIZE; i++) {
            if (a[i] >= 100 && a[i] <= 200 && a[i] % 4 == 0) {
                b[j++] = a[i];
                found = true;
            }
        }
        if (found) {
            System.out.println("Array: ");
            for (int i = 0; i < SIZE; i++) {
                if (b[i] != 0) {
                    System.out.println(b[i]);
                }
            }
        } else {
            System.out.println("No Element in the array which is in between 100 and 200 and multiple of 4.");
        }
        // System.out.println(a[i]);
    }

    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        task7();
        // task9();
    }
}
