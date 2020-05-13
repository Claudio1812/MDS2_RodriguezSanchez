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

public class NotaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_nota;
	public final StringExpression Titulo;
	public final StringExpression cuerpo;
	public final StringExpression motivo;
	
	public NotaCriteria(Criteria criteria) {
		super(criteria);
		id_nota = new IntegerExpression("id_nota", this);
		Titulo = new StringExpression("Titulo", this);
		cuerpo = new StringExpression("cuerpo", this);
		motivo = new StringExpression("motivo", this);
	}
	
	public NotaCriteria(PersistentSession session) {
		this(session.createCriteria(Nota.class));
	}
	
	public NotaCriteria() throws PersistentException {
		this(BasededatosPersistentManager.instance().getSession());
	}
	
	public Nota uniqueNota() {
		return (Nota) super.uniqueResult();
	}
	
	public Nota[] listNota() {
		java.util.List list = super.list();
		return (Nota[]) list.toArray(new Nota[list.size()]);
	}
}

