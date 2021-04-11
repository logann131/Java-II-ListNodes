/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programing Assignment
 */ 
public class ConstructList1
{

    public static void main(String[] args)
    {
        ListNode list = new ListNode(10); // list --> 10 --> null
        list.next = new ListNode(20);     // list --> 10 --> 20 --> null
        list.next.next = new ListNode(30); //list --> 10 --> 20 --> 30 --> null
        System.out.println(list.data + " " + list.next.data
                + " " + list.next.next.data);
        // 10 20 30






    }





}
