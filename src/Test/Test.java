package Test;

class Node{
    int val;
    Node next;
    public Node(){}
    public Node(int val){
        this.val = val;
    }
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
public class Test {
    public static Node add(Node l1, Node l2) {
        Node result = new Node(0);
        Node dummy = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            dummy.next = new Node(sum % 10);
            dummy = dummy.next;
        }
        return result.next;
    }
    public static void printResult(Node r) {
        while (r != null) {
            System.out.print(r.val + " ");
            r = r.next;
        }
    }
    public static void main(String[] args) {
        Node l1 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6))))));
        Node l2 = new Node(2, new Node(3, new Node(4, new Node(5, new Node(6)))));
        printResult(add(l1, l2));
    }
}
