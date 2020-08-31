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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_nota;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression referencia_aId;
	public final AssociationExpression referencia_a;
	public final StringExpression titulo;
	public final StringExpression cuerpo;
	public final StringExpression motivo;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		id_nota = new IntegerExpression("id_nota", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id_usuario", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		referencia_aId = new IntegerExpression("referencia_a.id_mensaje", this);
		referencia_a = new AssociationExpression("referencia_a", this);
		titulo = new StringExpression("titulo", this);
		cuerpo = new StringExpression("cuerpo", this);
		motivo = new StringExpression("motivo", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createPertenece_aCriteria() {
		return new UsuarioCriteria(createCriteria("pertenece_a"));
	}
	
	public MensajeCriteria createReferencia_aCriteria() {
		return new MensajeCriteria(createCriteria("referencia_a"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

