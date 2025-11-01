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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode h1=null,t=null;
        Set<Integer> set=new HashSet<Integer>();
        for(int num:nums)
        {
            set.add(num);
        }
        while(head!=null)
        {
            if(!set.contains(head.val))
            {
                if(h1==null)
                {
                    h1=head;
                    t=head;
                }else{
                    t.next=head;
                    t=t.next;
                }
                head=head.next;
                t.next=null;
            }else
            head=head.next;
        }
        return h1;
    }
}