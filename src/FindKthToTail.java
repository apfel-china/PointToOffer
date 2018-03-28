
public class FindKthToTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k==0)
            return null;
        ListNode Ahead=head;
        ListNode Behind=null;
        for(int i=0;i<k-1;i++){
            if(Ahead.next!=null)
                Ahead=Ahead.next;
            else
                return null;
        }
        Behind=head;
        while(Ahead.next!=null){
            Ahead=Ahead.next;
            Behind=Behind.next;
        }
        return Behind;
    }
    protected class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
