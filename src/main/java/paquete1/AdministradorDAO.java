/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Claudio(University of Almeria)
 * License Type: Academic
 */
package paquete1;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AdministradorDAO {
	public static Administrador loadAdministradorByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return getAdministradorByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return getAdministradorByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Administrador) session.load(paquete1.Administrador.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Administrador) session.get(paquete1.Administrador.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.load(paquete1.Administrador.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.get(paquete1.Administrador.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador createAdministrador() {
		return new paquete1.Administrador();
	}
	
	public static boolean save(paquete1.Administrador administrador) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().saveObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(paquete1.Administrador administrador) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().deleteObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(paquete1.Administrador administrador)throws PersistentException {
		try {
			paquete1.Usuario[] lAdministras = administrador.administra.toArray();
			for(int i = 0; i < lAdministras.length; i++) {
				lAdministras[i].administrado.remove(administrador);
			}
			paquete1.Usuario[] lBaneas = administrador.banea.toArray();
			for(int i = 0; i < lBaneas.length; i++) {
				lBaneas[i].setBaneado_por(null);
			}
			paquete1.Seccion[] lCrea_seccions = administrador.crea_seccion.toArray();
			for(int i = 0; i < lCrea_seccions.length; i++) {
				lCrea_seccions[i].setCreada_por(null);
			}
			paquete1.Moderador[] lDa_permisoss = administrador.da_permisos.toArray();
			for(int i = 0; i < lDa_permisoss.length; i++) {
				lDa_permisoss[i].setRecibe_permisos(null);
			}
			if (administrador.getBaneado_por() != null) {
				administrador.getBaneado_por().banea.remove(administrador);
			}
			
			paquete1.Usuario[] lMistad_cons = administrador.mistad_con.toArray();
			for(int i = 0; i < lMistad_cons.length; i++) {
				lMistad_cons[i].amigo_de.remove(administrador);
			}
			paquete1.Moderador[] lEs_moderados = administrador.es_moderado.toArray();
			for(int i = 0; i < lEs_moderados.length; i++) {
				lEs_moderados[i].modera.remove(administrador);
			}
			paquete1.Administrador[] lAdministrados = administrador.administrado.toArray();
			for(int i = 0; i < lAdministrados.length; i++) {
				lAdministrados[i].administra.remove(administrador);
			}
			paquete1.Tema[] lUsuario_crea_temas = administrador.usuario_crea_tema.toArray();
			for(int i = 0; i < lUsuario_crea_temas.length; i++) {
				lUsuario_crea_temas[i].setCreador_tema(null);
			}
			paquete1.Mensaje[] lUsuario_escribes = administrador.usuario_escribe.toArray();
			for(int i = 0; i < lUsuario_escribes.length; i++) {
				lUsuario_escribes[i].setMensaje_escrito_por(null);
			}
			paquete1.Mensaje[] lLe_gustas = administrador.le_gusta.toArray();
			for(int i = 0; i < lLe_gustas.length; i++) {
				lLe_gustas[i].gustado_por.remove(administrador);
			}
			paquete1.Usuario[] lAmigo_des = administrador.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].mistad_con.remove(administrador);
			}
			paquete1.Notificacion[] lPuede_teners = administrador.puede_tener.toArray();
			for(int i = 0; i < lPuede_teners.length; i++) {
				lPuede_teners[i].setPertenece_a(null);
			}
			return delete(administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(paquete1.Administrador administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			paquete1.Usuario[] lAdministras = administrador.administra.toArray();
			for(int i = 0; i < lAdministras.length; i++) {
				lAdministras[i].administrado.remove(administrador);
			}
			paquete1.Usuario[] lBaneas = administrador.banea.toArray();
			for(int i = 0; i < lBaneas.length; i++) {
				lBaneas[i].setBaneado_por(null);
			}
			paquete1.Seccion[] lCrea_seccions = administrador.crea_seccion.toArray();
			for(int i = 0; i < lCrea_seccions.length; i++) {
				lCrea_seccions[i].setCreada_por(null);
			}
			paquete1.Moderador[] lDa_permisoss = administrador.da_permisos.toArray();
			for(int i = 0; i < lDa_permisoss.length; i++) {
				lDa_permisoss[i].setRecibe_permisos(null);
			}
			if (administrador.getBaneado_por() != null) {
				administrador.getBaneado_por().banea.remove(administrador);
			}
			
			paquete1.Usuario[] lMistad_cons = administrador.mistad_con.toArray();
			for(int i = 0; i < lMistad_cons.length; i++) {
				lMistad_cons[i].amigo_de.remove(administrador);
			}
			paquete1.Moderador[] lEs_moderados = administrador.es_moderado.toArray();
			for(int i = 0; i < lEs_moderados.length; i++) {
				lEs_moderados[i].modera.remove(administrador);
			}
			paquete1.Administrador[] lAdministrados = administrador.administrado.toArray();
			for(int i = 0; i < lAdministrados.length; i++) {
				lAdministrados[i].administra.remove(administrador);
			}
			paquete1.Tema[] lUsuario_crea_temas = administrador.usuario_crea_tema.toArray();
			for(int i = 0; i < lUsuario_crea_temas.length; i++) {
				lUsuario_crea_temas[i].setCreador_tema(null);
			}
			paquete1.Mensaje[] lUsuario_escribes = administrador.usuario_escribe.toArray();
			for(int i = 0; i < lUsuario_escribes.length; i++) {
				lUsuario_escribes[i].setMensaje_escrito_por(null);
			}
			paquete1.Mensaje[] lLe_gustas = administrador.le_gusta.toArray();
			for(int i = 0; i < lLe_gustas.length; i++) {
				lLe_gustas[i].gustado_por.remove(administrador);
			}
			paquete1.Usuario[] lAmigo_des = administrador.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].mistad_con.remove(administrador);
			}
			paquete1.Notificacion[] lPuede_teners = administrador.puede_tener.toArray();
			for(int i = 0; i < lPuede_teners.length; i++) {
				lPuede_teners[i].setPertenece_a(null);
			}
			try {
				session.delete(administrador);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(paquete1.Administrador administrador) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().getSession().refresh(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(paquete1.Administrador administrador) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().getSession().evict(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		Administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static Administrador[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
