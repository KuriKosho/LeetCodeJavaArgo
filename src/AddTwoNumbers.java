class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Tạo node giả để dễ xử lý
        ListNode current = dummyHead; // Con trỏ để duyệt danh sách mới
        int carry = 0; // Biến nhớ (carry) cho các phép cộng lớn hơn 10

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Bắt đầu với giá trị của carry từ lần trước

            if (l1 != null) {
                sum += l1.val; // Cộng giá trị của node hiện tại trong l1
                l1 = l1.next; // Di chuyển đến node tiếp theo của l1
            }
            if (l2 != null) {
                sum += l2.val; // Cộng giá trị của node hiện tại trong l2
                l2 = l2.next; // Di chuyển đến node tiếp theo của l2
            }

            carry = sum / 10; // Nếu tổng >= 10, lấy phần chục làm số nhớ
            current.next = new ListNode(sum % 10); // Tạo node mới với giá trị hàng đơn vị
            current = current.next; // Di chuyển con trỏ đến node vừa tạo
        }

        return dummyHead.next; // Trả về danh sách kết quả (bỏ qua node giả)
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);
        printList(result); // Kết quả mong đợi: 7 -> 0 -> 8
    }
}
