import java.util.Scanner;

public class arrays {
    public static void addMarks(int marks[]){
        marks[0] += 1; 
        System.out.println(marks[0]);
    }
    public static void main(String[] args) {
        // Create an Array
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3 };
        String fruits[] = {"apple","mango","orange"};        
        System.out.println(numbers[0]);
        System.out.println(fruits[0]);

        // Input in Array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        System.out.println(marks[0]);
        sc.close();

        // Length of Array
        System.out.println(marks.length);

        // Paasing arrays as argument as reference
        addMarks(marks); // changes done in function also changes original array

    }    
}
