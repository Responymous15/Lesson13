public class IntList {
    // Fields
    private IntNode _head;

    // Constructors
    public IntList()
    {
        _head = null;
    }
    public IntList(IntNode node)
    {
        _head = node;
    }

    // Getters
    public IntNode getNextElement(IntNode node)
    {
        return node.getNext();
    }
    public void getValueOfNode(IntNode node)
    {
        node.getValue();
    }

    // Methods
    public boolean empty()
    {
        if (_head == null)
            return true;
        else
            return false;
    }

}