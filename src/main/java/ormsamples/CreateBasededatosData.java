/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateBasededatosData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = paquete1.BasededatosPersistentManager.instance().getSession().beginTransaction();
		try {
			paquete1.Tema lpaquete1Tema = paquete1.TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : privado, oculto, tema_contiene, publico, seccion_padre
			paquete1.TemaDAO.save(lpaquete1Tema);
			paquete1.Mensaje lpaquete1Mensaje = paquete1.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_gustado, Respuesta_de, tema_pertenece, mensaje_tiene_video
			paquete1.MensajeDAO.save(lpaquete1Mensaje);
			paquete1.Usuario lpaquete1Usuario = paquete1.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : le_gusta, es_moderado, administrado
			paquete1.UsuarioDAO.save(lpaquete1Usuario);
			paquete1.Moderador lpaquete1Moderador = paquete1.ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modera
			paquete1.ModeradorDAO.save(lpaquete1Moderador);
			paquete1.Administrador lpaquete1Administrador = paquete1.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administra
			paquete1.AdministradorDAO.save(lpaquete1Administrador);
			paquete1.Media lpaquete1Media = paquete1.MediaDAO.createMedia();
			// Initialize the properties of the persistent object here
			paquete1.MediaDAO.save(lpaquete1Media);
			paquete1.Foto lpaquete1Foto = paquete1.FotoDAO.createFoto();
			// Initialize the properties of the persistent object here
			paquete1.FotoDAO.save(lpaquete1Foto);
			paquete1.Video lpaquete1Video = paquete1.VideoDAO.createVideo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensaje_contenedor_video
			paquete1.VideoDAO.save(lpaquete1Video);
			paquete1.Nota lpaquete1Nota = paquete1.NotaDAO.createNota();
			// Initialize the properties of the persistent object here
			paquete1.NotaDAO.save(lpaquete1Nota);
			paquete1.Notificacion lpaquete1Notificacion = paquete1.NotificacionDAO.createNotificacion();
			// Initialize the properties of the persistent object here
			paquete1.NotificacionDAO.save(lpaquete1Notificacion);
			paquete1.Seccion lpaquete1Seccion = paquete1.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tema_hijo
			paquete1.SeccionDAO.save(lpaquete1Seccion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateBasededatosData createBasededatosData = new CreateBasededatosData();
			try {
				createBasededatosData.createTestData();
			}
			finally {
				paquete1.BasededatosPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
