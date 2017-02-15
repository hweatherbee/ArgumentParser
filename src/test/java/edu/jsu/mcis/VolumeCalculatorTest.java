
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
		
		int calculatedValue = vc.getVolme();
		assertEquals(70, calculatedValue);
    }

    @Test(expected= NumberFormatException.class)
    public void testUnrecognizedArgument() {
		
    }

    
}
