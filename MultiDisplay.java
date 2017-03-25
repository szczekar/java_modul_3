package pl.modultrzeci_java;

public class MultiDisplay {

	private String message;
	private int count;

	public void setDisplayMessage(String message) {
		this.message = message;
	}

	public void setDisplayCount(int count) {
		this.count = count;
	}

	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public void display(String message, int count) {
		this.message = message;
		this.count = count;
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public String getDisplayMessage() {
		return message;
	}
}
