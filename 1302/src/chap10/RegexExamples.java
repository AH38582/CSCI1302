package chap10;

public class RegexExamples {

	public static void main(String[] args) {
		// email
		System.out.println("ab12345@georgiasouthern.edu".matches("[a-z]{2}\\d{4,5}@georgiasouthern.edu"));
		
		// phone number
		System.out.println("999-999-9999".matches("[0-9]{3}-[0-9]{3}-[0-9]{4}"));

		// ssn
		System.out.println("000-00-0000".matches("\\d{3}-\\d{2}-\\d{4}"));
		
		// a pattern for even numbers up to 8 including whitespace
		System.out.println("0, 2, 4, 6, 8".matches("[0],\\s[2],\\s[4],\\s[6],\\s[8]"));
		
	}

}