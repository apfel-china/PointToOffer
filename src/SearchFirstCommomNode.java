
public class SearchFirstCommomNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null)
            return null;
        int List1Length=getListLength(pHead1);
        int List2Length=getListLength(pHead2);
        int LengthDif=List1Length-List2Length;
        ListNode pList1=pHead1,pList2=pHead2;
        if(LengthDif>0){
            int steps=LengthDif;
            while(steps-->0)
                pList1=pList1.next;
        }
        if(LengthDif<0){
            int steps=LengthDif;
            while(steps-->0)
                pList2=pList2.next;
        }
        while(pList1!=null && pList2!=null){
            if(pList1==pList2)
                break;
            pList1=pList1.next;
            pList2=pList2.next;
        }
        return pList1;
    }
	
	public int getListLength(ListNode head) {
		if(head==null)
			return 0;
		ListNode temp=head;
		int length=0;
		while(temp!=null) {
			length++;
			temp=temp.next;
		}
		return length;
	}
}
