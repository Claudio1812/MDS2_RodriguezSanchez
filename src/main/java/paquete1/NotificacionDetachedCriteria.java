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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_nota;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression referencia_aId;
	public final AssociationExpression referencia_a;
	public final StringExpression titulo;
	public final StringExpression cuerpo;
	public final StringExpression motivo;
	
	public NotificacionDetachedCriteria() {
		super(paquete1.Notificacion.class, paquete1.NotificacionCriteria.class);
		id_nota = new IntegerExpression("id_nota", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id_usuario", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		referencia_aId = new IntegerExpression("referencia_a.id_mensaje", this.getDetachedCriteria());
		referencia_a = new AssociationExpression("referencia_a", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.NotificacionCriteria.class);
		id_nota = new IntegerExpression("id_nota", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id_usuario", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		referencia_aId = new IntegerExpression("referencia_a.id_mensaje", this.getDetachedCriteria());
		referencia_a = new AssociationExpression("referencia_a", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createPertenece_aCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public MensajeDetachedCriteria createReferencia_aCriteria() {
		return new MensajeDetachedCriteria(createCriteria("referencia_a"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

