package paquete1;

import org.orm.PersistentException;

public class Bd_seccion {
	public Bd_main _unnamed_Bd_main_;
	public Seccion _seccion1;
	public Bd_main _unnamed_Bd_main_2;
	public Seccion _seccion;

	public void asignar_media_seccion(int aAId_tema, Media aAMedia_a_asignar) {
		throw new UnsupportedOperationException();
	}

	public void EliminarSeccion(int aAId_seccion) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Cuando entramos en el foro nos tienen que aparecer todas las secciones de golpe, aqui las cargamos
	 */
	public Seccion[] cargar_SeccionesInicio() {
		Seccion[] devolver = null;
		
		try {
			System.out.println("Cuantas secciones? ");

			Seccion[] secciones=  SeccionDAO.listSeccionByCriteria(new SeccionCriteria());
			System.out.println("Cuantas secciones? "+secciones.length);

			
			
			
			
			devolver=secciones;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return devolver;
	}

	public Seccion[] buscar_secciones_peticion(String aABuscar) {
		
		Seccion[] devolver = null;
		
		try {
			System.out.println("Cuantas secciones? ");
				
			devolver= SeccionDAO.listSeccionByQuery("Titulo LIKE '%"+aABuscar+"%'", "Fecha_creacion");

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return devolver;
		
		
	}

	public void CrearSeccion(Seccion aSeccionEntrada) {
		
		
		try {
			SeccionDAO.save(aSeccionEntrada);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	public Seccion[] buscar_secciones_foro() {
		throw new UnsupportedOperationException();
	}
	
	public Seccion[] ordenar_secciones_antiguedad() {
		
		Seccion[] devolver = null;
		
		try {


			devolver= SeccionDAO.listSeccionByQuery("Id_seccion LIKE '%'", "Fecha_creacion");
			System.out.println("Dsitacia de cosas"+ devolver.length );
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return devolver;
		
		
	}
	
}