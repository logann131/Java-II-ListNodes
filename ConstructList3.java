/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programing Assignment
 */ 
public class ConstructList3
{

    public static void main(String[] args)
    {

        ListNode list1 = new ListNode(10, new ListNode(20)); //list1
        ListNode list2 = new ListNode(30, new ListNode(40)); //list2

        list1.next.next = list2;
        list2 = list2.next;
        list1.next.next.next = null;

        System.out.println(list1.data + " " + list1.next.data + " " + list1.next.next.data);
        System.out.println(list2.data + " " + list2.next.data + " " + list2.next.next.data);

    }
}
