/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead=null,newTail=null,reverseHead=null,reverseTail=null,last=null;
        int count=1;
        while(head!=null)
        {    ListNode node=head;
            head=head.next;
            node.next=null;
            if(count<left)
            {
                if(newHead==null)
                {
                    newHead=node;
                    newTail=node;
                }else{
                    newTail.next=node;
                    newTail=newTail.next;
                }
            }else if(count<right)
            {
                if(reverseHead==null)
                {reverseHead=node;
                    reverseTail=node;
                    last=node;
                }else{
                    node.next=reverseHead;
                    reverseHead=node;
                }
            }else if(count==right){
                if(reverseHead==null)
                {  reverseHead=node;
                    reverseTail=node;
                    last=node;
                }else{
                    node.next=reverseHead;
                    reverseHead=node;
                }
                if(newHead==null){ newHead=reverseHead;  
                }
                else newTail.next=reverseHead;
            }else{
                last.next=node;
                last=last.next;
            }
            count++;
        }
        
        return newHead;
    }
}