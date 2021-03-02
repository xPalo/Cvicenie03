package sk.stuba.fei.uim.oop;

public class Student {
    private int id;
    private String meno;
    private String priezvisko;
    private int vek;

    public int getId()
    {
        return id;
    }
    public String getMeno()
    {
        return meno;
    }
    public String getPriezvisko() { return priezvisko; }
    public int getVek()
    {
        return vek;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setMeno(String meno)
    {
        this.meno = meno;
    }
    public void setPriezvisko(String priezvisko)
    {
        this.priezvisko = priezvisko;
    }
    public void setVek(int vek)
    {
        this.vek = vek;
    }

    public Student()
    {
        this.id = 0;
        this.meno = "Default";
        this.priezvisko = "Default";
        this.vek = 99;
    }
    public Student(int id, String meno, String priezvisko, int vek)
    {
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public void getInfo()
    {
        System.out.println("Student "+ this.meno + " " + this.priezvisko + " ma " + this.vek + " rokov a ID: " + this.id);
    }
}
