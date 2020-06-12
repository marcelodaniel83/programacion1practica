/*
Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both.
Print the substring enclosed in this range.
Both numbers are always greater than or equal to 0 and less than the string length.
*/


import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       String line = scanner.nextLine();
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();

        System.out.println(line.substring(rangeStart, rangeEnd + 1));

    }
}
