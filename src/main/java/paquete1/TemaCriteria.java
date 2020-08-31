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

public class TemaCriteria extends AbstractORMCriteria {
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
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		id_tema = new IntegerExpression("id_tema", this);
		pertenece_aId = new IntegerExpression("pertenece_a.id_seccion", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		creador_temaId = new IntegerExpression("creador_tema.id_usuario", this);
		creador_tema = new AssociationExpression("creador_tema", this);
		descripcion = new StringExpression("descripcion", this);
		fecha_creacion = new StringExpression("fecha_creacion", this);
		me_gusta = new IntegerExpression("me_gusta", this);
		participantes = new IntegerExpression("participantes", this);
		titulo = new StringExpression("titulo", this);
		tema_tiene_men = new CollectionExpression("ORM_tema_tiene_men", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(ClasesIUPersistentManager.instance().getSession());
	}
	
	public SeccionCriteria createPertenece_aCriteria() {
		return new SeccionCriteria(createCriteria("pertenece_a"));
	}
	
	public UsuarioCriteria createCreador_temaCriteria() {
		return new UsuarioCriteria(createCriteria("creador_tema"));
	}
	
	public MensajeCriteria createTema_tiene_menCriteria() {
		return new MensajeCriteria(createCriteria("ORM_tema_tiene_men"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

