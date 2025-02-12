public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] a = new int[128]; // Đánh dấu vị trí xuất hiện của ký tự
        int maxLength = 0, i = 0; // Khởi tạo độ dài chuỗi ban đầu và vị trí bắt đầu chuỗi con

        for (int j = 0; j < s.length(); j++) { // Duyệt qua chuỗi
            i = Math.max(a[s.charAt(j)], i);  // Nếu ký tự đã xuất hiện, cập nhật vị trí bắt đầu mới bằng cách dùng hàm max của i và vị trí ký tự
            maxLength = Math.max(maxLength, j - i + 1);  // Cập nhật độ dài chuỗi con dài nhất
            a[s.charAt(j)] = j + 1;  // Lưu vị trí mới nhất của ký tự
        }
        return maxLength;
    }

}
