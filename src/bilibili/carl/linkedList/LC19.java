package bilibili.carl.linkedList;

import java.util.Scanner;

//19.删除链表的倒数第n个数
public class LC19 {
    public static void main(String[] args) {

    }
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1,head);
        ListNode pre = dummy;
        ListNode cur = dummy;
        //先让cur指针走n+1步
        while(n-->=0){
            cur = cur.next;
        }
        //两个指针一起走，直到cur指针为null
        while(cur!=null){
            pre=pre.next;
            cur=cur.next;
        }
        //删除倒数第n个节点
        pre.next = pre.next.next;
        return dummy.next;
    }
}
