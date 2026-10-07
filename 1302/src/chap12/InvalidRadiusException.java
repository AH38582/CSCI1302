package chap12;

public class InvalidRadiusException extends Exception {
	private double radius;

	public InvalidRadiusException(double radius) {
		super("invalid radius");
		setRadius(radius);
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getMessage() {
		return String.format("%s - %.2f%n", super.getMessage(), getRadius());

	}

}
