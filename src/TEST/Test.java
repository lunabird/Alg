package TEST;

import java.util.Arrays;

public class Test {

	public static void setNum(int num){
		num=19;
	}
	public static void setPerson(Personn p){
		p.age = 28;
	}
	
	
	public void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	public int binarySerchRecursive(int k,int[] a,int start,int end){
		if(start > end){
			return -1;
		}
		
		int mid = (start+end)/2;
		
		if(a[mid]==k){
			return mid;
		}else if(a[mid]>k){
			return binarySerchRecursive(k,a,start,mid-1);
		}else{
			return binarySerchRecursive(k,a,mid+1,end);
		}
		
	}
	public int binarySearch(int[] a,int k){
		int start = 0;
		int end = a.length-1;
		
		while(start<=end){
			int mid = (start+end)/2;
			if(a[mid]==k){
				return mid;
			}else if(a[mid]>k){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	
	
	
	public int partition(int[] a,int left,int right){
		int pivot = a[(left+right)/2];
		
		while(left<=right){
			while(a[left]<pivot) left++;
			while(a[right]>pivot) right--;
			
			if(left<=right){
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(a)+"----"+left+"----"+a[left]);
		return left;

	}
	public void quickSort(int[] a,int left,int right){
		if(left>right) return;
		int index = partition(a,left,right);
		if(left<index-1){
			quickSort(a,left,index-1);
		}
		if(right>index){
			quickSort(a,index,right);
		}
	}
	
	
	public void merge(int[] a,int low,int middle,int high){
		System.out.println(Arrays.toString(a)+"---"+middle+"---"+a[middle]+"***");
		
		int[] helper = new int[a.length];
		
		for(int i=low;i<=high;i++){
			helper[i] = a[i];
		}
		
		int helperLeft = low;
		int helperRight = middle+1;
		int current = low;
		
		while(helperLeft<=middle && helperRight<=high){
			if(helper[helperLeft]<=helper[helperRight]){
				a[current] = helper[helperLeft];
				helperLeft++;
				
			}else{
				a[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		//将数组左半部分剩余复制到目标数组中
		int remaining = middle-helperLeft;
		for(int i=0;i<=remaining;i++){
			a[current+i] = helper[helperLeft+i];
		}
		
		
		System.out.println(Arrays.toString(a)+"---"+middle+"---"+a[middle]);
	}
	public void mergeSort(int[] a,int low,int high){
		if(low<high){
			int middle = (low+high)/2;
			mergeSort(a,low,middle);
			mergeSort(a,middle+1,high);
			merge(a,low,middle,high);
		}
	}
	
	
	public void selectSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[i]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	
	
	public void insertSort(int[] a){
		for(int i=1;i<a.length;i++){
			int tmp = a[i];
			if(a[i]<a[i-1]){
				int j=i-1;
				for(;j>=0&&a[j]>tmp;j--){
					a[j+1]=a[j];
				}
				a[j+1]=tmp;
			}
		}
	}
	
	
	public static void main(String[] args){
		
		
		/*int a=20;
		long b=30;
		System.out.println("sum="+a+b);//sum=2030
		 */		
		
		/*int a= 1;
		setNum(a);
		System.out.println(a);//1
		 */		
		
		/*Person p = new Person(14,"Jackson");
		setPerson(p);
		System.out.println(p.age);//28
		 */	
		
		
		/*Test t = new Test();
		int[] a={12,1,4,23,90};
		t.bubbleSort(a);
		System.out.println(Arrays.toString(a));*/
		
		
		/*int[] a = {23,27,90,112,134,156};
		Test t = new Test();
		//int res = t.binarySerchRecursive(27, a, 0, 5);
		//System.out.println(res);
		
		int res1 = t.binarySearch(a, 6);
		System.out.println(res1);*/
		
		/*Test t = new Test();
		int[] a={1,2,3,4,5,6,7,8,9,0};
		t.quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));*/
		
		/*Test t = new Test();
		int[] a={1,2,3,4,5,6,7,8,9,0};
		t.mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));*/
		
		
		/*Test t = new Test();
		int[] a={1,2,3,4,5,6,7,8,9,0};
		t.selectSort(a);
		System.out.println(Arrays.toString(a));*/
		
		Test t = new Test();
		int[] a={1,2,3,4,5,6,7,8,9,0};
		t.insertSort(a);
		System.out.println(Arrays.toString(a));
		
	}
}
//单向链表
class Node{
	
	int data;
	Node next=null;
	
	public Node(int d){
		data = d;
	}
	public void appendToTail(int t){
		Node end = new Node(t);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
	public void appendToHead(int t){
		Node start = new Node(t);
		start.next = this;
	}
	//返回该链表头head
	Node deleteNode(Node head,int t){
		Node n = head;
		if(n.data == t){
			return head.next;
		}
		while(n.next!=null){
			if(n.next.data==t){
				n.next = n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
	//在节点t后面插入新节点
	Node insertAfter(Node head,int t,int data){
		Node n = head;
		Node newNode = new Node(data);
		//先找到t节点
		if(n.data==t){
			newNode.next = n.next;
			n.next = newNode;
		}
		while(n.next!=null){
			if(n.next.data==t){
				newNode.next = n.next.next;
				n.next.next = newNode;
				return head;
			}
			n=n.next;
		}
		return head;
	}
	
}



class Personn{
	int age;
	String name;
	
	public Personn(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	public void Personn(){
		System.out.println("与类名同名的方法，并不是构造方法。这居然可以！！！只是会有一个警告！！！");
	}
}