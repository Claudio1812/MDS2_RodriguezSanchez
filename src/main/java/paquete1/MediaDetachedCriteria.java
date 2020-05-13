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

public class MediaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_media;
	public final StringExpression nombre;
	public final StringExpression tamaño;
	public final StringExpression formato;
	
	public MediaDetachedCriteria() {
		super(paquete1.Media.class, paquete1.MediaCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tamaño = new StringExpression("tamaño", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
	}
	
	public MediaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.MediaCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tamaño = new StringExpression("tamaño", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
	}
	
	public Media uniqueMedia(PersistentSession session) {
		return (Media) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Media[] listMedia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Media[]) list.toArray(new Media[list.size()]);
	}
}

