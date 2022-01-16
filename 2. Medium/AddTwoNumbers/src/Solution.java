public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode node = answer;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }
        if(carry > 0)
            node.next = new ListNode(carry);
        return answer.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9)))));

        System.out.println(addTwoNumbers(l1, l2));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
