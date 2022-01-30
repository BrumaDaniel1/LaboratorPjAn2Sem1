package labjava;

public class ConsoleDisplay implements IDisplayManager {
    @Override
    public void displayStudents(Student[] student) {
        for(Student s:student) {
            System.out.println(s);
        }
    }

    @Override
    public void dispalyTeachers(Profesor[] profesor) {
        System.out.println(profesor);
    }

    @Override
    public void displayCourses(Curs[] cursuri) {
        System.out.println(cursuri);
    }
}
