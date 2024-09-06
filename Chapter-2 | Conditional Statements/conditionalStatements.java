public class conditionalStatements {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 13;

        if(a>b && a>c){
            System.out.println(a+" is greatest");
        } else if(b>a && b>c) {
            System.out.println(b+" is greatest");
        } else {
            System.out.println(c+" is greatest");
        }

        // Ternary Operator
        String type = (a%2==0)? "even" : " odd";
        System.out.println(type);

        // Switch statement to determine the name of the day
        int day = 3; // Let's assume the value 3 represents Wednesday
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

        // Leap Year
        int year = 2024;
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }   
    }    

