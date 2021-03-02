package sk.stuba.fei.uim.oop;

import static sk.stuba.fei.uim.oop.Sort.sortStudentArray;

public class Main {
    public static void main(String[] args)
    {
        // CVICENIE 3

        // ULOHA 1.1
        Student Adam = new Student(104554, "Adam", "Palo", 21);
        Student Patricia = new Student(1005, "Patricia", "Serekova", 22);
        Student Terez = new Student(2407, "Terez", "Zelonkova", 25);
        Student Default = new Student();

        Adam.getInfo();
        Default.getInfo();
        Patricia.getInfo();
        Terez.getInfo();
        System.out.println("");

        // ULOHA 1.2
        Student[] array = {Terez, Adam, Patricia, Default};
        printStudentArray(array); // unsorted
        System.out.println("");

        // order: ascending/descending
        // parameter: Meno/priezvisko/vek
        sortStudentArray(array, "ascending", "meno"); // sort
        printStudentArray(array); // sorted
        System.out.println("");
    }


    public static void printStudentArray(Student array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].getMeno());
        }
    }
}

