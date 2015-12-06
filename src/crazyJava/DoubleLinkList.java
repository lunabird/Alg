/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-11-13
 */
package crazyJava;

import java.util.LinkedList;

/**
 * @author hadoop
 * 双向 不循环 链表
 */
public class DoubleLinkList {
	
	//head
	private Node head;
	private static int size = 0;
	
	//constructor
	public DoubleLinkList(){
		head = new Node(null);		
	}
	//add the node to tail
	public void addNode(Node node){
		if(size == 0){
			head = node;
		}else{
			Node last = head;
			while(last.next != null){
				last = last.next;
			}
			last.next = node;
			node.prev = last;
		}	
		size++;
	}
	//remove the node of index
	public void removeNode(int index){
		if(index>=size){
			System.out.println("Index out of bounds");
			return;
		}
		int count = 0;
		if(index == 0){
			//remove head
			Node n = head;
			head.next.prev = null;
			head = head.next;
			n.next = null;
			n = null;
		}else{
			Node n = head;
			while(count<index){
				n = n.next;
				count++;
			}
			n.next.prev = n.prev;
			n.prev.next = n.next;
			n.prev = null;
			n.next = null;
			n = null;
		}
		size--;
	}
	public void printList(){
		System.out.println("size of linked list:" + size);
		Node n = head;
		while(n.next != null){
			n.print();
			n = n.next;
		}
		n.print();
		System.out.println();
	}
	
	
	public static void main(String[] args){
		DoubleLinkList dll = new DoubleLinkList();
		for(int i=0;i<10;i++){
			dll.addNode(new Node(i));
		}
		dll.printList();
		for(int i=0;i<3;i++){
			dll.removeNode(i);
			dll.printList();
		}
	}
	
}
class Node{
	Integer data;
	Node prev;
	Node next;
	
	public Node(Integer v){
		data = v;
		prev = null;
		next = null;
	}
	
	public Node(Integer v, Node prev, Node next){
		data = v;
		this.prev = prev;
		this.next = next;
	}
	public void print(){
		System.out.print(data+" ");
	}
	
	public String toString(){
		return data+"";
	}
	
	public boolean equals(Node n){
		if(data == n.data){
			return true;
		}
		return false;
	}
}