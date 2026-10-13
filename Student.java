import java.util.Scanner;

// Lớp đại diện cho một sinh viên (đóng gói dữ liệu)
class Student {
    private String id;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        setGpa(gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    // Kiểm tra hợp lệ ngay trong setter (thang điểm 4)
    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA phải nằm trong khoảng 0 - 4");
        }
        this.gpa = gpa;
    }

    // Sinh viên tự nhập thông tin của chính mình
    public void input(Scanner sc) {
        System.out.print("Nhập mã sinh viên: ");
        setId(sc.nextLine());

        System.out.print("Nhập họ tên: ");
        setName(sc.nextLine());

        while (true) {
            try {
                System.out.print("Nhập GPA (0 - 4): ");
                setGpa(Double.parseDouble(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("GPA phải là số, vui lòng nhập lại!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại!");
            }
        }
    }

    @Override
    public String toString() {
        return "Mã SV: " + id + " | Họ tên: " + name + " | GPA: " + gpa;
    }
}

// Lớp quản lý danh sách sinh viên
class StudentManager {
    private final Student[] students;

    public StudentManager(int size) {
        students = new Student[size];
    }

    public void inputAll(Scanner sc) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("--- Sinh viên thứ " + (i + 1) + " ---");
            students[i] = new Student();
            students[i].input(sc);
        }
    }

    // Trả về sinh viên có GPA cao nhất
    public Student findTopStudent() {
        Student top = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGpa() > top.getGpa()) {
                top = students[i];
            }
        }
        return top;
    }
}
