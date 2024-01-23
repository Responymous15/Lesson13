public class IntNode
{
    // Fields
    private int _value;
    private IntNode _next;

    // Constructors
    public IntNode(int val)
    {
        _value = val;
        _next = null;
    }
    public IntNode(int val, IntNode next)
    {
        _value = val;
        _next = next;
    }

    // Getters
    public int getValue()
    {
        return _value;
    }
    public IntNode getNext()
    {
        return _next;
    }

    // Setters
    public void setValue(int v)
    {
        _value = v;
    }
    public void setNext(IntNode n)
    {
        _next = n;
    }

    public String toString()
    {
        return (_value + "->");
    }
}