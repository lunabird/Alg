package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<String> fizzBuzz(int n) {
		ArrayList<String> lst = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				lst.add("FizzBuzz");
			} else if (i % 3 == 0) {
				lst.add("Fizz");
			} else if (i % 5 == 0) {
				lst.add("Buzz");
			} else {
				lst.add(i + "");
			}
		}
		return lst;
	}

	public String reverseString(String s) {
		char[] arr = s.toCharArray();
		char[] a = new char[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			a[j] = arr[i];
		}
		String c = String.valueOf(a);
		return c;
	}

	public int singleNumber(int[] nums) {
		int single = 0;
		for (int i = 0; i < nums.length; i++) {
			single = single ^ nums[i];
		}
		return single;
	}

	public boolean canWinNim(int n) {
		if(n==1 || n==2 || n==3) return true;
		return !(canWinNim(n-1) && canWinNim(n-2) && canWinNim(n-3));
	}

	public TreeNode invertTree1(TreeNode root) {
        if(root==null) return root;
        TreeNode node = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = node;
        return root;
    }
	public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	TreeNode node = queue.poll();
        	TreeNode left = node.left;
        	node.left = node.right;
        	node.right = left;
        	if(node.left!=null){
        		queue.offer(node.left);
        	}
        	if(node.right!=null){
        		queue.offer(node.right);
        	}
        }
        return root;
    }
	public int addDigits(int num) {
		return num==0?0:(num%9==0?9:num%9);
//		if(num<10) return num;
//        String a = num+"";
//        char[] arr = a.toCharArray();
//        int sum = 0;
//        for(int i=0;i<a.length();i++){
//        	sum += Integer.parseInt(arr[i]+"");
//        }
//        return addDigits(sum);
    }
	public void moveZeroes(int[] nums) {
        int insertPos = 0;
		for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0) {
        		nums[insertPos++] = nums[i];
        	}
        }
		while(insertPos<nums.length){
			nums[insertPos++] = 0;
		}
    }
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        char[] m = magazine.toCharArray();
        for(int i=0;i<m.length;i++){
        	arr[m[i]-'a']++;
        }
        char[] r = ransomNote.toCharArray();
        for(int i=0;i<r.length;i++){
        	if(--arr[r[i]-'a']<0){
        		return false;
        	}
        }
		return true;
    }
	public int sumOfLeftLeaves(TreeNode root) {
		if(root==null) return 0;
		int sum = 0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
        	sum += root.left.val;
        }else{
        	sum += sumOfLeftLeaves(root.left);
        }
        return sum+sumOfLeftLeaves(root.right); 
    }
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
        	s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
        	if(s1.contains(nums2[i])){
        		result.add(nums2[i]);
        	}
        }
        
        int[] resultArr = new int[result.size()];
        int i=0;
        for(Integer num:result){
        	resultArr[i++] = num;
        }
        return resultArr;
        
    }
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
    }
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}else if(p!=null && q!=null){
			if(p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ){
	        	return true;
	        }else{
	        	return false;
	        }
		}else{
			return false;
		}
		
    }
	public static void main(String[] args) {
		Solution s = new Solution();
//		System.out.println(s.canConstruct("ab", "cbbacbb"));
		// s.fizzBuzz(15);
		// s.reverseString("hello");
//		int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
//		s.singleNumber(nums);
	}
}
//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
 //Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
 