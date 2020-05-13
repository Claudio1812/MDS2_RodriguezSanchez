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

public class VideoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_media;
	public final StringExpression nombre;
	public final StringExpression tamaño;
	public final StringExpression formato;
	public final IntegerExpression mensaje_contenedor_videoId;
	public final AssociationExpression mensaje_contenedor_video;
	
	public VideoCriteria(Criteria criteria) {
		super(criteria);
		id_media = new IntegerExpression("id_media", this);
		nombre = new StringExpression("nombre", this);
		tamaño = new StringExpression("tamaño", this);
		formato = new StringExpression("formato", this);
		mensaje_contenedor_videoId = new IntegerExpression("mensaje_contenedor_video.", this);
		mensaje_contenedor_video = new AssociationExpression("mensaje_contenedor_video", this);
	}
	
	public VideoCriteria(PersistentSession session) {
		this(session.createCriteria(Video.class));
	}
	
	public VideoCriteria() throws PersistentException {
		this(BasededatosPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createMensaje_contenedor_videoCriteria() {
		return new MensajeCriteria(createCriteria("mensaje_contenedor_video"));
	}
	
	public Video uniqueVideo() {
		return (Video) super.uniqueResult();
	}
	
	public Video[] listVideo() {
		java.util.List list = super.list();
		return (Video[]) list.toArray(new Video[list.size()]);
	}
}

