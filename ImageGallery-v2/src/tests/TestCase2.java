package tests;

import static org.junit.Assert.*;

import java.awt.Font;
import javax.swing.JLabel;
import org.junit.Before;
import org.junit.BeforeClass;

import views.ImageView;

public class TestCase2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() {
        JLabel lblImageGalery = new JLabel("Image Gallery");
        lblImageGalery.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 32));
        Font font = new Font("Yu Gothic UI Light", Font.PLAIN, 32);

		System.out.println(lblImageGalery.getFont());
		assertEquals(font, lblImageGalery.getFont());
	}


}
