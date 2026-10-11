public class Rectangle {
    // Viết class Rectangle (chiều dài, chiều rộng) với method tính chu vi, diện
    // tích. Thêm một static biến đếm số hình chữ nhật đã tạo.
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        count++; // Increment the count when an object of Rectangle is created
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;

    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Chieu rong khong hop le");
        } else {
            this.width = width;
        }

    }

    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("chieu dai khong hop le");
        } else {
            this.height = height;
        }
    }

    public double chuvi(double width, double height) {
        return (width + height) * 2;
    }

    public double dientich(double width, double height) {
        return width * height;
    }

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 3);
        Rectangle rec2 = new Rectangle(4, 2);
        Rectangle rec3 = new Rectangle(6, 3);
        System.out.println("Chu vi: " + rec.chuvi(rec.getWidth(), rec.getHeight()));
        System.out.println("Dien tich: " + rec.dientich(rec.getWidth(), rec.getHeight()));
        System.out.println("So luong hinh chu nhat da tao: " + Rectangle.getCount());
    }

}
