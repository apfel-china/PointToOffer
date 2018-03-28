
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 

	public ListNode ReverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
