package pkgShape;

import org.junit.Test;

class RectangleTest {

	@Test
	public void constructorTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(true, myRectangle instanceof Rectangle);
	}
	private void assertEquals(int i, double d) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void getLengthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(3,myRectangle.getLength());
	}
	@Test
	public void getWidthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(2,myRectangle.getWidth());
	}
	@Test
	public void setLengthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		myRectangle.setLength(5);
		assertTrue(5 == myRectangle.getLength());
	}
	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void setWidthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		myRectangle.setWidth(7);
		assertTrue(7 == myRectangle.getWidth());
	}
	@Test
	public void areaTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(6, myRectangle.area());
	}
	@Test
	public void perimeterTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(10, myRectangle.perimeter());
	}
	@Test
	public void compareToTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		Rectangle mySecondRectangle = new Rectangle(7,3);
		assertTrue(myRectangle.compareTo(mySecondRectangle) < 0);
		assertTrue(mySecondRectangle.compareTo(myRectangle) > 0);
		assertTrue(myRectangle.compareTo(myRectangle) == 0);
	}
}