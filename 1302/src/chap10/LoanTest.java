package chap10;

public class LoanTest {

	public static void main(String[] args) {
		Loan l1 = new Loan(5.0, 30, 150000);
		Loan l2 = new Loan(7.2, 5, 28000);
		Loan l3 = new Loan(6.5, 10, 15000);
		
		System.out.println(l1.getMonthlyPayment());
		System.out.println(l2.getMonthlyPayment());
		System.out.println(l3.getMonthlyPayment());

	}

}