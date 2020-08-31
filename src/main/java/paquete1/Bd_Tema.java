package paquete1;

import org.orm.PersistentException;

public class Bd_Tema {
	public Bd_main _unnamed_Bd_main_;
	public Tema _tema1;
	public Bd_main _unnamed_Bd_main_2;
	public Tema _tema;

	public boolean Crear_Tema(Tema aATemaNuevo) {
		
		try {
			TemaDAO.save(aATemaNuevo);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion cometida al crear nuevo tema");
			return false;
		}
		return true;
	}

	public void eliminarTema(int aAId_tema) {
		Bd_main accesoBD=new Bd_main();
		
		Notificacion[] notificaciones_comprobar = accesoBD.inicializarNotificaciones(null);
		Mensaje[] mensajes_comprobar=null;
		try {
			mensajes_comprobar = accesoBD.selecionar_mensajes_tema(TemaDAO.getTemaByORMID(aAId_tema));
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int aux;
		for(int i=0; i< notificaciones_comprobar.length; i++) {
		
			//Eliminamos las notificaciones que tienen asociado un mensaje perteneciente al tema.
			if(notificaciones_comprobar[i].getReferencia_a()!=null) {
				if(notificaciones_comprobar[i].getReferencia_a().getEsta_en().getId_tema()==aAId_tema) {
					accesoBD.archivarNotificacion(notificaciones_comprobar[i]);						
				}
			}else{
				//Eliminamos los reportes a este tema
				
				if(notificaciones_comprobar[i].getMotivo().equals("Reporte_Tema")) {
					aux=Integer.parseInt(notificaciones_comprobar[i].getTitulo());
					
					if(aux== aAId_tema) {
						accesoBD.archivarNotificacion(notificaciones_comprobar[i]);
					}
				}
				
				
			}
		}
		
		
		
		//Borramos los mensajes y las notificaciones asignadas a estos.
		notificaciones_comprobar = accesoBD.inicializarNotificaciones(null);
		for(int i=0; i<mensajes_comprobar.length; i++) {	
			if(mensajes_comprobar[i].getEsta_en().getId_tema()==aAId_tema) {
				
				for(Notificacion auxNotificacion: notificaciones_comprobar) {
					
					if(auxNotificacion.getReferencia_a()!=null) {
						if(auxNotificacion.getReferencia_a().equals(mensajes_comprobar[i])) {
							accesoBD.archivarNotificacion(auxNotificacion);					
						}
					}
				}
				
				accesoBD.eliminarMensaje(mensajes_comprobar[i]);
				notificaciones_comprobar = accesoBD.inicializarNotificaciones(null);
			}
		}
		
		try {
			TemaDAO.delete(TemaDAO.getTemaByORMID(aAId_tema));
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion al elimininar un TEMA, e:= "+ e.toString());
			e.printStackTrace();
		}
		
	}

	

	public Tema[] buscar_temas_peticion(String aABuscar, int id_seccion) {
		
		Tema[] TemasPeticion = null;
		
		
		if(aABuscar==null) {
			aABuscar="";
		}
		
			try {
				//Atencion en este query al no poner Tema.  a funcionado.
				
				System.out.println("Estoy pidiendo SECCION "+id_seccion);
				TemasPeticion=  TemaDAO.listTemaByQuery("seccion_padre="+id_seccion+" and Titulo like '%"+aABuscar+"%'", "Fecha_creacion");
				return TemasPeticion;
				
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Excepcion a saltado en buscar_temas_peticion, a la hora de recoger todos los temas sin aplicar ningun filtro");
			}
		
		
		

		return TemasPeticion;

	}

	
	
	
	
	/**
	 * Antiguo crear tema, que no uso, he creado uno nuevo arriba , tambien esta en visual parading
	 */
	public void CrearTema(int aAId_creador, String aATitulo, String aADescripcion) {
		throw new UnsupportedOperationException();
	}
	
	
	public void DarMeGusta(Usuario aUsuarioInicio, Tema aTemaGustado) {
		throw new UnsupportedOperationException();
	}
	
	
	public Tema[] ordenarTemasAntiguedad(int id_seccion) {
		
		Tema[] devolver = null;
		
		try {
			devolver= TemaDAO.listTemaByQuery("Id_tema LIKE '%' and seccion_padre="+id_seccion+"", "Fecha_creacion");
			System.out.println("Dsitacia de cosas"+ devolver.length );
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return devolver;
	}
	
	public Tema accesoDirectoTema(int idTema) {
		
		Tema devolver=null;
		
		try {
			
			devolver= TemaDAO.getTemaByORMID(idTema);
			
		}catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return devolver;
		
	}
	
}