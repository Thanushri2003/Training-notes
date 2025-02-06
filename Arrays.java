package com.mphasis.Javaprograms;
import java.util.Scanner;

public class Arrays  {

    public static void displayNames(char[][] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        char[][] names = new char[n][];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names[i] = name.toCharArray();
        }

        System.out.println("\nDisplaying the names you entered:");
        displayNames(names);

        scanner.close();
    }
}
