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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(head!=null){
            int value=map.getOrDefault(head.val,0)+1;
            map.put(head.val,value);
            head=head.next;
        }
        TreeMap<Integer, Integer> sorted= new TreeMap<>(map);
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        for(Map.Entry<Integer,Integer> entry:sorted.entrySet()){
            if(entry.getValue()==1){
                ListNode root=new ListNode(entry.getKey());
                temp.next=root;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}
