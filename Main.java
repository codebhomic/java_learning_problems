import java.io.*;
import java.util.Scanner;
class Main {
	String name;
	Employee(String name){
		this.name = name;	
	}
	void display() {
		System.out.println("Your name is: "+ this.name);
	}
}

public class First {
	
	public static String name = "Bhoumic Garg";
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// datatypes
		//boolean b1 = true;
		//boolean b2 = false; // 1byte value stores
        byte b3 = 100; // stores 1byte signed value
        short b4 = 10000; // stores 16bit or 2 byte signed
        int b2 = 1000000000; // int stores values of 4byte signed java se 8+ can be unsigned
        float b1 = 10443222222343f;// float includes 4byte signed and f at last is important
        double b6 = 1044322222212343.2412400d;// float includes 8byte signed or 64 bit signed and d at last is important 
        long b5 = 1014298793879798799l;// stores 64 bit or 8 byte and l at last java se 8+ can be unsigned
        char b7 = 'a';
        String b8 = "String";
        System.out.println(b3+": byte \n");
        System.out.println(b4+": short \n");
        System.out.println(b2+": int \n");
        System.out.println(b1+": float \n");
        System.out.println(b6+": Double \n");
        System.out.println(b5+": Long \n");
        System.out.println(b7+": Charactor");
        System.out.println(b8+": String \n");
        
        Employee details = new Employee("Bhoumic Garg");
        details.display();
        System.out.println(details.name);
        
        int x = 10;// x is a local variable
        String message = "Hello, World!";
        System.out.println(message);
        System.out.println(name);
        if (x > 5) {
            String result = "x is greater than 5";// result is a local variable
            System.out.println(result);
        }
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Name:- ");
        String userName = scn.nextLine();
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("User's Name is "+ userName+"\nSum: " + sum(a,b));
        
        
        
        
	}
}
