package Listenverwaltung;

import java.util.Scanner;

public class Sort {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Please choose a number for an option : ");
    }

    public static void main() {
        String[] options = {
                "1. Sort by first name",
                "2. Sort by last name",
                "3. Sort by Course of studies",
                "4. Sort by Matriculation number",
                "0. Back"
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                      //  option3();
                        break;
                    case 4:
                      //  option4();
                        break;
                    case 0:
                        Menu.main();

                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }

    // Options
    //www.geeksforgeeks.org/quick-sort
    //https://stackabuse.com/sorting-algorithms-in-java


}
