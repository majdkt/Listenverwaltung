package Listenverwaltung;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.exit;

public class Menu {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Please choose a number for an option : ");
    }

    public static Stack<Students> main() {
        String[] options = {
                "1. Generate sample with 10 Students",
                "2. Add new Student",
                "3. Show last added Student",
                "4. Show List of Students",
                "5. Delete All",
                "6. Size of the List",
                "7. Search",
                "8. Sort list",
                "0. Exit.",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 9) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        Console.generateSample();
                        break;
                    case 2:
                        Console.addNew();
                        break;
                    case 3:
                        Console.showLastAdded();
                        break;
                    case 4:
                        Console.showList();
                        break;
                    case 5:
                        Console.deleteAll();
                        break;
                    case 6:
                        Console.sizeOfList();
                        break;
                    case 7:
                        Console.searchFortStudent();
                        break;
                    case 8:
                        Console.sortStudents();
                        break;
                    case 0:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
        return null;
    }
}
