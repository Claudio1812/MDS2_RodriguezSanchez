package paquete1;

import org.orm.PersistentException;

public class Bd_Notificacion {
	public Bd_main _unnamed_Bd_main_;
	public Notificacion _unnamed_Notificacion_;
	public Bd_main _unnamed_Bd_main_2;
	public Notificacion _unnamed_Notificacion_2;

	public Notificacion[] inicualizarNotificaciones(Usuario aUsuario) {
		
		Notificacion[] devolver=null;
		try {
			
			if(aUsuario==null) {
				devolver=NotificacionDAO.listNotificacionByQuery(null, null);
			}else {
				devolver=NotificacionDAO.listNotificacionByQuery("usuario_propietario='"+aUsuario.getId_usuario() +"'", null);

			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Recoger notificaciones usuario historial excepcion");
		}
		
		return devolver;
	}

	public void archivarNotificacion(Notificacion aNotificacion) {
		
		try {
			NotificacionDAO.delete(aNotificacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion al eliminar notificacion");
		}
		
		
	}

	public void ValidarReporte(int aAId_notificacion, int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void AvisarAdministrador(int aAId_usuario, int aAId_admin) {
		throw new UnsupportedOperationException();
	}

	public Notificacion[] ObtenerNotificacionesReporte(int aAId_usuario, String aAMotivo) {
		throw new UnsupportedOperationException();
	}

	public Tema visitarTema(Notificacion aNotificacion) {
		throw new UnsupportedOperationException();
	}
	
	public void crear_notificacion(Notificacion notificacion) {
		
		try {
			NotificacionDAO.save(notificacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion crear notificacion");
		}
	}
	
	public Notificacion[] devolverNotificacionesReporte() {
		
		Notificacion[] devolucion = null;
		try {
			devolucion=NotificacionDAO.listNotificacionByQuery("Motivo LIKE 'Reporte%' ", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion al buscar las notificaciones reporte");
			
		}
		
		return devolucion;
		
		
		
	}
	
}