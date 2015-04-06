package LinkList.twonumbers;

/**
 * Created by alpha on 2015/4/5.
 */
public class Solution {
	public static void main(String[] args) {
//		System.out.println((int)(Math.random()*100));
		ListNode head1 =  creaList(5);
		ListNode head2 = creaList(8);
		printListNode(head1);
		printListNode(head2);
		addTwoNumbers(head1,head2);
//		statSize();
	}
	static int i = 0;
	public static void statSize()
	{
		System.out.println(i++);
		statSize();
	}
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
	{
		int sum = 0;
		while(l1 != null || l2 != null) {
			if(l1 != null)
			{
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null)
			{
				sum += l2.val;
				l2= l2.next;
			}
			//int wei = (l1.val + l2.val) / 10 != 0 ? (l1.val + l2.val) / 10 : 0;

		}
		return null;
	}
	public static ListNode creaList(int len)
	{
		ListNode head = new ListNode((int)(Math.random()*10));
		ListNode currentNode = head;
		for(int i = 0;i < len-1;i++)
		{
			ListNode newNode = new ListNode((int)(Math.random()*10));
			currentNode.next = newNode;
			currentNode = currentNode.next;
		}
		return head;
	}
	public static void printListNode(ListNode listNode)
	{
		while (listNode != null)
		{
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		System.out.println();
	}
}
class ListNode
{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
		next = null;
	}
}
