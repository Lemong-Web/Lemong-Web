import Student_Management.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Student = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("****** Add Student ******");
        st.addStudent(Student, new Student("BH00090", "Lien Van A", 10));
        st.addStudent(Student, new Student("BH00003", "Lien Van A", 8));
        st.addStudent(Student, new Student("BH00002", "Bui Van Nhi", 2));
        st.addStudent(Student, new Student("BH00005", "Le Minh", 6));
        st.addStudent(Student, new Student("BH00689", "A Cong Duc",4 ));
        st.addStudent(Student, new Student("BH00789", "grgrg", 1));
        st.addStudent(Student, new Student("BH00989", "Nguyen Kim Luong", 7));
        st.addStudent(Student, new Student("BH00009", "Hoang Duc Phuc", 8));
        st.addStudent(Student, new Student("BH00010", "Bo Van Bo", 8));
        System.out.println("List data of Student");
        for (Student s : Student) {
            System.out.println("ID = " + s.id + " , Fullname = " + s.fullname + " , Mark = " + s.Mark + " , Rank = " + s.Rank);
        }

        System.out.println("******************* Edit Student *********************");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editStudent(Student, 0, new Student("BH00405", "Nguyen Binh A", 5));

        System.out.println("******************* List data after Edit *********************");
        for (Student s : Student) {
            System.out.println("ID = " + s.id + " , Fullname = " + s.fullname + " , Mark = " + s.Mark + " , Rank = " + s.Rank);
        }

        System.out.println("************ Edit Student by Id ***************");
        edit.editStudentByID(Student, "BH00405", new Student("BH000405", "Nguyen Binh A", 5));

        System.out.println("************ List student after update by ID **************");
        for (Student s : Student) {
            System.out.println("ID = " + s.id + " , Fullname = " + s.fullname + " , Mark = " + s.Mark + " , Rank = " + s.Rank);
        }

        System.out.println("*************** Remove ***************");
        ArrayListRemove removeSt = new ArrayListRemove();
        removeSt.removeStudentById(Student, "BH00405");
        System.out.println("************ List student after remove by ID **************");
        for (Student s : Student) {
            System.out.println("ID = " + s.id + " , Fullname = " + s.fullname + " , Mark = " + s.Mark + " , Rank = " + s.Rank);
        }

        System.out.println("*************** Binary Search Student By Id ***************");
        ArrayListSearchStudent searchSt = new ArrayListSearchStudent();
        String numberId = "BH99995";
        int findSt = searchSt.binarySearch(Student, numberId);
        if (findSt == -1) {
            System.out.println("Can not found Id = " + numberId);
        } else {
            System.out.println(" found id = " + numberId);
        }

        System.out.println("*************** Sort Student by ID *****************");
        Collections.sort(Student, Student_Management.Student.IDStudentComparator );
        System.out.println("************* After Sort ******************" );
        for (Student str : Student) {
            System.out.println(str);
        }
        System.out.println("*************** Sort Student by Name *****************");
        Collections.sort(Student, Student_Management.Student.FullnameStuComparator );
        System.out.println("************* After Sort ******************" );
        for (Student str : Student) {
            System.out.println(str);
        }
        System.out.println("*************** Sort Student by Mark *****************");
        Collections.sort(Student, Student_Management.Student.MarkStuComparator );
        System.out.println("************* After Sort ******************" );
        for (Student str : Student) {
            System.out.println(str);
        }
    }
}