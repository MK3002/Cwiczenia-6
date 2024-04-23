import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Students {
    private static List<Student> students = new ArrayList<>();

    public static void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }
    public static void addStudent(Student student) {
        students.add(student);
    }
    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getImie() + " " + student.getNazwisko());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Miasto: " + student.getMiasto());
            System.out.println("Ulica: " + student.getUlica());
            System.out.println("Numer Telefonu: " + student.getNumerTelefonu());
            System.out.println("Data Urodzin: " + student.getDate());
            System.out.println("Numer Indeksu: " + student.getIndexNumber());
            System.out.println("Status: " + student.getStatus());
            if (student.getStudyProgramme() != null) {
                System.out.println("Nazwa Kierunku: " + student.getStudyProgramme().getNazwa());
                System.out.println("Semestr: " + student.getStudyProgramme().getOpis());
                System.out.println("Ilość Semestrów: " + student.getStudyProgramme().getIloscSemestrow());
                System.out.println("Maksymalna ilość ITN " + student.getStudyProgramme().getMaksITNs());
            }
        }

        }
    }

