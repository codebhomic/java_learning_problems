import java.util.Scanner;

class Problem1 {
    
    public static void main(String[] args) {
        String name = "Dry Run";
        int n = 14;
        if(n%4 == 0){
            System.out.println("Trisect");
        }else{
            System.out.println("Will Not Divisible by 4");
        }
        n = 12;
        if(n%4 == 0){
            System.out.println("Trisect");
        }else{
            System.out.println("Will Not Divisible by 4");
        }
    }
}