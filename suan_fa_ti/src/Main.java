public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        int[] gifts={2,2,3,2,3,2,2,1,2,3};
        System.out.println(main.getValue(gifts,10));

    }
    //1.钱包
    public int getValue(int[] gifts, int n) {
        // write code here
        //找到出现次数最多的钱包用key记录
        int key=gifts[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(key==gifts[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                key=gifts[i];
                count=1;
            }
        }
        //计算在gifts中出现的次数
        for(int i=0;i<n;i++){
            if(key==gifts[i]){
                count++;
            }
        }
        if(count>n/2)
            return key;
        else return 0;
    }
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        //无节点返回空
        if(pHead==null){
            return null;
        }
        //只有一个节点
        if(pHead.next==null){
            return pHead;
        }
        //创建两个链表分别存放小于x的和大于等于x的
        //1、放大的
        ListNode bigHead=new ListNode(-1);
        //尾节点
        ListNode bigTail=bigHead;
        //2、放小的
        ListNode smallHead=new ListNode(-1);
        //尾节点
        ListNode smallTail=smallHead;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            if(cur.val<x){
                smallTail.next=new ListNode(cur.val);
                smallTail=smallTail.next;
            }else {
                bigTail.next=new ListNode(cur.val);
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigHead.next;
        return smallHead.next;

        /*ListNode aHead=new ListNode(-1);
        ListNode head=pHead;
        ListNode cur=head.next;
        while(head.next!=null){
            if(head.val>x){
                aHead.next=head;
                head.next=null;
                head=cur;
                cur=head.next;
            }else{
                head=cur;
                cur=head.next;
            }
        }
        cur.next=aHead.next;
        aHead.next=null;
        return pHead;*/
    }

}
