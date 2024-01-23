public class Main
{
    public static void main(String[] args)
    {
        IntNode head = new IntNode(1);
        head.setNext(new IntNode(2));
        head.getNext().setNext(new IntNode(3));
        head.getNext().getNext().setNext(new IntNode(4));
        head.getNext().getNext().getNext().setNext(new IntNode(5));

        IntNode temp = head;
        for (int i = 0; i < 5; i++)
        {
            System.out.print(temp.toString());
            temp = temp.getNext();
        }


    }
}