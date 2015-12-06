package TEST;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class ALinkedListTest {

	public static void main(String[] args){
		//LinkedList list = new LinkedList();
		LinkedListNode head = new LinkedListNode(2);
		head.next = new LinkedListNode(3);
		
//		while(head != null){
//			System.out.println(head.data);
//			head = head.next;
//		}
		
//		LinkedList list = new LinkedList();
//		list.offer(111);
//		list.offer(222);
//		list.offer(333);
//		while(!list.isEmpty()){
//			System.out.println(list.poll());
//		}
		
		
		Stack<Integer> stack1 =new Stack<Integer>();
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(123);
		stack.push(134);
		stack.push(444);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		
	}
}
class LinkedListNode{
	int data;
	LinkedListNode next;
	
	LinkedListNode(int data){
		this.data = data;
		next = null;
	}
}
//Ë«ÏòÁ´±í
class TwoSideLinkedListNode{
	int data;
	TwoSideLinkedListNode prev;
	TwoSideLinkedListNode next;
}