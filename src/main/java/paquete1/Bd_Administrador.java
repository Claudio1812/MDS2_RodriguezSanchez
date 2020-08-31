package paquete1;

import org.orm.PersistentException;

public class Bd_Administrador {
	public Bd_main _unnamed_Bd_main_;
	public Administrador _administrador1;
	public Bd_main _unnamed_Bd_main_2;
	public Administrador _administrador;

	public boolean ComprobarSiUserEsAdmin(Usuario aUsuarioAComprobar) {
		
		
		try {
			if(AdministradorDAO.getAdministradorByORMID(aUsuarioAComprobar.getId_usuario())==null) {
				return false;
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion a la hora de comprobar si es admin");
		}
		
		
		return true;

	}
}