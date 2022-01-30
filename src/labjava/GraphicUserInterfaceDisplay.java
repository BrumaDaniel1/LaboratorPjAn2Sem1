package labjava;

public class GraphicUserInterfaceDisplay implements IDisplayManager{
    @Override
    public void displayStudents(Student[] student) {
        System.out.println("se v-a implemente pentru GUI");
    }

    @Override
    public void dispalyTeachers(Profesor[] profesor) {
        System.out.println("se v-a implemente pentru GUI");
    }

    @Override
    public void displayCourses(Curs[] cursuri) {
        System.out.println("se v-a implemente pentru GUI");
    }
}
