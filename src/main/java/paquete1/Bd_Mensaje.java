package paquete1;

import org.orm.PersistentException;

public class Bd_Mensaje {
	public Bd_main _unnamed_Bd_main_;
	public Mensaje _mensaje1;
	public Bd_main _unnamed_Bd_main_2;
	public Mensaje _mensaje;

	public void subir_Mensaje(String aATitulo, String aACuerpo, int aAId_usuario, int aAId_tema) {
		throw new UnsupportedOperationException();
	}

	public void asignar_media_mensaje(int aAId_mensaje, Media aAMedia_a_asignar) {
		throw new UnsupportedOperationException();
	}

	public int VisitarTema(int aAId_mensaje) {
		throw new UnsupportedOperationException();
	}

	
	//La primera tabla es donde se guardan los likes, la primera que relacion like con mensajes.
	public void darMeGusta_Mensaje(Usuario aAUsuario, Mensaje aAMensaje) throws PersistentException {
		
		Mensaje bmensaje= MensajeDAO.getMensajeByORMID(aAMensaje.getId_mensaje());
		
		UsuarioSetCollection legusta = bmensaje.gustado_por;
		
		for(Usuario user: legusta.toArray()) {
			System.out.println("Le gusta "+user.getId_usuario()+" mensaje "+bmensaje.getTitulo());
		}
		
	}

	public Mensaje[] inicializarMensajesPropiosPerfil(Usuario aAUsuario) {
		
		Mensaje[] devolver=null;

		try {
			devolver= MensajeDAO.listMensajeByQuery("usuario_creador='"+aAUsuario.getId_usuario()+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion en Bd_Mensaje, al recoger los mensajer del usuario creador");
		}
		
		return devolver;
		
	}

	public int numeroMensajesTotalesUsuario(Usuario aAUsuario) {
		int devolver=0;
		
		try {
			devolver= MensajeDAO.listMensajeByQuery("", null).length;
		} catch(PersistentException e) {
			e.printStackTrace();
			System.out.println("Error al obtener listado de mensajes de la consulta para obtener la cantidad");
		}
	return devolver;
	}

	
	public int cantidadlikeMensaje(Usuario aAUsuario, Mensaje aMensaje) {
		
		int devolver;
		
		try {
			devolver= MensajeDAO.getMensajeByORMID(aMensaje.getId_mensaje()).getMe_gusta();
		} catch(PersistentException e) {
			e.printStackTrace();
			
		}
		
		throw new UnsupportedOperationException();
	}

	
	
	public int buscarParticipantes(Tema aATema) {
		
		throw new UnsupportedOperationException();
		
	}

	public Mensaje[] selecionar_mensajes_tema(Tema aTema) {
		
		Mensaje[] devolver=null;
		try {
			devolver= MensajeDAO.listMensajeByQuery("tema_padre='"+aTema.getId_tema()+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion en Bd_Mensaje, selecionar_mensajes_tema, intentamos recoger los mensajes del tema que hemos clicado");
		}
		
		return devolver;
	}

	public void Crear_mensaje(Mensaje aMensajeEntrada) {
		
		try {
			MensajeDAO.save(aMensajeEntrada);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exepcion en crear mensaje, Bd_Mensaje");
		}
		
		
		
		
	}
	
	public void eliminarMensaje(Mensaje mensaje) {
		
		Bd_main accesoBD=new Bd_main();

		//Comprobamos que no tenga denuncias en el mensaje
		Notificacion[] historialNotificaciones_comprobar=accesoBD.inicializarNotificaciones(null);
		
			
		for(int i=0; i<historialNotificaciones_comprobar.length; i++) {
				
			if(historialNotificaciones_comprobar[i].getReferencia_a()!=null) {
				if(historialNotificaciones_comprobar[i].getReferencia_a().equals(mensaje)) {
						accesoBD.archivarNotificacion(historialNotificaciones_comprobar[i]);
				}	
			}
			
		}
		
		
		try {
				mensaje.gustado_por.clear();
				mensaje.referenciado_por.clear();
				mensaje.respondido_por.clear();
				
				MensajeDAO.delete(mensaje);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion al eliminar un mensaje");
		}
		
	}
}