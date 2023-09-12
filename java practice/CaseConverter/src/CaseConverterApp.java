import java.util.Scanner;

public class CaseConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to convert the case...");
		String s=scan.nextLine();
		CaseConverter cc=new CaseConverter();
		StringBuffer resultString=cc.caseConvert(s);
		System.out.println("Original String : "+s);
		System.out.println("CaseConverted String : "+resultString);
	}

}
