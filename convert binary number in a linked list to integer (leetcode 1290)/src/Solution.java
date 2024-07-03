
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Solution {
	public static int getDecimalValue(ListNode head) {
        String binary = "";
        while(head!=null)
        {
            binary = binary + Integer.toString(head.val);
            head = head.next;
        }
        int integer = 0, pow = binary.length()-1;
        for(int i=0;i<binary.length();i++)
        {
            String ch = String.valueOf(binary.charAt(i));
            int n = Integer.valueOf(ch);
            integer = integer + (n * (int)Math.pow(2,pow--));
        }
        return integer;
    }
    public static void main(String args[])
    {
    	ListNode binary1 = new ListNode(1);
    	ListNode binary2 = new ListNode(0,binary1);
    	ListNode binary3 = new ListNode(1,binary2);
    	System.out.println(getDecimalValue(binary3));
    }
}