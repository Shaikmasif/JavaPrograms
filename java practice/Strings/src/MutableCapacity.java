
public class MutableCapacity {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Moin is a Java Developer");
		System.out.println(sb.capacity());
		
		System.out.println("=================================");
		
		StringBuilder strb=new StringBuilder();
		System.out.println(strb.capacity());
		strb.append("Saif is a Java Developer");
		System.out.println(strb.capacity());
		
	}

}
