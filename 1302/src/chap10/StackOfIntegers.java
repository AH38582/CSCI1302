package chap10;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	public void push(int value) {
		if (size >= elements.length) {
			System.arraycopy(elements, value, elements, value, value);
		}
	}

	public int getSize() {
		return size;
	}
	
	

}