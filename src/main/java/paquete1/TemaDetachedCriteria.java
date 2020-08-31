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

public class TemaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_tema;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final IntegerExpression creador_temaId;
	public final AssociationExpression creador_tema;
	public final StringExpression descripcion;
	public final StringExpression fecha_creacion;
	public final IntegerExpression me_gusta;
	public final IntegerExpression participantes;
	public final StringExpression titulo;
	public final CollectionExpression tema_tiene_men;
	
	public TemaDetachedCriteria() {
		super(paquete1.Tema.class, paquete1.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id_seccion", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		creador_temaId = new IntegerExpression("creador_tema.id_usuario", this.getDetachedCriteria());
		creador_tema = new AssociationExpression("creador_tema", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha_creacion = new StringExpression("fecha_creacion", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		participantes = new IntegerExpression("participantes", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		tema_tiene_men = new CollectionExpression("ORM_tema_tiene_men", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.id_seccion", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		creador_temaId = new IntegerExpression("creador_tema.id_usuario", this.getDetachedCriteria());
		creador_tema = new AssociationExpression("creador_tema", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha_creacion = new StringExpression("fecha_creacion", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		participantes = new IntegerExpression("participantes", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		tema_tiene_men = new CollectionExpression("ORM_tema_tiene_men", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria createPertenece_aCriteria() {
		return new SeccionDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public UsuarioDetachedCriteria createCreador_temaCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("creador_tema"));
	}
	
	public MensajeDetachedCriteria createTema_tiene_menCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_tema_tiene_men"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

