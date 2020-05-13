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
	public final StringExpression Titulo;
	public final StringExpression cuerpo;
	public final StringExpression motivo;
	public final IntegerExpression notificacion_propietarioId;
	public final AssociationExpression notificacion_propietario;
	
	public NotificacionDetachedCriteria() {
		super(paquete1.Notificacion.class, paquete1.NotificacionCriteria.class);
		id_nota = new IntegerExpression("id_nota", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
		notificacion_propietarioId = new IntegerExpression("notificacion_propietario.id_usuario", this.getDetachedCriteria());
		notificacion_propietario = new AssociationExpression("notificacion_propietario", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.NotificacionCriteria.class);
		id_nota = new IntegerExpression("id_nota", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
		notificacion_propietarioId = new IntegerExpression("notificacion_propietario.id_usuario", this.getDetachedCriteria());
		notificacion_propietario = new AssociationExpression("notificacion_propietario", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createNotificacion_propietarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("notificacion_propietario"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

