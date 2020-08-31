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

public class MediaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_media;
	public final StringExpression nombre;
	public final StringExpression tamaño;
	public final StringExpression formato;
	
	public MediaCriteria(Criteria criteria) {
		super(criteria);
		id_media = new IntegerExpression("id_media", this);
		nombre = new StringExpression("nombre", this);
		tamaño = new StringExpression("tamaño", this);
		formato = new StringExpression("formato", this);
	}
	
	public MediaCriteria(PersistentSession session) {
		this(session.createCriteria(Media.class));
	}
	
	public MediaCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public Media uniqueMedia() {
		return (Media) super.uniqueResult();
	}
	
	public Media[] listMedia() {
		java.util.List list = super.list();
		return (Media[]) list.toArray(new Media[list.size()]);
	}
}

