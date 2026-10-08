package lab06;

public class InvalidCalcOperationException extends Exception {
	private char operation;
	
	public InvalidCalcOperationException() {
		super("Invalid operation");
	}
	public InvalidCalcOperationException(char operation) {
		this();
		setOperation(operation);
		
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	@Override
	public String getMessage() {
		return String.format("%s: %c was chosen", super.getMessage(), operation);
	}

}
