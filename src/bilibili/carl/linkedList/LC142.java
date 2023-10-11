package bilibili.carl.linkedList;

import java.util.List;

//142.环型链表
public class LC142 {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                ListNode index1 = head;
                ListNode index2 = slow;
                while(index2!=index1){
                    index1=index1.next;
                    index2=index2.next;
                }
                return index1;
            }
        }
        return null;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
