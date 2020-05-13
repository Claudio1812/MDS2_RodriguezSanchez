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

public class ModeradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression modera;
	public final IntegerExpression recibe_permisosId;
	public final AssociationExpression recibe_permisos;
	
	public ModeradorDetachedCriteria() {
		super(paquete1.Moderador.class, paquete1.ModeradorCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		administrado = new CollectionExpression("ORM_administrado", this.getDetachedCriteria());
		_Id = new IntegerExpression("_.id_usuario", this.getDetachedCriteria());
		_ = new AssociationExpression("_", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		es_moderado = new CollectionExpression("ORM_es_moderado", this.getDetachedCriteria());
		usuario_a_escrito = new CollectionExpression("ORM_usuario_a_escrito", this.getDetachedCriteria());
		usuario_tiene_notificacion = new CollectionExpression("ORM_usuario_tiene_notificacion", this.getDetachedCriteria());
		le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		baneado_porId = new IntegerExpression("baneado_por.", this.getDetachedCriteria());
		baneado_por = new AssociationExpression("baneado_por", this.getDetachedCriteria());
		usuario_crea_mensaje = new CollectionExpression("ORM_usuario_crea_mensaje", this.getDetachedCriteria());
		modera = new CollectionExpression("ORM_modera", this.getDetachedCriteria());
		recibe_permisosId = new IntegerExpression("recibe_permisos.", this.getDetachedCriteria());
		recibe_permisos = new AssociationExpression("recibe_permisos", this.getDetachedCriteria());
	}
	
	public ModeradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.ModeradorCriteria.class);
		id_usuario = new IntegerExpression("id_usuario", this.getDetachedCriteria());
		administrado = new CollectionExpression("ORM_administrado", this.getDetachedCriteria());
		_Id = new IntegerExpression("_.id_usuario", this.getDetachedCriteria());
		_ = new AssociationExpression("_", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		es_moderado = new CollectionExpression("ORM_es_moderado", this.getDetachedCriteria());
		usuario_a_escrito = new CollectionExpression("ORM_usuario_a_escrito", this.getDetachedCriteria());
		usuario_tiene_notificacion = new CollectionExpression("ORM_usuario_tiene_notificacion", this.getDetachedCriteria());
		le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		baneado_porId = new IntegerExpression("baneado_por.", this.getDetachedCriteria());
		baneado_por = new AssociationExpression("baneado_por", this.getDetachedCriteria());
		usuario_crea_mensaje = new CollectionExpression("ORM_usuario_crea_mensaje", this.getDetachedCriteria());
		modera = new CollectionExpression("ORM_modera", this.getDetachedCriteria());
		recibe_permisosId = new IntegerExpression("recibe_permisos.", this.getDetachedCriteria());
		recibe_permisos = new AssociationExpression("recibe_permisos", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createModeraCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_modera"));
	}
	
	public AdministradorDetachedCriteria createRecibe_permisosCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("recibe_permisos"));
	}
	
	public AdministradorDetachedCriteria createAdministradoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("ORM_administrado"));
	}
	
	public UsuarioDetachedCriteria create_Criteria() {
		return new UsuarioDetachedCriteria(createCriteria("_"));
	}
	
	public ModeradorDetachedCriteria createEs_moderadoCriteria() {
		return new ModeradorDetachedCriteria(createCriteria("ORM_es_moderado"));
	}
	
	public MensajeDetachedCriteria createUsuario_a_escritoCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_usuario_a_escrito"));
	}
	
	public NotificacionDetachedCriteria createUsuario_tiene_notificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_usuario_tiene_notificacion"));
	}
	
	public MensajeDetachedCriteria createLe_gustaCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public UsuarioDetachedCriteria createAmigo_deCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public AdministradorDetachedCriteria createBaneado_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("baneado_por"));
	}
	
	public TemaDetachedCriteria createUsuario_crea_mensajeCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_usuario_crea_mensaje"));
	}
	
	public Moderador uniqueModerador(PersistentSession session) {
		return (Moderador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Moderador[] listModerador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Moderador[]) list.toArray(new Moderador[list.size()]);
	}
}

