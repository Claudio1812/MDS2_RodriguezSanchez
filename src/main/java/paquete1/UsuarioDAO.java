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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Usuario) session.load(paquete1.Usuario.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Usuario) session.get(paquete1.Usuario.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(paquete1.Usuario.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(paquete1.Usuario.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasesIUPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From paquete1.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new paquete1.Usuario();
	}
	
	public static boolean save(paquete1.Usuario usuario) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(paquete1.Usuario usuario) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(paquete1.Usuario usuario)throws PersistentException {
		if (usuario instanceof paquete1.Moderador) {
			return paquete1.ModeradorDAO.deleteAndDissociate((paquete1.Moderador) usuario);
		}
		
		if (usuario instanceof paquete1.Administrador) {
			return paquete1.AdministradorDAO.deleteAndDissociate((paquete1.Administrador) usuario);
		}
		
		try {
			if (usuario.getBaneado_por() != null) {
				usuario.getBaneado_por().banea.remove(usuario);
			}
			
			paquete1.Usuario[] lMistad_cons = usuario.mistad_con.toArray();
			for(int i = 0; i < lMistad_cons.length; i++) {
				lMistad_cons[i].amigo_de.remove(usuario);
			}
			paquete1.Moderador[] lEs_moderados = usuario.es_moderado.toArray();
			for(int i = 0; i < lEs_moderados.length; i++) {
				lEs_moderados[i].modera.remove(usuario);
			}
			paquete1.Administrador[] lAdministrados = usuario.administrado.toArray();
			for(int i = 0; i < lAdministrados.length; i++) {
				lAdministrados[i].administra.remove(usuario);
			}
			paquete1.Tema[] lUsuario_crea_temas = usuario.usuario_crea_tema.toArray();
			for(int i = 0; i < lUsuario_crea_temas.length; i++) {
				lUsuario_crea_temas[i].setCreador_tema(null);
			}
			paquete1.Mensaje[] lUsuario_escribes = usuario.usuario_escribe.toArray();
			for(int i = 0; i < lUsuario_escribes.length; i++) {
				lUsuario_escribes[i].setMensaje_escrito_por(null);
			}
			paquete1.Mensaje[] lLe_gustas = usuario.le_gusta.toArray();
			for(int i = 0; i < lLe_gustas.length; i++) {
				lLe_gustas[i].gustado_por.remove(usuario);
			}
			paquete1.Usuario[] lAmigo_des = usuario.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].mistad_con.remove(usuario);
			}
			paquete1.Notificacion[] lPuede_teners = usuario.puede_tener.toArray();
			for(int i = 0; i < lPuede_teners.length; i++) {
				lPuede_teners[i].setPertenece_a(null);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(paquete1.Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		if (usuario instanceof paquete1.Moderador) {
			return paquete1.ModeradorDAO.deleteAndDissociate((paquete1.Moderador) usuario, session);
		}
		
		if (usuario instanceof paquete1.Administrador) {
			return paquete1.AdministradorDAO.deleteAndDissociate((paquete1.Administrador) usuario, session);
		}
		
		try {
			if (usuario.getBaneado_por() != null) {
				usuario.getBaneado_por().banea.remove(usuario);
			}
			
			paquete1.Usuario[] lMistad_cons = usuario.mistad_con.toArray();
			for(int i = 0; i < lMistad_cons.length; i++) {
				lMistad_cons[i].amigo_de.remove(usuario);
			}
			paquete1.Moderador[] lEs_moderados = usuario.es_moderado.toArray();
			for(int i = 0; i < lEs_moderados.length; i++) {
				lEs_moderados[i].modera.remove(usuario);
			}
			paquete1.Administrador[] lAdministrados = usuario.administrado.toArray();
			for(int i = 0; i < lAdministrados.length; i++) {
				lAdministrados[i].administra.remove(usuario);
			}
			paquete1.Tema[] lUsuario_crea_temas = usuario.usuario_crea_tema.toArray();
			for(int i = 0; i < lUsuario_crea_temas.length; i++) {
				lUsuario_crea_temas[i].setCreador_tema(null);
			}
			paquete1.Mensaje[] lUsuario_escribes = usuario.usuario_escribe.toArray();
			for(int i = 0; i < lUsuario_escribes.length; i++) {
				lUsuario_escribes[i].setMensaje_escrito_por(null);
			}
			paquete1.Mensaje[] lLe_gustas = usuario.le_gusta.toArray();
			for(int i = 0; i < lLe_gustas.length; i++) {
				lLe_gustas[i].gustado_por.remove(usuario);
			}
			paquete1.Usuario[] lAmigo_des = usuario.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].mistad_con.remove(usuario);
			}
			paquete1.Notificacion[] lPuede_teners = usuario.puede_tener.toArray();
			for(int i = 0; i < lPuede_teners.length; i++) {
				lPuede_teners[i].setPertenece_a(null);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(paquete1.Usuario usuario) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(paquete1.Usuario usuario) throws PersistentException {
		try {
			ClasesIUPersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
