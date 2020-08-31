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

public class VideoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_media;
	public final StringExpression nombre;
	public final StringExpression tamaño;
	public final StringExpression formato;
	
	public VideoDetachedCriteria() {
		super(paquete1.Video.class, paquete1.VideoCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tamaño = new StringExpression("tamaño", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
	}
	
	public VideoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.VideoCriteria.class);
		id_media = new IntegerExpression("id_media", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tamaño = new StringExpression("tamaño", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
	}
	
	public Video uniqueVideo(PersistentSession session) {
		return (Video) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Video[] listVideo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Video[]) list.toArray(new Video[list.size()]);
	}
}

