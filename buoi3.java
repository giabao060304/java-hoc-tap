// import java.util.*;

// public class buoi3 {
// // // static int sum(int a, int b) {
// // // return a + b;
// // // }
// // // static void tinhtong(int a, int b) {
// // // int tong = a + b;
// // // System.out.println("Tổng là: " + tong);
// // // }

// // // public static void main(String[] args) {
// // // tinhtong(2, 3);
// // // System.out.println(sum(2,3));
// // // for (int i = 1; i <= 5; i++) {
// // // System.out.println("số lần lặp: " + i);
// // // }
// // // // while có nghĩa là trong khi điều kiện còn đúng thì tiếp tục thực
// hiện.
// // // int i = 3;
// // // while (i <= 4) {
// // // System.out.println("số lần lặp: " + i);
// // // i++;
// // // }
// // // // Vòng lặp do - while
// // // // Vòng lặp do - while khác while ở chỗ luôn thực hiện phần thân ít
// nhất
// // một
// // // // lần, sau đó mới kiểm tra điều kiện.
// // // i = 5;
// // // do {
// // // System.out.println("số lần lặp: " + i);
// // // i++;
// // // } while (i <= 6);
// // // for (int i = 1; i <= 3; i++) {
// // // for (int j = 1; j <= 4; j++) {
// // // System.out.print("* ");
// // // }
// // // System.out.println();
// // // }
// // // }

// // public static void main(String[] args) {
// // // for (int i = 2; i < 100; i++) {
// // // if (isPrime(i)) {
// // // System.out.println(i);
// // // }
// // // }

// // // Bài 3.1. In bảng cửu chương từ 2 đến 9 bằng hai vòng for lồng nhau.
// // // for (int i = 2; i <= 9; i++) {
// // // for (int j = 1; j <= 9; j++) {
// // // System.out.printf("%d x %d = %d%n", i, j, i * j);
// // // }
// // // System.out.println();
// // // }

// // // Bài 3.2. In các số từ 1 đến 100; số chia hết cho 3 in "Fizz", chia hết
// cho
// // 5
// // // in "Buzz", chia hết cho cả hai in "FizzBuzz".
// // // for (int i = 1; i <= 100; i++) {
// // // if (i % 3 == 0 && i % 5 == 0) {
// // // System.out.println("FizzBuzz");
// // // } else if (i % 3 == 0) {
// // // System.out.println("Fizz");
// // // } else if (i % 5 == 0) {
// // // System.out.println("Buzz");
// // // } else {
// // // System.out.println(i);
// // // }
// // // }

// // // Bài 3.3. Viết method boolean isPrime(int n). Dùng nó để in tất cả số
// // nguyên
// // // tố nhỏ hơn 100.

// // // Bài 3.4. Viết method tính giai thừa long factorial(int n) và method tìm
// // ước
// // // chung lớn nhất int gcd(int a, int b).
// // Scanner sc = new Scanner(System.in);
// // System.out.print("Nhập số nguyên dương n: ");
// // int n = sc.nextInt();
// // System.out.println("Giai thừa của " + n + " là: " + factorial(n));
// // System.out.println(gcd(12, 18));
// public static void main(String[] args) {
// choiDOanSo();
// }

// // // Bài 3.5. Viết trò chơi đoán số: máy chọn ngẫu nhiên số từ 1 đến 100,
// người

// // // chơi đoán đến khi đúng, mỗi lần gợi ý "lớn hơn" hoặc "nhỏ hơn" và đếm
// số
// // lần
// // // đoán (gợi ý: new Random().nextInt(100) + 1).

// // }
// static void choiDOanSo() {

// Random random = new Random()
// ;
// int soBiMat = random.nextInt(100) + 1;
// Scanner sc = new Scanner(System.in);
// int soLanDoan = 0;
// int doan;

// System.out.println("Đoán số từ 1 đến 100!");

// do {
// System.out.print("Nhập dự đoán của bạn: ");
// doan = sc.nextInt();
// soLanDoan++;

// if (doan < soBiMat) {
// System.out.println("Lớn hơn!");
// } else if (doan > soBiMat) {
// System.out.println("Nhỏ hơn!");
// } else {
// System.out.println("Chúc mừng! Bạn đã đoán đúng số " + soBiMat + " sau " +
// soLanDoan + " lần đoán.");
// }
// } while (doan != soBiMat);

// sc.close();
// }
// // static int gcd(int a, int b) {
// // ;
// // for (int i = 1; i <= a && i <= b; i++) {
// // if (a % i == 0 && b % i == 0) {
// // return i;
// // }
// // }
// // return 1;

// // }

// // static boolean isPrime(int n) {
// // if (n < 2) {
// // return false;
// // }
// // for (int j = 2; j < n; j++) {
// // if (n % j == 0) {
// // return false;
// // }
// // }
// // return true;
// // }

// // static long factorial(int n) {
// // long result = 1;
// // for (int i = 1; i <= n; i++) {
// // result *= i;
// // }
// // return result;
// // }

// }
