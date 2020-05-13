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
	public final IntegerExpression tema_propietarioId;
	public final AssociationExpression tema_propietario;
	public final IntegerExpression seccion_padreId;
	public final AssociationExpression seccion_padre;
	public final StringExpression descripcion;
	public final StringExpression fecha_creacion;
	public final IntegerExpression me_gusta;
	public final IntegerExpression participantes;
	public final CollectionExpression publico;
	public final CollectionExpression tema_contiene;
	public final CollectionExpression oculto;
	public final CollectionExpression privado;
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		id_tema = new IntegerExpression("id_tema", this);
		tema_propietarioId = new IntegerExpression("tema_propietario.id_usuario", this);
		tema_propietario = new AssociationExpression("tema_propietario", this);
		seccion_padreId = new IntegerExpression("seccion_padre.id_tema", this);
		seccion_padre = new AssociationExpression("seccion_padre", this);
		descripcion = new StringExpression("descripcion", this);
		fecha_creacion = new StringExpression("fecha_creacion", this);
		me_gusta = new IntegerExpression("me_gusta", this);
		participantes = new IntegerExpression("participantes", this);
		publico = new CollectionExpression("ORM_publico", this);
		tema_contiene = new CollectionExpression("ORM_tema_contiene", this);
		oculto = new CollectionExpression("ORM_oculto", this);
		privado = new CollectionExpression("ORM_privado", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(BasededatosPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createTema_propietarioCriteria() {
		return new UsuarioCriteria(createCriteria("tema_propietario"));
	}
	
	public SeccionCriteria createSeccion_padreCriteria() {
		return new SeccionCriteria(createCriteria("seccion_padre"));
	}
	
	public TemaCriteria createPublicoCriteria() {
		return new TemaCriteria(createCriteria("ORM_publico"));
	}
	
	public MensajeCriteria createTema_contieneCriteria() {
		return new MensajeCriteria(createCriteria("ORM_tema_contiene"));
	}
	
	public TemaCriteria createOcultoCriteria() {
		return new TemaCriteria(createCriteria("ORM_oculto"));
	}
	
	public TemaCriteria createPrivadoCriteria() {
		return new TemaCriteria(createCriteria("ORM_privado"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

