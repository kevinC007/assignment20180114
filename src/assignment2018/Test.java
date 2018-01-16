package assignment2018;

import java.util.*;

public class Test {
	public static void main(String[] args){
		Test t = new Test();
		int[] input = {1,2,7,16,10};
		int p1 = 4;
		int p2 = 5;
		t.find(input, 3);
		t.find(input, 20);
		Node a = new Node(2);
		Node a1 = new Node(4);
		Node a2 = new Node(3);
		a.next = a1;
		a1.next = a2;
		a2.next = null;
		Node b = new Node(5);
		Node b1 = new Node(6);
		Node b2 = new Node(4);
		b.next = b1;
		b1.next = b2;
		b2.next = null;
		Node res = t.sumList(a, b);
		System.out.print(res.val + "->");
		System.out.print(res.next.val + "->");
		System.out.print(res.next.next.val);
		System.out.println(t.bitwiseAnd(5, 9));
		Node res1 = t.reverse(a);
		System.out.print(res1.val + "->");
		System.out.print(res1.next.val + "->");
		System.out.print(res1.next.next.val);
		System.out.println(t.isPowerOfTwo(p1));
		System.out.println(t.isPowerOfTwo(p2));
		int[] num = new int[]{1,2,3};
		t.permute(num);
		
	}
	// permutation
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		permute(num, 0, result);
		return result;
	}
	 
	void permute(int[] num, int start, ArrayList<ArrayList<Integer>> result) {
	 
		if (start >= num.length) {
			ArrayList<Integer> item = convertArrayToList(num);
			result.add(item);
		}
	 
		for (int j = start; j <= num.length - 1; j++) {
			swap(num, start, j);
			permute(num, start + 1, result);
			swap(num, start, j);
		}
	}
	 
	private ArrayList<Integer> convertArrayToList(int[] num) {
		ArrayList<Integer> item = new ArrayList<Integer>();
		for (int h = 0; h < num.length; h++) {
			item.add(num[h]);
		}
		return item;
	}	 
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// power of two
	public boolean isPowerOfTwo(int n) {
	    return n>0 && (n&n-1)==0;
	}
	
	// find sum
	public void find(int[] arr, int sum)
    { 
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
        System.out.println(count>0? true : false);
    }
	// sum linked list
	public Node sumList(Node l1, Node l2){
		Node pre = new Node(0);
		Node head = pre;
		int carry = 0;
		while(l1 != null || l2 != null || carry != 0){
			Node cur = new Node(0);
			int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
			cur.val = sum % 10;
			carry = sum / 10;
			pre.next = cur;
			pre = cur;
			
			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}
		return head.next;
	}
	
	// AND bitwise
	public  int bitwiseAnd(int m, int n) {
        while(n>m) {
        	n= n & n-1;
        	System.out.println(n);
        }
	     return m & n;
	    }
	// reverse linked list
	public Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	    }
	
	// BST MAX MIN
	public int max(TreeNode root){
		 TreeNode current = root;
		  while (current.left != null) {
		      current = current.left;
		     }
		      return (current.data);
		    }
	public int min(TreeNode root){
		 TreeNode current = root;
		  while (current.right != null) {
		      current = current.right;
		     }
		      return (current.data);
		    }
	
	//BST Height
	public int height(TreeNode node) 
    {
        if (node == null)
            return 0;
        else
        {
            int lDepth = height(node.left);
            int rDepth = height(node.right);
  
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
}

class Node{
	int val;
	Node next;
	Node(int num){
		this.val = num;
	}
}
class TreeNode {
	 int data;
	TreeNode left,right;
	public TreeNode(int dataVal){
		data=dataVal;
		left=right=null;
	}
}
