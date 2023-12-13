package Student_Management;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
public class ArrayListRemove {
    public void removeStudentById(ArrayList<Student> students, String id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (Objects.equals(student.getId(), id)) {
                iterator.remove();
            }
        }
    }
}