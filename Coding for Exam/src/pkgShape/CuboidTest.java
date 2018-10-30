package pkgShape;

import org.junit.Test;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

class CuboidTest {
	@Test
	public void CuboidConstructorTest() {
		Cuboid cub1 = new Cuboid(2,3,4);
		assertEquals(true, cub1 instanceof Cuboid);
	}
	
	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testSetandGetiLengthCuboid() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(5, cub1.getiLength());	
	}
	
	@Test
	public void testSetandGetiWidthCuboid() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(4, cub1.getiWidth());	
	}
	
	@Test
	public void testSetandGetiDepth() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(6, cub1.getiDepth());	
	}
	
	@Test
	public void testAreaCuboid() {
		Cuboid cub1 = new Cuboid(4,5,6);
		assertEquals(148, cub1.area());	
	}

	@Test
	public void PerimeterExceptionTest() {
	    try {
	    	Cuboid cub1 = new Cuboid(4,5,6);
	        cub1.perimeter();
	        fail("expected exception was not occured.");
	    } catch(UnsupportedOperationException e) {
	    }
	}
	
	@Test
	public void sortByAreaTest() {
		Cuboid cub1 = new Cuboid(2,2,2);
	    Cuboid cub2 = new Cuboid(3,3,3);
	    assertTrue(Integer.signum(cub1.compareTo(cub2)) == -Integer.signum(cub2.compareTo(cub1)));
		}
	
	@Test
	public void sortByVolumeTest() {
		Cuboid cub1 = new Cuboid(2,2,2);
	    Cuboid cub2 = new Cuboid(3,3,3);
	    assertTrue(Integer.signum(cub1.compareTo(cub2)) == -Integer.signum(cub2.compareTo(cub1)));
		}
}