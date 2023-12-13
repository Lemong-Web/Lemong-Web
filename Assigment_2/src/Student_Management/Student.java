package Student_Management;

import java.util.Comparator;

public class Student {

    public String fullname;

    public String id;
    public   Double Mark;
    public String Rank;
    public Student(String id, String fullname, double Mark){
        this.id = id;
        this.fullname = fullname;
        this.Mark = Mark;
        if(this.Mark >= 0 && this.Mark <5){
            this.Rank = "Fail";
        } else if (this.Mark >= 5 && this.Mark < 6.5) {
            this.Rank = "Medium";
        } else if (this.Mark >= 6.5 && this.Mark < 7.5) {
            this.Rank = "Good";
        } else if (this.Mark >= 7.5 && this.Mark < 9) {
            this.Rank = " Very Good";
        } else if (this.Mark >= 9 && this.Mark <= 10) {
            this.Rank = "Excellent";
        } else {
            this.Rank = null;
        }
    }
    // Getter and Setter java
    public String getFullname(){
        return fullname;
    }
    public void setFullname(String fullname){
        this.fullname = fullname;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public double getMark(){
        return Mark;
    }
    public void setMark(double mark){
        this.Mark = mark;
    }

    public  static Comparator<Student> IDStudentComparator = new Comparator<Student>() {
    @Override
    public int compare(Student o1, Student o2) {
        String idStu1 = o1.getId().toUpperCase();
        String idStu2 = o2.getId().toUpperCase();
        return idStu1.compareTo(idStu2);
    }
};
    public static Comparator<Student> FullnameStuComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String fullname1 = o1.getFullname().toUpperCase();
            String fullname2 = o2.getFullname().toUpperCase();
            return fullname1.compareTo(fullname2);
        }
    };

    public static Comparator<Student> MarkStuComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            double mark1 = o1.getMark();
            double mark2 = o2.getMark();
            if (mark1 < mark2){
                return -1;
            } else if (mark2 < mark1) {
                return 1;
            }
                return  0;
        }
    };

    @Override
    public String toString() {
        return "[ID = " + id + " , fullname = " + fullname + ", mark = " + Mark + ", rank = " + Rank + " ]";
    }
    /*
    @Override
    public int compareTo(Student compareStu) {
        if (this.Mark < compareStu.getMark()) {
            return -1;
        } else if (compareStu.getMark() < this.Mark) {
            return 1;
        }
            return 0;
    }
*/
}
