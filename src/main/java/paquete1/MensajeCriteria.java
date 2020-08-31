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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_mensaje;
	public final IntegerExpression respuesta_deId;
	public final AssociationExpression respuesta_de;
	public final IntegerExpression esta_enId;
	public final AssociationExpression esta_en;
	public final IntegerExpression mensaje_escrito_porId;
	public final AssociationExpression mensaje_escrito_por;
	public final StringExpression cuerpo;
	public final IntegerExpression me_gusta;
	public final StringExpression titulo;
	public final CollectionExpression respondido_por;
	public final CollectionExpression referenciado_por;
	public final CollectionExpression gustado_por;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		id_mensaje = new IntegerExpression("id_mensaje", this);
		respuesta_deId = new IntegerExpression("respuesta_de.id_mensaje", this);
		respuesta_de = new AssociationExpression("respuesta_de", this);
		esta_enId = new IntegerExpression("esta_en.id_tema", this);
		esta_en = new AssociationExpression("esta_en", this);
		mensaje_escrito_porId = new IntegerExpression("mensaje_escrito_por.id_usuario", this);
		mensaje_escrito_por = new AssociationExpression("mensaje_escrito_por", this);
		cuerpo = new StringExpression("cuerpo", this);
		me_gusta = new IntegerExpression("me_gusta", this);
		titulo = new StringExpression("titulo", this);
		respondido_por = new CollectionExpression("ORM_respondido_por", this);
		referenciado_por = new CollectionExpression("ORM_referenciado_por", this);
		gustado_por = new CollectionExpression("ORM_gustado_por", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createRespuesta_deCriteria() {
		return new MensajeCriteria(createCriteria("respuesta_de"));
	}
	
	public TemaCriteria createEsta_enCriteria() {
		return new TemaCriteria(createCriteria("esta_en"));
	}
	
	public UsuarioCriteria createMensaje_escrito_porCriteria() {
		return new UsuarioCriteria(createCriteria("mensaje_escrito_por"));
	}
	
	public MensajeCriteria createRespondido_porCriteria() {
		return new MensajeCriteria(createCriteria("ORM_respondido_por"));
	}
	
	public NotificacionCriteria createReferenciado_porCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_referenciado_por"));
	}
	
	public UsuarioCriteria createGustado_porCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_gustado_por"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

