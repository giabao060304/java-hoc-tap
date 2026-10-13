package buoi11;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//Bài 11.1. Đếm tần suất từng ký tự trong một chuỗi bằng Map<Character, Integer> và in kết quả.
public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);

            }
        }
        System.out.println("Tan suat cac ky tu: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();

    }

}
