package bilibili.carl.linkedList;

//707.设计链表
public class LC707 {
    public static void main(String[] args) {
        System.out.println("设计链表");
    }
    //LC707=MyLinkedList
    class MyLinkedList{
        int size;
        ListNode head;
        public MyLinkedList() {
            int size=0;
            //虚拟头节点
            head = new ListNode(0);
        }

        public int get(int index) {
            //判断非法情况
            if(index<0||index>=size){
                return -1;
            }
            //创建一个遍历节点
            ListNode cur = head;
            //因为包含一个虚拟头节点，所以index+1
            for(int i =0;i<index+1;i++){
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0,val);
        }

        public void addAtTail(int val) {
            addAtIndex(size,val);
        }
        //插入到下标为index的节点之前
        public void addAtIndex(int index, int val) {
            // 在第 index 个节点之前插入一个新节点，例如index为0，那么新插入的节点为链表的新头节点。
            // 如果 index 等于链表的长度，则说明是新插入的节点为链表的尾结点
            // 如果 index 大于链表的长度，则返回空
            if(index>size){
                return;
            }
            if(index<0){
                index = 0;
            }
            size++;
            //找到要插入节点前驱节点
            ListNode pre = head;
            for(int i =0;i<index;i++){
                pre=pre.next;
            }
            //插入一个新节点
            ListNode toAdd = new ListNode(val);
            toAdd.next  = pre.next;
            pre.next = toAdd;
        }
        //删除第index个节点
        public void deleteAtIndex(int index) {
            //排除下标无效的情况
            if(index<0||index>=size){
                return;
            }
            size--;
            //特判删除的是头节点
            if(index==0){
                head = head.next;
                return;
            }
            //找到下标为 index的节点的前驱节点
            ListNode pre = head;
            for(int i =0;i<index;i++){
                pre=pre.next;
            }
            //删除节点
            pre.next=pre.next.next;
        }
        class ListNode{
            int val;
            ListNode next;
            public ListNode(){};
            public ListNode(int val){
                this.val = val;
            }
            public ListNode(int val,ListNode next){
                this.val = val;
                this.next=next;
            }
        }
    }
}



