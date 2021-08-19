package project2;

public class HomeWork2 {
    public static void main(String[] args) {
        checkNumber(5, 10);
        printCheckNumber(-8);
        booleanCheckNumber(9);
        printString("Hello World!", 10);
        leapYear(2021);
    }
    public static boolean checkNumber(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
         }
    public static void printCheckNumber(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        System.out.println("**************");
    }
    public static boolean booleanCheckNumber(int a) {
        return a >= 0;
    }
    public static void printString(String b, int c) {
        int a = 1;
        while (a <= c) {
            System.out.println(b);
            a++;
        }
        System.out.println("**************");
    }
    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return (year % 4 == 0) && (year % 100 != 0);
        }
    }
}