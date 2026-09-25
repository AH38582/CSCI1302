package chap10;
import java.util.Date;

public class Loan {
	private double annualInterestRate, loanAmount;
	private int numberOfYears;
	private Date loanDate;
	
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numOfYears, double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numOfYears);
		setLoanAmount(loanAmount);
	}

	public double getAnnualInterestRate() {
		return annualInterestRate / 100;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public Date getLoanDate() {
		return loanDate;
	}
	
	public double getMonthlyPayment() {
		// Math may be incorrect
		return loanAmount * ((annualInterestRate / 12) * Math.pow(1 + annualInterestRate / 12, numberOfYears / 12))/(Math.pow(1 + annualInterestRate/12, numberOfYears/12) - 1); 
	}
	
	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears;
	}
	
}