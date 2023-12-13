package Student_Management;
import java.util.ArrayList;

public class ArrayListEditStudent {
    public void editStudent(ArrayList<Student> Students, int Position, Student object) {
        Students.set(Position, object);
    }

    public void editStudentByID(ArrayList<Student> Students, String id, Student data) {
        for (int i = 0; i < Students.size(); i++) {
            // Use equals() for string comparison
            if (Students.get(i).id.equals(id)) {
                Students.set(i, data);
                break; // Assuming there's only one student with a given ID
            }
        }
    }
}

