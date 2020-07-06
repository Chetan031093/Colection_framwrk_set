package set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashset 
{
	public static void main(String[] args)
	{
		LinkedHashSet l = new LinkedHashSet();
		l.add(11);
		l.add(22);
		l.add(33);
		
		Iterator l1 = l.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
			
		}
	}
}
