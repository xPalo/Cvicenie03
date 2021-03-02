package sk.stuba.fei.uim.oop;

public class Sort
{
    public static void sortStudentArray(Student array[], String order, String parameter)
    {
        if (order.compareTo("ascending") == 0)
        {
            switch (parameter)
            {
                case "meno":
                    sortAscending(array, "meno");
                    break;
                case "priezvisko":
                    sortAscending(array, "priezvisko");
                    break;
                case "vek":
                    sortAscending(array, "vek");
                    break;
                default:
                    sortAscending(array, "meno");
                    break;
            }
        }
        else if (order.compareTo("descending") == 0)
        {
            switch (parameter)
            {
                case "meno":
                    sortDescending(array, "meno");
                    break;
                case "priezvisko":
                    sortDescending(array, "priezvisko");
                    break;
                case "vek":
                    sortDescending(array, "vek");
                    break;
                default:
                    sortDescending(array, "meno");
                    break;
            }
        }
    }

    public static void sortAscending(Student array[], String parameter)
    {
        switch (parameter)
        {
            case "meno":
                for (int i = 0; i < array.length; i++)
                {
                    for (int j = i + 1; j < array.length; j++)
                    {
                        Student tmp;
                        if (array[i].getMeno().compareTo(array[j].getMeno()) > 0)
                        {
                            tmp = array[i];
                            array[i] = array[j];
                            array[j]= tmp;
                        }
                    }
                }
                break;

            case "priezvisko":
                for (int i = 0; i < array.length; i++)
                {
                    for (int j = i + 1; j < array.length; j++)
                    {
                        Student tmp;
                        if (array[i].getPriezvisko().compareTo(array[j].getPriezvisko()) > 0)
                        {
                            tmp = array[i];
                            array[i] = array[j];
                            array[j]= tmp;
                        }
                    }
                }
                break;

            case "vek":
                for (int i = 0; i < array.length; i++)
                {
                    for (int j = i + 1; j < array.length; j++)
                    {
                        Student tmp;
                        if (array[i].getVek() > array[j].getVek())
                        {
                            tmp = array[i];
                            array[i] = array[j];
                            array[j]= tmp;
                        }
                    }
                }
                break;
        }
    }

    public static void sortDescending(Student array[], String parameter)
    {
        switch (parameter)
        {
            case "meno":
                for (int i = 0; i < array.length; i++)
                {
                    for (int j = i + 1; j < array.length; j++)
                    {
                        Student tmp;
                        if (array[i].getMeno().compareTo(array[j].getMeno()) <= 0)
                        {
                            tmp = array[i];
                            array[i] = array[j];
                            array[j]= tmp;
                        }
                    }
                }
                break;

            case "priezvisko":
                for (int i = 0; i < array.length; i++)
                {
                    for (int j = i + 1; j < array.length; j++)
                    {
                        Student tmp;
                        if (array[i].getPriezvisko().compareTo(array[j].getPriezvisko()) <= 0)
                        {
                            tmp = array[i];
                            array[i] = array[j];
                            array[j]= tmp;
                        }
                    }
                }
                break;

            case "vek":
                for (int i = 0; i < array.length; i++)
                {
                    for (int j = i + 1; j < array.length; j++)
                    {
                        Student tmp;
                        if (array[i].getVek() < array[j].getVek())
                        {
                            tmp = array[i];
                            array[i] = array[j];
                            array[j]= tmp;
                        }
                    }
                }
                break;
        }
    }
}
