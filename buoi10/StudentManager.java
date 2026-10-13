package buoi10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Viết class StudentManager chứa List<Student> với các method: add(Student), removeById(String id), findById(String id) (trả về Student hoặc null), printAll().
public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void removeById(String id) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getId().equals(id)) {
                iterator.remove();
                return;
            }
        }

    }

    public Student findById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void printAll() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId());
        }
    }
}