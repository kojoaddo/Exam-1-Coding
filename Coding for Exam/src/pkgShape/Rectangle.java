package pkgShape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int wid, int len) {
		this.iWidth = wid;
		this.iLength = len;
	}
	
	public int getLength() {
		return iLength;
	}public int getWidth() {
		return iWidth;
	}
	public void setLength(int newLength) {
		this.iLength = newLength;
	}
	public void setWidth(int newWidth) {
		this.iWidth = newWidth;
	}
	
	
	@Override
	public double area() {
		double area = (double) iWidth * iLength;
		return area;
	}
	@Override
	public double perimeter() {
		double perimeter = (double) 2 * (iWidth + iLength;
		return perimeter;
	}
	public int compareTo(Object myObject) {
		Rectangle myRec = (Rectangle) myObject;
		return(Double.compare(this.area(),myRec.area()));
	}

}