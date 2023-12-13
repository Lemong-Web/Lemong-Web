package Student_Management;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListAddStudent {
    public void addStudent(ArrayList<Student> students, Student objectData) {
        if (objectData == null || objectData.getFullname() == null || objectData.getFullname().isEmpty()) {
            System.out.println("Error: Student information is missing. Please provide a valid student name.");
            return;
        }
        if (objectData == null || objectData.getId() == null || objectData.getId().isEmpty()) {
            System.out.println("Error: Student information is missing or invalid. Please provide a valid student " +
                    "with a positive ID.");
            return;
        }
        if (objectData == null || objectData.getMark() < 0 || objectData.getMark() > 10) {
            System.out.println("Error: Student information is missing or invalid. Please provide  " +
                    "with a mark between 0 and 10.");
            return;
        }

        if (students == null) {
            students = new ArrayList<>(); // Initialize the list if it's null
        }
        if (isDuplicateName(students, objectData.getFullname())) {
            throw new IllegalArgumentException("Error: Student with the name '" + objectData.getFullname() + "' already exists in the list.");
        }

        students.add(objectData);
    }


    public boolean isDuplicateName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.getFullname().equalsIgnoreCase(name)) {
                return true; // Duplicate name found
            }
        }
        return false; // No duplicate name found
    }
}


