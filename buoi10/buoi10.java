// package buoi10;

// import java.util.ArrayList;
// import java.util.LinkedHashSet;
// import java.util.Scanner;
// import java.util.Set;

// public class buoi10 {
// // Bài 10.1. Nhập danh sách số nguyên (kết thúc khi nhập 0) vào ArrayList. In
// ra
// // danh sách, tổng, số lớn nhất và danh sách đã loại số trùng.
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// ArrayList<Integer> numbers = new ArrayList<>();
// while (true) {
// System.out.print("Nhập số nguyên (0 để kết thúc): ");
// int n = sc.nextInt();
// if (n == 0) {
// break;
// }
// numbers.add(n);

// }
// System.out.println("Danh sách số nguyên: " + numbers);
// int sum = 0;
// for (int n : numbers) {
// sum += n;
// }
// System.out.println("Tổng: " + sum);
// if (numbers.isEmpty()) {
// System.out.println("Danh sách rỗng, không có số lớn nhất.");
// } else {
// int max = numbers.get(0);
// for (int n : numbers) {
// if (n > max) {
// max = n;

// }

// }
// System.out.println("Số lớn nhất: " + max);
// // loai số trùng, giữ thứ tự xuất hiện
// Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
// System.out.println("Danh sách đã loại số trùng: " + uniqueNumbers);

// }
// }
// }
