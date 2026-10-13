Buổi 12: Stream, Optional, đọc/ghi file và Mini Project

1. Stream API – Xử lý danh sách dữ liệu
   Stream giúp bạn lọc, biến đổi, sắp xếp và tính toán dữ liệu trong List mà không cần tự viết nhiều vòng lặp for.
   Một số thao tác Stream thường gặp
   filter() – Lọc dữ liệu
   scores.stream()
   .filter(score -> score >= 8)
   .forEach(System.out::println);

Kết quả: 8, 9, 10.

map() – Biến đổi dữ liệu
scores.stream()
.map(score -> score \* 2)
.forEach(System.out::println);

Mỗi điểm được nhân đôi.

sorted() – Sắp xếp
scores.stream()
.sorted()
.forEach(System.out::println);

In các điểm theo thứ tự tăng dần.

count() – Đếm phần tử
long count = scores.stream()
.filter(score -> score >= 8)
.count();

Kết quả: 3.
Optional – Hạn chế lỗi giá trị null
Giả sử bạn tìm sinh viên theo mã:
Student student = findById("SV01");
System.out.println(student.getName());

Nếu không tìm thấy sinh viên, student có thể là null. Khi gọi student.getName(), chương trình có thể bị NullPointerException.
Optional giúp bạn biểu diễn rõ trường hợp một giá trị có thể tồn tại hoặc không tồn tại.
Optional<Student> result = Optional.ofNullable(student);

if (result.isPresent()) {
System.out.println(result.get().getName());
} else {
System.out.println("Khong tim thay sinh vien");
}

Một số phương thức quan trọng:
Phương thức Ý nghĩa
Optional.of(value) Tạo Optional từ giá trị không được null
Optional.ofNullable(value) Chấp nhận giá trị có thể là null
isPresent() Kiểm tra có giá trị hay không
orElse(defaultValue) Lấy giá trị hoặc dùng giá trị mặc định
ifPresent(action) Thực hiện hành động nếu có giá trị
Ví dụ ngắn gọn:
String name = Optional.ofNullable(student)
.map(Student::getName)
.orElse("Khong tim thay"); 3. Đọc và ghi file trong Java
Đọc/ghi file giúp chương trình lưu dữ liệu sau khi tắt, thay vì chỉ lưu tạm trong bộ nhớ.
Ghi dữ liệu vào file
