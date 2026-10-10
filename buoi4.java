// import java.util.*;

// public class buoi4 {
// public static void main(String[] args) {
// // int[] scores = {8, 7, 9, 6}; // khởi tạo trực tiếp
// // int[] arr = new int[5]; // 5 phần tử, mặc định bằng 0
// // arr[0] = 10; // gán phần tử đầu tiên

// // System.out.println(scores.length); // 4 (length là thuộc tính, không có
// // ngoặc)
// // System.out.println(scores[2]); // 9

// // // duyệt bằng for thường (cần chỉ số)
// // for (int i = 0; i < scores.length; i++) {
// // System.out.println("scores[" + i + "] = " + scores[i]);
// // }

// // // duyệt bằng for-each (chỉ cần giá trị)
// // int sum = 0;
// // for (int s : scores) {
// // sum += s;
// // }
// // System.out.println("Trung bình: " + (double) sum / scores.length);
// // int[] arr = { 1, 2, 3, 4, 5 };
// // // arr[0] = 2;
// // // // int[] a = new int[8];
// // System.out.println(arr);
// // Arrays là một lớp có sẵn trong Java, cung cấp các phương thức giúp thao
// tác
// // với mảng dễ dàng hơn, chẳng hạn như sắp xếp, tìm kiếm, so sánh và in mảng.
// // Phương thức

// // Công dụng

// // Ví dụ

// // Arrays.sort(a)

// // Sắp xếp mảng tăng dần

// // {5, 2, 1} → {1, 2, 5}

// // Arrays.toString(a)

// // In toàn bộ mảng dễ đọc

// // [5, 2, 1]

// // Arrays.equals(a, b)

// // So sánh hai mảng theo từng phần tử

// // Trả về true hoặc false

// // Arrays.fill(a, 0)

// // Gán tất cả phần tử bằng 0

// // {5, 2} → {0, 0}

// // Arrays.binarySearch(a, 5)

// // Tìm vị trí của giá trị 5

// // Trả về chỉ số nếu tìm thấy
// // Bài 4.1. Nhập n (số phần tử) rồi nhập n số nguyên vào mảng. In ra mảng,
// tổng,
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Nhập số phần tử của mảng: ");
// // int n = sc.nextInt();
// // int[] arr = new int[n];
// // for (int i = 0; i < n; i++) {
// // System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
// // arr[i] = sc.nextInt();
// // }
// // System.out.println("Mảng đã nhập: " + Arrays.toString(arr));
// // System.out.println("Tổng: " + sum(arr));
// // trung bình, giá trị lớn nhất và nhỏ nhất.
// // Bài 4.2. Đếm số phần tử chẵn, số phần tử lẻ và in vị trí của số âm đầu
// tiên
// // Scanner sc = new Scanner(System.in);
// // System.out.print("Nhập số phần tử của mảng: ");
// // int n = sc.nextInt();
// // int[] arr = new int[n];
// // for (int i = 0; i < n; i++) {
// // System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
// // arr[i] = sc.nextInt();
// // }
// // int countEven = 0;
// // int countOdd = 0;
// // int firstNegativeIndex = -1;
// // for (int i = 0; i < n; i++) {
// // if (arr[i] % 2 == 0) {
// // countEven++;
// // } else {
// // countOdd++;
// // }
// // if (arr[i] < 0 && firstNegativeIndex == -1) {
// // firstNegativeIndex = i;
// // }
// // }
// // System.out.println("Số phần tử chẵn: " + countEven);
// // System.out.println("Số phần tử lẻ: " + countOdd);
// // if (firstNegativeIndex != -1) {
// // System.out.println("Vị trí của số âm đầu tiên: " + firstNegativeIndex
// // ); } else {
// // System.out.println("Không có số âm trong mảng.");
// // }

// // (hoặc thông báo nếu không có).
// // Bài 4.3. Viết method trả về phần tử lớn thứ hai của mảng (không dùng
// // Arrays.sort).
// // Bài 4.4. Nhập ma trận 3×3, in ma trận, tính tổng đường chéo chính và in ma
// // trận chuyển vị.
// // int[][] m = new int[3][3];
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Nhập ma trận 3x3:");
// // for (int i = 0; i < 3; i++) {
// // for (int j = 0; j < 3; j++) {
// // System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
// // m[i][j] = sc.nextInt();
// // }
// // }
// // for (int i = 0; i < 3; i++) {
// // for (int j = 0; j < 3; j++) {
// // System.out.print(m[i][j] + " ");
// // }
// // System.out.println();
// // }
// // int sum = 0;
// // for (int i = 0; i < 3; i++) {
// // sum += m[i][i];
// // }

// // System.out.println("Tong duong cheo chinh = " + sum);
// // for (int i = 0; i < 3; i++) {
// // for (int j = 0; j < 3; j++) {
// // System.out.print(m[j][i] + " ");
// // }
// // System.out.println();
// // }

// // sc.close();

// // Bài 4.5 (nâng cao). Viết method loại bỏ phần tử trùng, trả về mảng mới chỉ
// // gồm các giá trị khác nhau (giữ thứ tự xuất hiện đầu tiên).
// // }
// int[] a = { 3, 2, 3, 5, 2, 7, 5 };

// int[] ketQua = loaiBoTrung(a);

// System.out.println(Arrays.toString(ketQua));
// }

// // static int sum(int[] arr) {
// // int tong = 0;
// // for (int i = 0; i < arr.length; i++) {
// // tong += arr[i];
// // }
// // return tong;
// }

// static int[] loaiBoTrung(int[] a) {
// int[] mangMoi = new int[a.length];
// int dem = 0;

// for (int i = 0; i < a.length; i++) {
// boolean daTonTai = false;

// for (int j = 0; j < dem; j++) {
// if (a[i] == mangMoi[j]) {
// daTonTai = true;
// break;
// }
// }

// if (!daTonTai) {
// mangMoi[dem] = a[i];
// dem++;
// }
// }

// return Arrays.copyOf(mangMoi, dem);
// }
