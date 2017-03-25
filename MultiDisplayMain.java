package pl.modultrzeci_java;

public class MultiDisplayMain {

	public static void main(String[] args) {
		MultiDisplay md = new MultiDisplay();
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(3);
		md.display();

		md.display("Goodbye cruel world!", 2);
		System.out.println("Current Message: " + md.getDisplayMessage());

	}

}
