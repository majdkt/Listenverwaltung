package Listenverwaltung;
import java.util.*;

public class Console extends Stack<Students> {
    private static final Stack<Students> stack = new Stack<>();
    private static final Console studentsList = new Console();

    public static Console getStudentsList() {
        return studentsList;
    }

    public static void generateSample() {
        Random random = new Random();
        System.out.println("Please choose how many students you want in the sample list: ");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();

        for (int i = 0; i < l; i++) {
            // Generate random values for the student's attributes
            String vorname = "Vorname" + random.nextInt(1000);
            String nachname = "Nachname" + random.nextInt(1000);
            String studiengang = "Studiengang" + random.nextInt(1000);
            int martikelnummer = random.nextInt(10000);
            // Create a new student object with the random attributes
            Students student = stack.push(new Students(vorname,nachname,studiengang,martikelnummer));
        }
    }


    public static void addNew() {
        System.out.println("*First name: ");
        Scanner input = new Scanner(System.in);
        String vorname = input.nextLine();
        System.out.println("*Last name:  ");
        String nachname = input.nextLine();
        System.out.println("*Course of studies: ");
        String studiengang = input.nextLine();
        System.out.println("*Matriculation number:  ");
        Integer martikeln = input.nextInt();
        Students student = stack.push(new Students(vorname, nachname, studiengang, martikeln));
        System.out.println("Student is added to the list.");
    }

    // Somehow I want to get the first name and save them in a list
    // then I can work with them
    // Fuck stack
    public void sortByName() {
        String[] studentsNames = new String[0];
        for (int i = 0; i < getStudentsList().size(); i++) {
            studentsNames[i] = stack.peek().getVorname();
        }
        for (int i = 0; i < studentsNames.length - 1; i++) {
            for (int j = i + 1; j < studentsNames.length; j++) {
                if (studentsNames[i].compareTo(studentsNames[j]) > 0) {
                    String temp = studentsNames[i];
                    studentsNames[i] = studentsNames[j];
                    studentsNames[j] = temp;
                }
            }
        }
    }

    public static void showLastAdded() {
        Students student = stack.peek();
        if (student == null) System.out.println("List is empty");
        else System.out.println(student + "\n");
    }

    public void declare(String s) {
        System.out.print(s);
    }

    public static void showList() {
        if (stack.isEmpty()) {
            System.out.println("List is empty");
        } else {
            stack.print();
        }

    }

    public static void deleteAll() {
        if (stack.isEmpty()) {
            System.out.println("List is empty");
            ;
        } else {
            stack.clear();
            System.out.println("List has been cleared");
        }
    }

    public static void sizeOfList() {
        System.out.println("There are" + stack.size() + " Students registered.");
    }

    public static void searchFortStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Search for: ");
        String name = input.nextLine();
        System.out.println("You are searching for " + "// " + name + " //");
        Students target = null;
        }

        public static void sortStudents () {
            Sort.main();
        }
}


