
public class MutableString {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rama");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
		
		
		StringBuilder strb=new StringBuilder("Ravana");
		System.out.println(strb);
		strb.append("Asura");
		System.out.println(strb);
	}

}
