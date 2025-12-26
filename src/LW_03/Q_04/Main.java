package LW_03.Q_04;

public class Main {
    static void main() {
        Course c1 = new Course();
        Lecturer l1 = new Lecturer();
        Student s1 = new Student();

        l1.setLecturerName("Amal Guptha");
        l1.setCourseTeaching("History");
        c1.setLecturer(l1);
        c1.setCourseCode("H2025");
        c1.setCourseName("History-2025");
        s1.setCourseFollowing("Languages");
        s1.setDegreeName("HLB(hons)");
        s1.setStudentName("Sakalabujan Mar");

        System.out.println(c1.getLecturer().getLecturerName());
    }
}
