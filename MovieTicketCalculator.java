public class MovieTicketCalculator {

    // Hàm tính tiền vé dựa trên tuổi và tình trạng sinh viên
    public static int calculateTicketPrice(int age, boolean isStudent) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid");
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

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        // Một số test case minh họa
        testCase(10, false, 50000);    // Trẻ em
        testCase(11, true, 50000);     // Trẻ em (dù là sinh viên)
        testCase(12, true, 70000);     // Sinh viên
        testCase(20, true, 70000);     // Sinh viên
        testCase(20, false, 100000);   // Người lớn
        testCase(59, false, 100000);   // Người lớn trước ngưỡng 60
        testCase(60, false, 60000);    // Người cao tuổi
        testCase(65, true, 60000);     // Người cao tuổi (ưu tiên hơn sinh viên)
    }

    // Hàm kiểm thử
    private static void testCase(int age, boolean isStudent, int expected) {
        int actual = calculateTicketPrice(age, isStudent);
        String result = (actual == expected) ? "PASSED" : "FAILED";
        System.out.println("Input: (age=" + age + ", student=" + isStudent + ") "
                + "Expected: " + expected + ", Actual: " + actual
                + " => " + result);
    }
}
