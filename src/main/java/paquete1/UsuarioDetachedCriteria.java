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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_usuario;
	public final IntegerExpression baneado_porId;
	public final AssociationExpression baneado_por;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression email;
	public final StringExpression contrasena;
	public final CollectionExpression mistad_con;
	public final CollectionExpression es_moderado;
	public final CollectionExpression administrado;
	public final CollectionExpression usuario_crea_tema;
	public final CollectionExpression usuario_escribe;
	public final CollectionExpression le_gusta;
	public final CollectionExpression amigo_de;
	public final CollectionExpression puede_tener;
	
	public UsuarioDetachedCriteria() {
		super(paquete1.Usuario.class, paquete1.UsuarioCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		baneado_porId = new IntegerExpression("baneado_por.", this.getDetachedCriteria());
		baneado_por = new AssociationExpression("baneado_por", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		mistad_con = new CollectionExpression("ORM_mistad_con", this.getDetachedCriteria());
		es_moderado = new CollectionExpression("ORM_es_moderado", this.getDetachedCriteria());
		administrado = new CollectionExpression("ORM_administrado", this.getDetachedCriteria());
		usuario_crea_tema = new CollectionExpression("ORM_usuario_crea_tema", this.getDetachedCriteria());
		usuario_escribe = new CollectionExpression("ORM_usuario_escribe", this.getDetachedCriteria());
		le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		puede_tener = new CollectionExpression("ORM_puede_tener", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.UsuarioCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		baneado_porId = new IntegerExpression("baneado_por.", this.getDetachedCriteria());
		baneado_por = new AssociationExpression("baneado_por", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		mistad_con = new CollectionExpression("ORM_mistad_con", this.getDetachedCriteria());
		es_moderado = new CollectionExpression("ORM_es_moderado", this.getDetachedCriteria());
		administrado = new CollectionExpression("ORM_administrado", this.getDetachedCriteria());
		usuario_crea_tema = new CollectionExpression("ORM_usuario_crea_tema", this.getDetachedCriteria());
		usuario_escribe = new CollectionExpression("ORM_usuario_escribe", this.getDetachedCriteria());
		le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		puede_tener = new CollectionExpression("ORM_puede_tener", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createBaneado_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("baneado_por"));
	}
	
	public UsuarioDetachedCriteria createMistad_conCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_mistad_con"));
	}
	
	public ModeradorDetachedCriteria createEs_moderadoCriteria() {
		return new ModeradorDetachedCriteria(createCriteria("ORM_es_moderado"));
	}
	
	public AdministradorDetachedCriteria createAdministradoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("ORM_administrado"));
	}
	
	public TemaDetachedCriteria createUsuario_crea_temaCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_usuario_crea_tema"));
	}
	
	public MensajeDetachedCriteria createUsuario_escribeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_usuario_escribe"));
	}
	
	public MensajeDetachedCriteria createLe_gustaCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public UsuarioDetachedCriteria createAmigo_deCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public NotificacionDetachedCriteria createPuede_tenerCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_puede_tener"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

