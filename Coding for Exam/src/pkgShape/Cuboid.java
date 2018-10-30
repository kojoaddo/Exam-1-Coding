package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int wid, int len, int dep) {
		super(wid, len);
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
	public int compareTo(Object c) {
		Cuboid cub1 = (Cuboid) c;
		return(Double.compare(this.area(), cub1.area()));
	}
	
	class SortByArea implements Comparator<Cuboid>{
		
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.area()-c2.area());
		}
	}
	
	class SortByVolume implements Comparator<Cuboid>{

		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.volume()-c2.volume());
		}
	}
}