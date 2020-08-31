/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteClasesIUData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = paquete1.ClasesIUPersistentManager.instance().getSession().beginTransaction();
		try {
			paquete1.Usuario lpaquete1Usuario = paquete1.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			paquete1.UsuarioDAO.delete(lpaquete1Usuario);
			paquete1.Media lpaquete1Media = paquete1.MediaDAO.loadMediaByQuery(null, null);
			// Delete the persistent object
			paquete1.MediaDAO.delete(lpaquete1Media);
			paquete1.Foto lpaquete1Foto = paquete1.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			paquete1.FotoDAO.delete(lpaquete1Foto);
			paquete1.Video lpaquete1Video = paquete1.VideoDAO.loadVideoByQuery(null, null);
			// Delete the persistent object
			paquete1.VideoDAO.delete(lpaquete1Video);
			paquete1.Moderador lpaquete1Moderador = paquete1.ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			paquete1.ModeradorDAO.delete(lpaquete1Moderador);
			paquete1.Tema lpaquete1Tema = paquete1.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			paquete1.TemaDAO.delete(lpaquete1Tema);
			paquete1.Mensaje lpaquete1Mensaje = paquete1.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			paquete1.MensajeDAO.delete(lpaquete1Mensaje);
			paquete1.Notificacion lpaquete1Notificacion = paquete1.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			paquete1.NotificacionDAO.delete(lpaquete1Notificacion);
			paquete1.Seccion lpaquete1Seccion = paquete1.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			paquete1.SeccionDAO.delete(lpaquete1Seccion);
			paquete1.Administrador lpaquete1Administrador = paquete1.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			paquete1.AdministradorDAO.delete(lpaquete1Administrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteClasesIUData deleteClasesIUData = new DeleteClasesIUData();
			try {
				deleteClasesIUData.deleteTestData();
			}
			finally {
				paquete1.ClasesIUPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
