import java.util.Arrays;

public class DynamicArrayClass<T> {
	
	Object[] data;
	int size;
	private int requiredCapacity, currentCapacity, newCapacity;

	public DynamicArrayClass() {
		this.size = 0;
		this.data = new Object[1];
	}
	
	public int getSize() {
		return this.data.length;
	}
	
	@SuppressWarnings("unchecked")
	public T getElement(int index) {
		return (T) this.data[index];
	}
	
	public void putElement(Object element) {
		this.requiredCapacity = this.size + 1;
		this.currentCapacity = this.getSize();
		if (this.requiredCapacity > this.currentCapacity) {
			this.newCapacity = this.currentCapacity * 2;
			if (this.newCapacity < this.requiredCapacity) {
				this.newCapacity = this.requiredCapacity;
			}
			this.data = Arrays.copyOf(data, newCapacity);
		}
		data[size++] = element;
	}

}
