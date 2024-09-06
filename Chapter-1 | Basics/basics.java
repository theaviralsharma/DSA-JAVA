import java.util.Scanner;
import java.lang.reflect.Array;

public class basics {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Scanner class is used to take input from user

        System.out.println("Hello World");

        // Taking input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // Output
        System.out.println("Hello " + name);
        sc.close();


        // Primitive Data Types
        byte b = 127; // -128 to 127 - 8 bit or 1 byte
        short s = 32767; // -32768 to 32767 - 16 bit or 2 bytes
        char c = 'A'; // 0 to 65535 - 16 bit or 2 bytes
        boolean bool = true; // true or false - 1 bit
        int i = 2147483647; // -2147483648 to 2147483647 - 32 bit or 4 bytes
        long l = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807 - 64 bit or 8 bytes
        float f = 3.4028235E38f; // -3.4028235E38 to 3.4028235E38 - 32 bit or 4 bytes
        double d = 1.7976931348623157E308; // -1.7976931348623157E308 to 1.7976931348623157E308 - 64 bit or 8 bytes

        // Non Primitive Data Types
        String str = "Hello World"; // String is a class in Java - 16 bit or 2 bytes
        int[] arr = {1, 2, 3, 4, 5}; // Array of integers - 1D Array
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 2D Array of integers - Array of Arrays

        // Output
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("String: " + str);
        System.out.println("Array: " + Array.get(arr, 0));
        System.out.println("2D Array: " + Array.get(Array.get(arr2D, 0), 0));

        // Type Conversion - byte -> short -> int -> long -> float -> double
        int x = 10;
        double y = x; // Implicit Type Conversion
        System.out.println("Implicit Type Conversion: " + y);

        double z = 10.5;
        int w = (int) z; // Explicit Type Conversion
        System.out.println("Explicit Type Conversion: " + w);

        // Type Casting
        int a = 10;
        double e = 10.5;
        int r = (int) e; // Narrowing Casting
        double t = a; // Widening Casting
        System.out.println("Narrowing Casting: " + r);
        System.out.println("Widening Casting: " + t);
    }  
}