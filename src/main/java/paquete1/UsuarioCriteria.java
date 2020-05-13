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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_usuario;
	public final CollectionExpression administrado;
	public final IntegerExpression _Id;
	public final AssociationExpression _;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression email;
	public final StringExpression contrasena;
	public final CollectionExpression es_moderado;
	public final CollectionExpression usuario_a_escrito;
	public final CollectionExpression usuario_tiene_notificacion;
	public final CollectionExpression le_gusta;
	public final CollectionExpression amigo_de;
	public final IntegerExpression baneado_porId;
	public final AssociationExpression baneado_por;
	public final CollectionExpression usuario_crea_mensaje;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		administrado = new CollectionExpression("ORM_administrado", this);
		_Id = new IntegerExpression("_.id_usuario", this);
		_ = new AssociationExpression("_", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		email = new StringExpression("email", this);
		contrasena = new StringExpression("contrasena", this);
		es_moderado = new CollectionExpression("ORM_es_moderado", this);
		usuario_a_escrito = new CollectionExpression("ORM_usuario_a_escrito", this);
		usuario_tiene_notificacion = new CollectionExpression("ORM_usuario_tiene_notificacion", this);
		le_gusta = new CollectionExpression("ORM_le_gusta", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		baneado_porId = new IntegerExpression("baneado_por.", this);
		baneado_por = new AssociationExpression("baneado_por", this);
		usuario_crea_mensaje = new CollectionExpression("ORM_usuario_crea_mensaje", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(BasededatosPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradoCriteria() {
		return new AdministradorCriteria(createCriteria("ORM_administrado"));
	}
	
	public UsuarioCriteria create_Criteria() {
		return new UsuarioCriteria(createCriteria("_"));
	}
	
	public ModeradorCriteria createEs_moderadoCriteria() {
		return new ModeradorCriteria(createCriteria("ORM_es_moderado"));
	}
	
	public MensajeCriteria createUsuario_a_escritoCriteria() {
		return new MensajeCriteria(createCriteria("ORM_usuario_a_escrito"));
	}
	
	public NotificacionCriteria createUsuario_tiene_notificacionCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_usuario_tiene_notificacion"));
	}
	
	public MensajeCriteria createLe_gustaCriteria() {
		return new MensajeCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public UsuarioCriteria createAmigo_deCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public AdministradorCriteria createBaneado_porCriteria() {
		return new AdministradorCriteria(createCriteria("baneado_por"));
	}
	
	public TemaCriteria createUsuario_crea_mensajeCriteria() {
		return new TemaCriteria(createCriteria("ORM_usuario_crea_mensaje"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

