package com.example;

public class MovieTicketCalculator {

    // Hàm tính tiền vé dựa trên tuổi và tình trạng sinh viên
    public static int calculateTicketPrice(int age, boolean isStudent) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        } else if (age < 12) {
            return 50000; // Trẻ em
        } else if (age >= 60) {
            return 60000; // Người cao tuổi
        } else if (isStudent) {
            return 70000; // Sinh viên
        } else {
            return 100000; // Người lớn bình thường
        }
    }
}
