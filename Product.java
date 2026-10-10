public class Product {
    // Bài 6.1. Viết class Product gồm mã, tên, giá, số lượng; constructor,
    // getter/setter (giá và số lượng không được âm), method getTotalValue() (giá ×
    // số lượng) và toString(). Tạo 3 sản phẩm và in ra.
    private String code;
    private String name;
    private int price;
    private int quantity;

    public Product(String code, String name, int price, int quantity) {
        this.code = code;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getter — lấy dữ liệu
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter — thay đổi dữ liệu
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Giá không được âm");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Số lượng không được âm");
        }
    }

    public int getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalValue=" + getTotalValue() +
                '}';
    }

    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 15000000, 2);
        Product p2 = new Product("P002", "Chuột", 250000, 5);
        Product p3 = new Product("P003", "Bàn phím", 800000, 4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
