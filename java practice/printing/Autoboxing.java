package printing;
import java.util.*;
public class Autoboxing {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Character('a'));
		al.add(new Integer(2147483647));
		al.add(new Long(92233723685477807l));
		al.add(new Float(3.14f));
		al.add(new Double(3.17267368));
		al.add(new String("autoboxing"));
		al.add(new Boolean(true));
		System.out.println(al);
	}

}
