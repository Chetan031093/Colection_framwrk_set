package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.Collections;

public class Hasshset
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add(1);
		h.add("chetan");
		h.add("prakash");
		h.add("salve");
		
		Stack s = new Stack();
		s.push(100);
		s.push(200);
		s.push(300);
		s.addAll(h);
		
		Iterator ss = s.iterator();
		while(ss.hasNext())
		{
			System.out.println(ss.next());
		}
		System.out.println();
		
		int res =  s.size();
		System.out.println(res);
		
		System.out.println("frequency is : "+Collections.frequency(s, 100));
		//System.out.println("max is : "+Collections.max(s));
		//System.out.println("min is : "+Collections.min(s));
		System.out.println();
		Collections.replaceAll(s, 100, 400);
		System.out.println(s);
		Collections.swap(s, 2, 3);
		System.out.println(s);
		Collections.shuffle(s);
		System.out.println(s);
		
	}
}
