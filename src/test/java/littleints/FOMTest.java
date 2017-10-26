package littleints;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class FOMTest {
	
	@Test
	public void testFOMExists() {
		assertTrue(new File("fom/TripleFederation.xml").exists());
	}

	@Test
	public void testDe_Serialize() {


	}
}
