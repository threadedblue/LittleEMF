package littleints;

import org.ieee.standards.ieee1516._2010.ObjectModelType;

import iox.hla.core.federatecore.FederatecorePackage;
import iox.hla.fom2emf.FOM;
import iox.sds4emf.Registrar;
import littleints.theseints.TheseintsPackage;
import littleints.thoseInts.ThoseIntsPackage;

public class Main {
	public static void main(String[] args) {
		Registrar.registerPackage(FederatecorePackage.eNS_URI, FederatecorePackage.eINSTANCE);
		Registrar.registerPackage(TheseintsPackage.eNS_URI, TheseintsPackage.eINSTANCE);
		Registrar.registerPackage(ThoseIntsPackage.eNS_URI, ThoseIntsPackage.eINSTANCE);
		ObjectModelType omt = FOM.generateFOM("conf/little.xml");
	}
}
