
//Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();
        System.out.println(letra.replace("a","b"));
    }
}
