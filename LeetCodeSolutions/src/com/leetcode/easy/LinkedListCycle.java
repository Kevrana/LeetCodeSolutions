package com.leetcode.easy;



// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

	//Definition for singly-linked list Node
	class ListNode {
		int data;
		ListNode next;
		
		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}
	
	// solution - slow and fast pointer approach
	// slow - goes 1 step ahead
	// fast - goes 2 steps ahead
	// when slow == fast, we have a cycle
	// otherwise, if fast or fast.next is null then no cycle
	public boolean hasCycle(ListNode head) {
		
		// if head/head's next is null, no cycle because its the only node in list
		if(head == null || head.next == null) {
			return false;
		}
		
		// slow and fast pointers starting at head
		ListNode slow = head;
		ListNode fast = head;
		
		// while list doesn't have an end (if last node points to null,this means no cycle)
		while(fast != null && fast.next != null) {
			
			//step up the slow and fast pointers
			slow = slow.next;
			fast = fast.next.next;
			
			// if slow and fast meet again, indicates a cycle
			if(slow == fast) {
				return true;
			}
		}
		
		// otherwise no cycle detected
		return false;   
	 }
	
	
	public static void main(String[] args) {
		
		// test in LeetCode environment as we would need full LinkedList implementation to run
	
	}

}
