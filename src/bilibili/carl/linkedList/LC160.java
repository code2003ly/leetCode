package bilibili.carl.linkedList;
//160.相交链表
public class LC160 {
    public static void main(String[] args) {
        System.out.println("相交链表");
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA=0,lenB=0;
        //计算链表A和链表A的长度
        while(curA!=null){
            lenA++;
            curA = curA.next;
        }
        while(curB!=null){
            lenB++;
            curB = curB.next;
        }
        //将链表A记录为长度更长的链表
        if(lenB>lenA){
            //交换lenA和lenB和headA和headB;
            int tempLen = lenA;
            lenA = lenB;
            lenB = tempLen;
            ListNode tempNode = headA;
            headA = headB;
            headB = tempNode;
        }
        curA = headA;
        curB=headB;
        //求两个链表的长度差
        int gap = lenA-lenB;
        //将两个指针置于同一个位置上
        for(int i = 0;i<gap;i++){
            curA = curA.next;
        }
        //判断两个链表是否相交
        while(curA!=null){
            if(curA==curB){
                return curA;
            }
            curA = curA.next;
            curB=curB.next;
        }
        return null;

    }
}
