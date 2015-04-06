package LinkList.sortLinkedList;

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode cur = head;
		while (cur != null) {
			ListNode temp = head;
			while (temp.val < cur.val) {
				temp = temp.next;
			}
			if (temp != cur) {
				while (temp != cur) {
					int tmpvalue = temp.val;
					temp.val = cur.val;
					cur.val = tmpvalue;
					temp = temp.next;
				}
			}
			cur = cur.next;
		}
		return head;
	}
}
