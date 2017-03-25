package pl.modultrzeci_java;

public class Point {

	private int x;
	private int y;

	Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public boolean isEqualTo(Point o) {
		if (x == o.x && y == o.y) {
			return true;
		}
		return false;
	}

	public void move(int a, int b) {
		x = x + a;
		y = y + b;
	}

	public void moveToXY(int a, int b) {
		x = a;
		y = b;
	}

	public double distanceTo(Point o) {
		double distans = Math.sqrt(Math.pow(x - o.x, 2) + Math.pow(y - o.y, 2));
		return distans;
	}

}
