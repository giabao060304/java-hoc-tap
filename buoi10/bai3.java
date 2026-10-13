package buoi10;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Nhap danh sach A
        System.out.print("Nhap so phan tu cua A: ");
        int n = sc.nextInt();

        System.out.println("Nhap cac phan tu cua A:");
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        // Nhap danh sach B
        System.out.print("Nhap so phan tu cua B: ");
        int m = sc.nextInt();

        System.out.println("Nhap cac phan tu cua B:");
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }

        // Tim phan giao
        Set<Integer> giao = new HashSet<>(A);
        giao.retainAll(B);

        // Tim phan hop
        Set<Integer> hop = new HashSet<>(A);
        hop.addAll(B);

        System.out.println("Phan giao: " + giao);
        System.out.println("Phan hop: " + hop);

        sc.close();
    }
}