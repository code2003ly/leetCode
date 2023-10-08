package bilibili.carl.linkedList;
//24.两两交换链表中的节点
public class LC24 {
    public static void main(String[] args) {
        System.out.println("LC24");
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

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1,head);
        ListNode cur = dummy;
        ListNode firstNode;
        ListNode secondNode;
        ListNode temp;
        while(cur.next!=null&&cur.next.next!=null){
            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode =  cur.next.next;
            //交换
            cur.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next =temp;

            cur = firstNode;
        }
        return dummy.next;

    }
}
