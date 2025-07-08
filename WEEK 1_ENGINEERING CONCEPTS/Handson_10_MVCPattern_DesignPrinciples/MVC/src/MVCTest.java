import controller.StudentController;
import model.Student;
import view.StudentView;
public class MVCTest {
    public static void main(String[] args) {
        Student student=new Student("0001", "JOHN", "B");
        StudentView view=new StudentView();

        StudentController controller=new StudentController(student,view);

        controller.updateView();

        controller.setStudentName("Dwayne Johnson");
        controller.setStudentGrade("A");

        controller.updateView();
    }
}
