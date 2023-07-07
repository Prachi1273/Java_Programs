import java.util.*;

class Node
{
	public int data;
	public Node Next;
}

class SinglyLL
{
	public Node Head;
	public int Count;
	
	public SinglyLL()
	{
		Head = null;
		Count = 0;
	}
	
	protected void finalize()
	{
		
	}
	
	public void InsertFirst(int No)
	{
		Node newn = new Node(No);
		newn.data = No;
		newn.Next = null;
	}
	
}

class program310
{
	public static void main(String a[])
	{
		SinglyLL obj = new SinglyLL();
	}
}
