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

public class ModeradorCriteria extends AbstractORMCriteria {
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
	public final CollectionExpression modera;
	public final IntegerExpression recibe_permisosId;
	public final AssociationExpression recibe_permisos;
	
	public ModeradorCriteria(Criteria criteria) {
		super(criteria);
		id_usuario = new IntegerExpression("id_usuario", this);
		baneado_porId = new IntegerExpression("baneado_por.", this);
		baneado_por = new AssociationExpression("baneado_por", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		email = new StringExpression("email", this);
		contrasena = new StringExpression("contrasena", this);
		mistad_con = new CollectionExpression("ORM_mistad_con", this);
		es_moderado = new CollectionExpression("ORM_es_moderado", this);
		administrado = new CollectionExpression("ORM_administrado", this);
		usuario_crea_tema = new CollectionExpression("ORM_usuario_crea_tema", this);
		usuario_escribe = new CollectionExpression("ORM_usuario_escribe", this);
		le_gusta = new CollectionExpression("ORM_le_gusta", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		puede_tener = new CollectionExpression("ORM_puede_tener", this);
		modera = new CollectionExpression("ORM_modera", this);
		recibe_permisosId = new IntegerExpression("recibe_permisos.", this);
		recibe_permisos = new AssociationExpression("recibe_permisos", this);
	}
	
	public ModeradorCriteria(PersistentSession session) {
		this(session.createCriteria(Moderador.class));
	}
	
	public ModeradorCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createModeraCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_modera"));
	}
	
	public AdministradorCriteria createRecibe_permisosCriteria() {
		return new AdministradorCriteria(createCriteria("recibe_permisos"));
	}
	
	public AdministradorCriteria createBaneado_porCriteria() {
		return new AdministradorCriteria(createCriteria("baneado_por"));
	}
	
	public UsuarioCriteria createMistad_conCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_mistad_con"));
	}
	
	public ModeradorCriteria createEs_moderadoCriteria() {
		return new ModeradorCriteria(createCriteria("ORM_es_moderado"));
	}
	
	public AdministradorCriteria createAdministradoCriteria() {
		return new AdministradorCriteria(createCriteria("ORM_administrado"));
	}
	
	public TemaCriteria createUsuario_crea_temaCriteria() {
		return new TemaCriteria(createCriteria("ORM_usuario_crea_tema"));
	}
	
	public MensajeCriteria createUsuario_escribeCriteria() {
		return new MensajeCriteria(createCriteria("ORM_usuario_escribe"));
	}
	
	public MensajeCriteria createLe_gustaCriteria() {
		return new MensajeCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public UsuarioCriteria createAmigo_deCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public NotificacionCriteria createPuede_tenerCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_puede_tener"));
	}
	
	public Moderador uniqueModerador() {
		return (Moderador) super.uniqueResult();
	}
	
	public Moderador[] listModerador() {
		java.util.List list = super.list();
		return (Moderador[]) list.toArray(new Moderador[list.size()]);
	}
}

