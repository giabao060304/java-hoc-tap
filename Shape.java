public class Shape {
    // Class con (subclass) thừa hưởng thuộc tính và method của class cha
    // (superclass) rồi bổ sung hoặc thay đổi theo ý mình. Quan hệ phải đúng nghĩa
    // "là một": Circle là một Shape.
    //// protected: class con truy cập được
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double area() {
        return 0;
    }

    // @Override là annotation dùng để thông báo rằng một phương thức đang ghi đè
    // (override) phương thức được kế thừa từ lớp cha hoặc được triển khai từ
    // interface.
    @Override
    public String toString() {
        return "Hình màu " + color + ", diện tích " + String.format("%.2f", area());
    }
}
