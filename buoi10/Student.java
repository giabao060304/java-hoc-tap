package buoi10;

// public class Student {
//     private String id;

//     public Student(String id) {
//         this.id = id;
//     }

//     public String getId() {
//         return id;
//     }
// }

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Ghi de equals() theo ma sinh vien
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;
        return Objects.equals(this.id, other.id);
    }

    // Ghi de hashCode() theo ma sinh vien
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name
                + "', gpa=" + gpa + "}";
    }
}
