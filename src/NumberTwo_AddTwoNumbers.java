/*public class NumberTwo_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, Listnode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        //Iterates until both listnodes are empty and no carry is left
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
            //new carry
            carry = sum / 10;
            //new bit
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        //dummy-node is just a placeholder, that's why dummy.next is our final return
        return dummy.next;
    }
}*/
