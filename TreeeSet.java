package set;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeeSet 
{
	public static void main(String[] args)
	{
		TreeSet s = new TreeSet();
		s.add(11);
		s.add(12);
		//s.add("chetan);
		s.add(13);
		s.add(15);
		s.add(14);
		s.add(14);
		
		Iterator i = s.iterator();//acending order
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		
		TreeSet s1 = new TreeSet();
		s1.add("chetan");
		s1.add("akshay");
		s1.add("salve");
		s1.add("dinga");
		s1.add("bunga");
		Iterator i1 = s1.descendingIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println();

		Iterator i2 =s1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
				
	}
}
