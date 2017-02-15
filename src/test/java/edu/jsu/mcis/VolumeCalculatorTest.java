
import static org.junit.Assert.*;
import org.junit.Test;


public class VolumeCalculatorTest {
	private VolumeCalculator vc;
	
	@Before
	public void setUp(){
		vc = new VolumeCalculator();
	}
    @Test
    public void testVolumeCalculatorNormalFunction() {
		int length = 7;
		int width = 5;
		int height = 2;
		
		vc.setLength(length);
		vc.setWidth(width);
		vc.setHeight(height);
		assertEquals(len, vc.getLength());
		assertEquals(width, vc.getWidth());
		assertEquals(height, vc.getHeight());
    }

    @Test
    public final void testFindMaximumElement2() {

        int[] testInput = new int[] { 117, 56, 38, 11, 0 };
        int expectedResult = 117;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with descending order",
                actualResult == expectedResult);
    }

    @Test
    public final void testFindMaximumElement3() {

        int[] testInput = new int[] { 42, 11, 38, 75, 14 };
        int expectedResult = 75;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with random order",
                actualResult == expectedResult);
    }

}
