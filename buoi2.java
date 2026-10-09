
import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
        // int score = 7;
        // if (score >= 8) {
        // System.out.println("Giỏi");
        // } else if (score >= 6.5) {
        // System.out.println("Khá");
        // } else if (score >= 5) {
        // System.out.println("Trung bình");
        // } else {
        // System.out.println("Yếu");
        // }
        // // Toán tử ba ngôi: điều kiện ? giá trị nếu đúng : giá trị nếu sai
        // String result = score >= 5 ? "Đạt" : "Không đạt";

        // int day = 3;
        // switch (day) {
        // case 1:
        // System.out.println("day la thu 2");
        // break;
        // case 2:
        // System.out.println("day la thu 2");
        // break;
        // case 3:
        // System.out.println("day la thu 3");
        // break;
        // default:
        // System.out.println("Ngay khong hop le");
        // }

        // String role = "admin";
        // switch (role) {
        // case "admin":
        // System.out.println("Quan tri vien");
        // break;
        // case "user":
        // System.out.println("Nguoi dung");
        // break;
        // default:
        // System.out.println("Vai tro khong hop le");
        // }
        // Scanner sc = new Scanner(System.in);
        // sc.nextLine();
        // System.out.print("Nhap vao so thuc: ");
        // double number = sc.nextDouble();
        // System.out.printf("So thuc vua nhap la: %.2f", number);
        // Bài 2.1. Nhập một số nguyên, cho biết số đó chẵn hay lẻ, dương, âm hay bằng
        // 0.
        // Scanner sc = new Scanner(System.in);
        // sc.nextLine();
        // System.out.println("Nhap vao mot so nguyen: ");
        // Kiểm tra chẵn hay lẻ
        // if (n % 2 == 0) {
        // System.out.println("So chan");
        // } else {
        // System.out.println("So le");
        // }

        // // Kiểm tra dương, âm hay bằng 0
        // if (n > 0) {
        // System.out.println("So duong");
        // } else if (n < 0) {
        // System.out.println("So am");
        // } else {
        // System.out.println("Bang 0");
        // }

        // Bài 2.2. Nhập ba số thực a, b, c. Giải phương trình bậc hai ax² + bx + c = 0
        // (nhớ xét trường hợp a = 0).
        // Scanner sc = new Scanner(System.in);
        // System.out.print("a = ");
        // double a = sc.nextDouble();
        // System.out.print("b = ");
        // double b = sc.nextDouble();
        // System.out.print("c = ");
        // double c = sc.nextDouble();

        // if (a == 0) {
        // if (b == 0) {
        // System.out.println(c == 0 ? "Vô số nghiệm" : "Vô nghiệm");
        // } else {
        // System.out.println("x = " + (-c / b));
        // }
        // } else {
        // double delta = b * b - 4 * a * c;
        // if (delta < 0) {
        // System.out.println("Vô nghiệm");
        // } else if (delta == 0) {
        // System.out.println("Nghiệm kép x = " + (-b / (2 * a)));
        // } else {
        // double sqrt = Math.sqrt(delta);
        // System.out.println("x1 = " + ((-b + sqrt) / (2 * a)));
        // System.out.println("x2 = " + ((-b - sqrt) / (2 * a)));
        // }
        // }
        // sc.close();
        // Bài 2.3. Nhập điểm trung bình (0–10) và xếp loại: Giỏi (từ 8), Khá (từ 6,5),
        // Trung bình (từ 5), Yếu (dưới 5). Báo lỗi nếu điểm nằm ngoài 0–10.
        // Bài 2.4. Viết máy tính đơn giản: nhập hai số và một phép toán (+, -, *, /),
        // in kết quả. Báo lỗi khi chia cho 0. Dùng switch.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap so y: ");
        double y = sc.nextDouble();
        System.out.print("Nhập phép toán (+ - * /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+' -> System.out.println(x + y);
            case '-' -> System.out.println(x - y);
            case '*' -> System.out.println(x * y);
            case '/' -> {
                if (y == 0)
                    System.out.println("Không chia được cho 0");
                else
                    System.out.println(x / y);
            }
            default -> System.out.println("Phép toán không hợp lệ");
        }
        // Bài 2.5 (nâng cao). Nhập năm, cho biết có phải năm nhuận không (chia hết cho
        // 4 nhưng không chia hết cho 100, hoặc chia hết cho 400).

        // System.out.print("Nhap nam: ");
        // Scanner sc = new Scanner(System.in);
        // int nam = sc.nextInt();

        // if ((nam % 4 == 0 && nam % 100 != 0)
        // || nam % 400 == 0) {
        // System.out.println("Nam nhuan");
        // } else {
        // System.out.println("Khong phai nam nhuan");
        // }

        // sc.close();
        // }
        // }
        // System.out.print("Nhap diem trung binh: ");
        // double diem = sc.nextDouble();

        // if (diem < 0 || diem > 10) {
        // System.out.println("Loi: Diem phai nam trong khoang 0 den 10");
        // } else if (diem >= 8) {
        // System.out.println("Xep loai: Gioi");
        // } else if (diem >= 6.5) {
        // System.out.println("Xep loai: Kha");
        // } else if (diem >= 5) {
        // System.out.println("Xep loai: Trung binh");
        // } else {
        // System.out.println("Xep loai: Yeu");
        // }

        // sc.close();
    }
}
