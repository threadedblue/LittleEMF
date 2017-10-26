package littleints;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.ieee.standards.ieee1516._2010.ObjectModelType;
import org.junit.Test;

import iox.hla.fom2emf.FOM;

public class FOMTest {
	
	@Test
	public void testFOMExists() {
		assertTrue(new File("conf/little.xml").exists());
	}

	@Test
	public void test() {
		ObjectModelType omt = FOM.generateFOM("conf/little.xml");
		EClass eClass = omt.eClass();
		List<EClass> supers  = eClass.getESuperTypes();
		assertNotNull(supers);
		assertNotEquals(0, supers.size());
	}
}
