package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

import views.ImageView;

public class TestCase1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() {
		boolean vsbl = true;
		ImageView frame = new ImageView();
		frame.setVisible(true);
		

		System.out.println(frame.isVisible());
		assertEquals(vsbl, frame.isVisible());
	}


}
