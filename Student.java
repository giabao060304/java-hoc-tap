public class Student {
    // thuộc tính (field), để private để che giấu dữ liệu
    private String id;
    private String name;
    private double gpa;

    // constructor: chạy khi tạo object bằng new
    public Student(String id, String name, double gpa) {
        this.id = id; // this.id là field, id là tham số
        this.name = name;
        this.gpa = gpa;
    }

    // getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
    // public class Counter {
    // private static int total = 0; // dùng chung cho mọi object
    // private final int id;

    // public Counter() {
    // total++;
    // this.id = total;
    // }

    // public static int getTotal() { // gọi bằng Counter.getTotal()
    // return total;
    // }
    // }
    // public: Constructor có thể được gọi từ những lớp khác nếu quyền truy cập cho
    // phép.
    // @Override là annotation báo cho Java biết rằng phương thức bên dưới được viết
    // để ghi đè một phương thức có sẵn từ lớp cha.
    // Đóng gói là việc che giấu dữ liệu bên trong đối tượng và chỉ cho phép bên
    // ngoài truy cập hoặc thay đổi dữ liệu thông qua những phương thức được quy
    // định.
    // static dùng để khai báo thành phần thuộc về lớp (class), thay vì thuộc riêng
    // từng đối tượng.
    // setter có kiểm tra dữ liệu
    // public void setGpa(double gpa) {
    // if (gpa >= 0 && gpa <= 10) {
    // this.gpa = gpa;
    // }
    // }

    // // method hành vi
    // public String rank() {
    // if (gpa >= 8)
    // return "Giỏi";
    // if (gpa >= 6.5)
    // return "Khá";
    // if (gpa >= 5)
    // return "Trung bình";
    // return "Yếu";
    // }

    // // in object ra dạng dễ đọc
    // @Override
    // public String toString() {
    // return "Student{id=" + id + ", name=" + name + ", gpa=" + gpa + "}";
    // }
    // Bài 6.1. Viết class Product gồm mã, tên, giá, số lượng; constructor,
    // getter/setter (giá và số lượng không được âm), method getTotalValue() (giá ×
    // số lượng) và toString(). Tạo 3 sản phẩm và in ra.

}
