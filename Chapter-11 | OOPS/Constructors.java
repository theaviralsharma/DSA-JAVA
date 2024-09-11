public class Constructors{
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "Tony";
        s1.rollNo = 234;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 60;


        // Suppose s1 forgets his password; // then use copy constructor
        Student s4 = new Student(s1);
        s4.password = "xyz";
        s1.marks[2] = 30;
        
        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }



        // Student s2 = new Student("Aviral Sharma"); 
        // Student s3 = new Student(123);  
    }    
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
        Student(Student s1){
                marks = new int[3];
                this.name = s1.name;
                this.rollNo = s1.rollNo;
                for(int i=0; i<marks.length; i++){
                    this.marks[i] = s1.marks[i]; 
                }
        }

    Student() { //Constructor
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollNo){
        marks = new int[3];
        this.rollNo = rollNo;
    }
}
