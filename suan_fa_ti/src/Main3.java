public class Main3 {
    //两个多位数分别用两个链表存放，每一位用节点的数据为存放，且两个多位数以个、十、百..的形式用链表存
    //求和：用链表存
    public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
       }
    }
    public ListNode plusAB(ListNode l1, ListNode l2) {
        // write code here
        ListNode dummy=new ListNode(-1);
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode p=dummy;
        int flag=0;
        while(p1!=null||p2!=null) {
            int temp = flag;
            if (p1 != null) {
                temp += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                temp += p2.val;
                p2 = p2.next;
            }
            if (temp > 9) {
                temp -= 10;
                flag = 1;
            } else {
                flag = 0;
            }
            p.next = new ListNode(temp);
            p = p.next;
        }
        if(flag==1){
            p.next=new ListNode(1);
        }
        return dummy.next;
        /*ListNode p=a;
        ListNode q=b;
        ListNode addList=new ListNode(-1);
        ListNode r=addList;
        int temp=0;
        while(p!=null||q!=null){
            ListNode curNode=new ListNode(p.val+q.val+temp);
            if(curNode.val>9) {
                temp=curNode.val/10;
                curNode.val=curNode.val%10;
                r.next=curNode;
                r=r.next;
                p=p.next;
                q=q.next;
            }
        }
        if(p==null&&q!=null){
            ListNode curNode=new ListNode(q.val+temp);
            r.next=curNode;
        }else if(p!=null&&q==null){
            ListNode curNode=new ListNode(p.val+temp);
            r.next=curNode;
        }else {
            ListNode curNode=new ListNode(temp);
            r.next=curNode;
        }
        return addList.next;*/
    }
}
