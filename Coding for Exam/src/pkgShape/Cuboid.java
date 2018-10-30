package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int wid, int len, int dep) {
		super(width, len);
		this.iDepth = dep;
	}
	public int getDepth() {
		return iDepth;
	}
	public void setDepth(int newDepth) {
		iDepth = newDepth;
	}
	public double volume() {
		double volume = (double) iDepth * super.getLength() * super.getWidth();
		return volume;
	}
	@Override
	public double area() {
		double area = (double) 2 * (super.getLength() * super.getWidth() + iDepth * super.getLength() + iDepth * super.getWidth());
		return area;
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Cannot compute perimeter of the 3-D object");
	}
	@Override
	public int compareTo(Object myObject) {
		Cuboid myCuboid = (Cuboid) myObject;
		return Double.compare(myCuboid.area(),this.area());
	}
	class SortByArea implements Comparator<Cuboid>{
		SortByArea(){
			
		}
		@Override
		public int compare(Cuboid cuboid1, Cuboid cuboid2) {
			return cuboid1.compareTo(cuboid2);
		}
	}
	class SortByVolume implements Comparator<Cuboid>{
		SortByVolume(){
			
		}
		@Override
		public int compare(Cuboid cuboid1, Cuboid cuboid2) {
			return (int) (cuboid1.volume() - cuboid2.volume());
		}
		
	}
}