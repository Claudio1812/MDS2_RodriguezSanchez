/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateClasesIUData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = paquete1.ClasesIUPersistentManager.instance().getSession().beginTransaction();
		try {
			paquete1.Usuario lpaquete1Usuario = paquete1.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.UsuarioDAO.save(lpaquete1Usuario);
			paquete1.Media lpaquete1Media = paquete1.MediaDAO.loadMediaByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.MediaDAO.save(lpaquete1Media);
			paquete1.Foto lpaquete1Foto = paquete1.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.FotoDAO.save(lpaquete1Foto);
			paquete1.Video lpaquete1Video = paquete1.VideoDAO.loadVideoByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.VideoDAO.save(lpaquete1Video);
			paquete1.Moderador lpaquete1Moderador = paquete1.ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.ModeradorDAO.save(lpaquete1Moderador);
			paquete1.Tema lpaquete1Tema = paquete1.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.TemaDAO.save(lpaquete1Tema);
			paquete1.Mensaje lpaquete1Mensaje = paquete1.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.MensajeDAO.save(lpaquete1Mensaje);
			paquete1.Notificacion lpaquete1Notificacion = paquete1.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.NotificacionDAO.save(lpaquete1Notificacion);
			paquete1.Seccion lpaquete1Seccion = paquete1.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.SeccionDAO.save(lpaquete1Seccion);
			paquete1.Administrador lpaquete1Administrador = paquete1.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			paquete1.AdministradorDAO.save(lpaquete1Administrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		paquete1.UsuarioCriteria lpaquete1UsuarioCriteria = new paquete1.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1UsuarioCriteria.id_usuario.eq();
		System.out.println(lpaquete1UsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Media by MediaCriteria");
		paquete1.MediaCriteria lpaquete1MediaCriteria = new paquete1.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1MediaCriteria.id_media.eq();
		System.out.println(lpaquete1MediaCriteria.uniqueMedia());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		paquete1.FotoCriteria lpaquete1FotoCriteria = new paquete1.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1FotoCriteria.id_media.eq();
		System.out.println(lpaquete1FotoCriteria.uniqueFoto());
		
		System.out.println("Retrieving Video by VideoCriteria");
		paquete1.VideoCriteria lpaquete1VideoCriteria = new paquete1.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1VideoCriteria.id_media.eq();
		System.out.println(lpaquete1VideoCriteria.uniqueVideo());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		paquete1.ModeradorCriteria lpaquete1ModeradorCriteria = new paquete1.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1ModeradorCriteria.id_usuario.eq();
		System.out.println(lpaquete1ModeradorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		paquete1.TemaCriteria lpaquete1TemaCriteria = new paquete1.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1TemaCriteria.id_tema.eq();
		System.out.println(lpaquete1TemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		paquete1.MensajeCriteria lpaquete1MensajeCriteria = new paquete1.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1MensajeCriteria.id_mensaje.eq();
		System.out.println(lpaquete1MensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		paquete1.NotificacionCriteria lpaquete1NotificacionCriteria = new paquete1.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1NotificacionCriteria.id_nota.eq();
		System.out.println(lpaquete1NotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		paquete1.SeccionCriteria lpaquete1SeccionCriteria = new paquete1.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1SeccionCriteria.id_seccion.eq();
		System.out.println(lpaquete1SeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		paquete1.AdministradorCriteria lpaquete1AdministradorCriteria = new paquete1.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaquete1AdministradorCriteria.id_usuario.eq();
		System.out.println(lpaquete1AdministradorCriteria.uniqueAdministrador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateClasesIUData retrieveAndUpdateClasesIUData = new RetrieveAndUpdateClasesIUData();
			try {
				retrieveAndUpdateClasesIUData.retrieveAndUpdateTestData();
				//retrieveAndUpdateClasesIUData.retrieveByCriteria();
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
