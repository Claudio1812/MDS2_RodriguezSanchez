/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListClasesIUData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		paquete1.Usuario[] paquete1Usuarios = paquete1.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(paquete1Usuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Usuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Media...");
		paquete1.Media[] paquete1Medias = paquete1.MediaDAO.listMediaByQuery(null, null);
		length = Math.min(paquete1Medias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Medias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		paquete1.Foto[] paquete1Fotos = paquete1.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(paquete1Fotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Fotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Video...");
		paquete1.Video[] paquete1Videos = paquete1.VideoDAO.listVideoByQuery(null, null);
		length = Math.min(paquete1Videos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Videos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		paquete1.Moderador[] paquete1Moderadors = paquete1.ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(paquete1Moderadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Moderadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		paquete1.Tema[] paquete1Temas = paquete1.TemaDAO.listTemaByQuery(null, null);
		length = Math.min(paquete1Temas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Temas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		paquete1.Mensaje[] paquete1Mensajes = paquete1.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(paquete1Mensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Mensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		paquete1.Notificacion[] paquete1Notificacions = paquete1.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(paquete1Notificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Notificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		paquete1.Seccion[] paquete1Seccions = paquete1.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(paquete1Seccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Seccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		paquete1.Administrador[] paquete1Administradors = paquete1.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(paquete1Administradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paquete1Administradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		paquete1.UsuarioCriteria lpaquete1UsuarioCriteria = new paquete1.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1UsuarioCriteria.id_usuario.eq();
		lpaquete1UsuarioCriteria.setMaxResults(ROW_COUNT);
		paquete1.Usuario[] paquete1Usuarios = lpaquete1UsuarioCriteria.listUsuario();
		int length =paquete1Usuarios== null ? 0 : Math.min(paquete1Usuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Usuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Media by Criteria...");
		paquete1.MediaCriteria lpaquete1MediaCriteria = new paquete1.MediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1MediaCriteria.id_media.eq();
		lpaquete1MediaCriteria.setMaxResults(ROW_COUNT);
		paquete1.Media[] paquete1Medias = lpaquete1MediaCriteria.listMedia();
		length =paquete1Medias== null ? 0 : Math.min(paquete1Medias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Medias[i]);
		}
		System.out.println(length + " Media record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		paquete1.FotoCriteria lpaquete1FotoCriteria = new paquete1.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1FotoCriteria.id_media.eq();
		lpaquete1FotoCriteria.setMaxResults(ROW_COUNT);
		paquete1.Foto[] paquete1Fotos = lpaquete1FotoCriteria.listFoto();
		length =paquete1Fotos== null ? 0 : Math.min(paquete1Fotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Fotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
		System.out.println("Listing Video by Criteria...");
		paquete1.VideoCriteria lpaquete1VideoCriteria = new paquete1.VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1VideoCriteria.id_media.eq();
		lpaquete1VideoCriteria.setMaxResults(ROW_COUNT);
		paquete1.Video[] paquete1Videos = lpaquete1VideoCriteria.listVideo();
		length =paquete1Videos== null ? 0 : Math.min(paquete1Videos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Videos[i]);
		}
		System.out.println(length + " Video record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		paquete1.ModeradorCriteria lpaquete1ModeradorCriteria = new paquete1.ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1ModeradorCriteria.id_usuario.eq();
		lpaquete1ModeradorCriteria.setMaxResults(ROW_COUNT);
		paquete1.Moderador[] paquete1Moderadors = lpaquete1ModeradorCriteria.listModerador();
		length =paquete1Moderadors== null ? 0 : Math.min(paquete1Moderadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Moderadors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		paquete1.TemaCriteria lpaquete1TemaCriteria = new paquete1.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1TemaCriteria.id_tema.eq();
		lpaquete1TemaCriteria.setMaxResults(ROW_COUNT);
		paquete1.Tema[] paquete1Temas = lpaquete1TemaCriteria.listTema();
		length =paquete1Temas== null ? 0 : Math.min(paquete1Temas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Temas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		paquete1.MensajeCriteria lpaquete1MensajeCriteria = new paquete1.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1MensajeCriteria.id_mensaje.eq();
		lpaquete1MensajeCriteria.setMaxResults(ROW_COUNT);
		paquete1.Mensaje[] paquete1Mensajes = lpaquete1MensajeCriteria.listMensaje();
		length =paquete1Mensajes== null ? 0 : Math.min(paquete1Mensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Mensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		paquete1.NotificacionCriteria lpaquete1NotificacionCriteria = new paquete1.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1NotificacionCriteria.id_nota.eq();
		lpaquete1NotificacionCriteria.setMaxResults(ROW_COUNT);
		paquete1.Notificacion[] paquete1Notificacions = lpaquete1NotificacionCriteria.listNotificacion();
		length =paquete1Notificacions== null ? 0 : Math.min(paquete1Notificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Notificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		paquete1.SeccionCriteria lpaquete1SeccionCriteria = new paquete1.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1SeccionCriteria.id_seccion.eq();
		lpaquete1SeccionCriteria.setMaxResults(ROW_COUNT);
		paquete1.Seccion[] paquete1Seccions = lpaquete1SeccionCriteria.listSeccion();
		length =paquete1Seccions== null ? 0 : Math.min(paquete1Seccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Seccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		paquete1.AdministradorCriteria lpaquete1AdministradorCriteria = new paquete1.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaquete1AdministradorCriteria.id_usuario.eq();
		lpaquete1AdministradorCriteria.setMaxResults(ROW_COUNT);
		paquete1.Administrador[] paquete1Administradors = lpaquete1AdministradorCriteria.listAdministrador();
		length =paquete1Administradors== null ? 0 : Math.min(paquete1Administradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paquete1Administradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListClasesIUData listClasesIUData = new ListClasesIUData();
			try {
				listClasesIUData.listTestData();
				//listClasesIUData.listByCriteria();
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
