import java.util.*;


class program339
{
	public static void main(String A[])
	{
		LinkedList<Integer>obj = new LinkedList();
		
		obj.add(11);
		obj.addLast(298);
		obj.add(21);
		obj.add(51);
		
		obj.remove(0);
		
		System.out.println("Data is : "+obj);
		
		for(int no : obj)
		{
			System.out.println(no);
		}
		
	}
}
