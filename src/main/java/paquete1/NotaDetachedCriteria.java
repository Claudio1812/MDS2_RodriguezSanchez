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

public class NotaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_nota;
	public final StringExpression Titulo;
	public final StringExpression cuerpo;
	public final StringExpression motivo;
	
	public NotaDetachedCriteria() {
		super(paquete1.Nota.class, paquete1.NotaCriteria.class);
		id_nota = new IntegerExpression("id_nota", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public NotaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.NotaCriteria.class);
		id_nota = new IntegerExpression("id_nota", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public Nota uniqueNota(PersistentSession session) {
		return (Nota) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Nota[] listNota(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Nota[]) list.toArray(new Nota[list.size()]);
	}
}

