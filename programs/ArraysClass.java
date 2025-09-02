// import java.util.Scanner;

class ArraysClass{
    public static void task1(){
        // Scanner scn = new Scanner(System.in);
        // int[][] c = new int[5][]; // this is 2d array
    }

    public static void task2() {
        int[] a,b; // valid
        a = new int[5];
        b = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i!=0 ? 4*i : 1;
            b[i] = i!=0 ? 5*i : 1;
        }
        System.out.print("Array a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println();
        System.out.print("Array b:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+b[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        task2();
    }
}