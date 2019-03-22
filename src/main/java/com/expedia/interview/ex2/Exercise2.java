package com.expedia.interview.ex1;

public class Exercise2 {

    class SinglyLinkedListNode {
    	int val;
        SinglyLinkedListNode next;
        public SinglyLinkedListNode(int val){
        	this.val=val;
        }
    }

    boolean hasCycle(SinglyLinkedListNode head) {
    	SinglyLinkedListNode p1=head;
    	SinglyLinkedListNode p2=head.next;
    	while(p2!=null&&p2.next!=null){
    		p1=p1.next;
    		p2=p2.next.next;
    		if(p2==null){
    			return false;
    		}
    		int val1=p1.val;
    		int val2=p2.val;
    		if(val1==val2){
    			return true;
    		}
    	}
        return false;
    }
}