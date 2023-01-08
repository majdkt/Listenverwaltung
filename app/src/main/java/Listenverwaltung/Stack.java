package Listenverwaltung;

public class Stack<S> {

    //SET
    public boolean empty() {
        return true;
    }

    class Student {
        S student;
        Student next;
    }

    private Student top = null;

    public S pop() {

        Student aktuell = top;
        if (aktuell == null) {
            top = null;
        } else {
            if (aktuell.next != null) {
                top = aktuell.next;
            } else {
                top = null;
            }
        }
        if (aktuell == null) return null;
        return aktuell.student;
    }

    public S peek() {
        if (top == null) {
            return null;
        }
        return top.student;
    }

    public Students push(S s) {
        Student aktuell = top;
        top = new Student();
        top.student = s;
        top.next = aktuell;

        return null;
    }

    public void clear() {
        top = null;
    }

    public boolean isEmpty() {
        if (top == null) return true;
        else return false;
    }

    public int size() {
        Student aktuell = top;
        int i = 0;
        while (top != null) {
            pop();
            i++;
        }
        top = aktuell;
        return i;
    }

        public void print() {
            Student aktuell = top;
            while (top != null) {
                Console.getStudentsList().declare("*" + pop() + "\n");
            }
            top = aktuell;
        }
}
