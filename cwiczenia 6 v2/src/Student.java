import java.util.Date;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Student {
private String Imie;
private int IndexNumber;
private String Nazwisko;
private String Email;
private String Miasto;
private String Ulica;
private String numerTelefonu;
private int[] Date;
private String Status;
private StudyProgramme studyProgramme;
private static int nextIndexNumber = 1;
private int Semestr;
public int adsda() { return this.studyProgramme.getIloscSemestrow();}
public Student(String Imie, String Nazwisko, String Email, String Miasto, String Ulica, String numerTelefonu, int rok, int mies, int dzien) {
this.Imie = Imie;
this.Nazwisko = Nazwisko;
this.Email=Email;
this.Miasto=Miasto;
this.Ulica=Ulica;
this.numerTelefonu=numerTelefonu;
this.Date= new int[]{rok,mies,dzien};
this.IndexNumber = nextIndexNumber++;
this.Semestr=Semestr;
this.Status= "Candidate";
}
public void addGrade(int grade, String course) {}

public void enrollStudent(StudyProgramme studyProgramme) {this.studyProgramme = studyProgramme;}
public void promoteToNextSemester() {
    if (Semestr < studyProgramme.getIloscSemestrow()) {
        Semestr++;
    }
    if (Semestr == studyProgramme.getIloscSemestrow()) {
        Status = "Graduate";

    }
    }

    public String getImie() {
        return Imie;
    }

    public int getIndexNumber() {
        return IndexNumber;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getEmail() {
        return Email;
    }

    public String getMiasto() {
        return Miasto;
    }

    public String getUlica() {
        return Ulica;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public int[] getDate() {
        return Date;
    }

    public String getStatus() {
        return Status;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

}
