package org.example.addTwoNumbers;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode ans = node;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Num = l1 != null ? l1.val : 0,
                    l2Num = l2 != null ? l2.val : 0;

            int sum = l1Num + l2Num + carry;

            carry = sum / 10;
            node.next = new ListNode();
            node = node.next;
            node.val = sum % 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return ans;
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