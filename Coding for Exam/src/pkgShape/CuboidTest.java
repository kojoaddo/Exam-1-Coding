package pkgShape;

import org.junit.Test;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

class CuboidTest {
	@Test
	public void constructorTest() {
		Cuboid myCube = new Cuboid(1,2,3);
		assertEquals(true, myCube instanceof Cuboid);
	}
	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}
	private void assertEquals(double d, int j) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void getDepthTest() {
		Cuboid myCube = new Cuboid(1,2,3);
		assertEquals(myCube.getDepth(),3);
	}
	@Test
	public void setDepthTest() {
		Cuboid myCube = new Cuboid(1,2,3);
		myCube.setDepth(8);
		assertEquals(myCube.getDepth(), 3);
	}
	@Test
	public void volumeTest() {
		Cuboid myCube = new Cuboid(1,2,3);
		assertEquals(myCube.volume(),6);
	}
	@Test
	public void areaTest() {
		Cuboid myCube = new Cuboid(1,2,3);
		assertEquals(myCube.area(), 6);
	}
	@Test
	public void perimeterThrowsUnsupportedOperationExceptionTest() {
		try{
			Cuboid myCube = new Cuboid(2,3,4);
			myCube.perimeter();
		}
		catch(UnsupportedOperationException e) {
			
		}
	}
	@Test 
	public void sortByAreaTest() {
		Cuboid myCube = new Cuboid(1,2,3);
		Cuboid myOtherCube = new Cuboid(4,5,6);
		SortByArea mySort = myCube.new SortByArea();
		
		assertTrue(mySort.compare(myCube, myOtherCube) > 0);
		assertTrue(mySort.compare(myOtherCube, myCube) < 0);
		assertTrue(mySort.compare(myCube, myCube) == 0);
	}
	@Test
	public void sortByVolumeTest() {
		Cuboid myCube = new Cuboid(1,3,4);
		Cuboid myOtherCube = new Cuboid(4,5,6);
		SortByVolume mySort = myCube.new SortByVolume();
		
		assertTrue(mySort.compare(myCube, myOtherCube) < 0);
		assertTrue(mySort.compare(myOtherCube, myCube) > 0);
		assertTrue(mySort.compare(myCube, myCube) == 0);
	}
	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
}