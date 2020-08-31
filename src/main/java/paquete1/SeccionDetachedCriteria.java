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

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression creada_porId;
	public final AssociationExpression creada_por;
	public final StringExpression fecha_creacion;
	public final StringExpression Titulo;
	public final StringExpression Descripcion;
	public final CollectionExpression contiene_;
	
	public SeccionDetachedCriteria() {
		super(paquete1.Seccion.class, paquete1.SeccionCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		creada_porId = new IntegerExpression("creada_por.", this.getDetachedCriteria());
		creada_por = new AssociationExpression("creada_por", this.getDetachedCriteria());
		fecha_creacion = new StringExpression("fecha_creacion", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		Descripcion = new StringExpression("Descripcion", this.getDetachedCriteria());
		contiene_ = new CollectionExpression("ORM_contiene_", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.SeccionCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		creada_porId = new IntegerExpression("creada_por.", this.getDetachedCriteria());
		creada_por = new AssociationExpression("creada_por", this.getDetachedCriteria());
		fecha_creacion = new StringExpression("fecha_creacion", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		Descripcion = new StringExpression("Descripcion", this.getDetachedCriteria());
		contiene_ = new CollectionExpression("ORM_contiene_", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createCreada_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("creada_por"));
	}
	
	public TemaDetachedCriteria createContiene_Criteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_contiene_"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

