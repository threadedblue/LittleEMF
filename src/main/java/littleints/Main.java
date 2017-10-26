package littleints;

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
		FOM.generateFOM("conf/little.xml");
	}
}
