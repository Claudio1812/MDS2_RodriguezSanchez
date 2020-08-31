/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateClasesIUDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(paquete1.ClasesIUPersistentManager.instance());
			paquete1.ClasesIUPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
