public class Program {
    public static void main(String[] args) {
        Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw", "Zlota 12","333-322-222",1980, 1, 1);
        StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        s.enrollStudent(it);
        Students.addStudent(s);
        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
    }
}
