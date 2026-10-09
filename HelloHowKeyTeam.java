public class HelloHowKeyTeam {
  public static void main(String[] args) {
    // System.out.println("Hello How Key Team!");
    // int age = 20;
    // double height = 1.721;
    // String name = "An";
    // var city = "Hà Nội"; // var: Java tự suy ra kiểu là String
    // final double PI = 3.14159; // final: không đổi giá trị được nữa

    // System.out.println("Tên: " + name + ", tuổi: " + age);
    // System.out.printf("Chiều cao: %.2f m%n", height);
    // int a = 2;
    // int b = 3;
    // double c = (double) b / a;
    // // System.out.println(c);

    // System.out.println(c);
    // Bài 1.1. In ra màn hình họ tên, tuổi, thành phố và sở thích của bạn trên 4
    // dòng, dùng biến và printf.
    // String fullName = "Dong Gia bao";
    // int age = 22;
    // String city = "Thanh hoa";
    // String soThich = "dabong";
    // System.out.printf("toi ten la: %s%n ", fullName);
    // System.out.printf("toi ten la: %s%n ", city);
    // System.out.printf("toi ten la: %s%n ", soThich);
    // System.out.printf("toi ten la: %d%n ", age);
    // Bài 1.2. Cho cân nặng 65 kg và chiều cao 1,70 m. Tính và in chỉ số BMI (làm
    // tròn 2 chữ số). Công thức: BMI = cân nặng / (chiều cao × chiều cao).
    // double canNang = 65;
    // double chieuCao = 1.70;
    // double BMI = canNang / (chieuCao * chieuCao);
    // System.out.printf("chi so BMI la: %.2f %n ", BMI);
    // Bài 1.3. Cho int a = 17, b = 5;. In ra tổng, hiệu, tích, thương nguyên, phần
    // dư và thương thực của hai số.
    // Bài 1.4. Đổi 3725 giây ra dạng giờ:phút:giây (gợi ý: dùng / và %).
    //
    int giay = 3725;
    int h = giay / 3600;
    int p = (giay % 3600) / 60;
    int s = giay % 60;

    System.out.printf("%d giờ:%d phút:%d giây", h, p, s);

  }

}