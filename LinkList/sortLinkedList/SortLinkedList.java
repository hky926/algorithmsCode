package LinkList.sortLinkedList;

import java.io.IOException;

public class SortLinkedList {

	public static void main(String[] args) throws IOException {
		System.out.println(args.length);
		ListNode root = createLinkList(10);
		printList(root);
		// sortList(root);
		System.out.println();
		printList(sortList2(root));
	}
	
	public static ListNode sortList(ListNode head) {
		if (head == null)
			return null;
		ListNode index = head;
		while (index != null) {
			ListNode temp = index.next;
			while (temp != null) {
				if (index.val > temp.val) {
					index.val = index.val + temp.val;
					temp.val = index.val - temp.val;
					index.val = index.val - temp.val;
				}
				temp = temp.next;
			}
			index = index.next;
		}
		return head;
	}

	public static ListNode sortList2(ListNode head) {

		if (head == null || head.next == null)
			return head;
		// count total number of elements
		int count = 0;
		ListNode p = head;
		while (p != null) {
			count++;
			p = p.next;
		}
		// break up to two list
		int middle = count / 2;
		ListNode l = head, r = null;
		ListNode p2 = head;
		int countHalf = 0;
		while (p2 != null) {
			countHalf++;
			ListNode next = p2.next;
			if (countHalf == middle) {
				p2.next = null;
				r = next;
			}
			p2 = next;
		}

		// now we have two parts l and r, recursively sort them
		ListNode h1 = sortList(l);
		ListNode h2 = sortList(r);
		// merge together
		ListNode merged = merge(h1, h2);
		return merged;
	}

	public static ListNode merge(ListNode l, ListNode r) {
		ListNode p1 = l;
		ListNode p2 = r;

		ListNode fakeHead = new ListNode(-1);
		ListNode pNew = fakeHead;

		while (p1 != null || p2 != null) {
			if (p1 == null) {
				pNew.next = new ListNode(p2.val);
				p2 = p2.next;
				pNew = pNew.next;
			} else if (p2 == null) {
				pNew.next = new ListNode(p1.val);
				p1 = p1.next;
				pNew = pNew.next;
			} else {
				if (p1.val < p2.val) {
					// if(fakeHead)
					pNew.next = new ListNode(p1.val);
					p1 = p1.next;
					pNew = pNew.next;
				} else if (p1.val == p2.val) {
					pNew.next = new ListNode(p1.val);
					pNew.next.next = new ListNode(p1.val);
					pNew = pNew.next.next;
					p1 = p1.next;
					p2 = p2.next;
				} else {
					pNew.next = new ListNode(p2.val);
					p2 = p2.next;
					pNew = pNew.next;
				}
			}
		}

		return fakeHead.next;
	}

	public static ListNode createLinkList(int size) {
		ListNode root = new ListNode(createRandom());
		ListNode index = root;
		for (int i = 0; i < size; i++) {
			ListNode listNode = new ListNode(createRandom());
			index.next = listNode;
			index = listNode;
		}
		return root;
	}

	public static void printList(ListNode listnode) {
		ListNode temp = listnode;
		while (temp.next != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	private static int createRandom() {
		return (int) (Math.random() * 100 + 1);
	}
}

class ListNode {
	int val;
	ListNode next;
	public ListNode() {
		next = null;
	}

	public ListNode(int x) {
		val = x;
		next = null;
	}
}