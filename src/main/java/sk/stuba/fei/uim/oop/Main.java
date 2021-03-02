package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args)
    {
        // CVICENIE 3

        // ULOHA 1.1
        Student Adam = new Student(104554, "Adam", "Palo", 21);
        Student Patricia = new Student(1005, "Patricia", "Serekova", 22);
        Student Default = new Student();

        Adam.getInfo();
        Default.getInfo();
        Patricia.getInfo();

        // ULOHA 1.2
        Student[] array = {Adam, Patricia, Default};
        printStudentArray(array); // unsorted
        sortStudentArray(array); // sort
        printStudentArray(array); // sorted
    }

    public static void sortStudentArray(Student array[])
    {

    }

    public static void printStudentArray(Student array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].getMeno());
        }
    }
}

