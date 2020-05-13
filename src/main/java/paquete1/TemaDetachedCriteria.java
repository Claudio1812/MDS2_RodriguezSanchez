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
	
	public TemaDetachedCriteria() {
		super(paquete1.Tema.class, paquete1.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		tema_propietarioId = new IntegerExpression("tema_propietario.id_usuario", this.getDetachedCriteria());
		tema_propietario = new AssociationExpression("tema_propietario", this.getDetachedCriteria());
		seccion_padreId = new IntegerExpression("seccion_padre.id_tema", this.getDetachedCriteria());
		seccion_padre = new AssociationExpression("seccion_padre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha_creacion = new StringExpression("fecha_creacion", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		participantes = new IntegerExpression("participantes", this.getDetachedCriteria());
		publico = new CollectionExpression("ORM_publico", this.getDetachedCriteria());
		tema_contiene = new CollectionExpression("ORM_tema_contiene", this.getDetachedCriteria());
		oculto = new CollectionExpression("ORM_oculto", this.getDetachedCriteria());
		privado = new CollectionExpression("ORM_privado", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.TemaCriteria.class);
		id_tema = new IntegerExpression("id_tema", this.getDetachedCriteria());
		tema_propietarioId = new IntegerExpression("tema_propietario.id_usuario", this.getDetachedCriteria());
		tema_propietario = new AssociationExpression("tema_propietario", this.getDetachedCriteria());
		seccion_padreId = new IntegerExpression("seccion_padre.id_tema", this.getDetachedCriteria());
		seccion_padre = new AssociationExpression("seccion_padre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fecha_creacion = new StringExpression("fecha_creacion", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		participantes = new IntegerExpression("participantes", this.getDetachedCriteria());
		publico = new CollectionExpression("ORM_publico", this.getDetachedCriteria());
		tema_contiene = new CollectionExpression("ORM_tema_contiene", this.getDetachedCriteria());
		oculto = new CollectionExpression("ORM_oculto", this.getDetachedCriteria());
		privado = new CollectionExpression("ORM_privado", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createTema_propietarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("tema_propietario"));
	}
	
	public SeccionDetachedCriteria createSeccion_padreCriteria() {
		return new SeccionDetachedCriteria(createCriteria("seccion_padre"));
	}
	
	public TemaDetachedCriteria createPublicoCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_publico"));
	}
	
	public MensajeDetachedCriteria createTema_contieneCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_tema_contiene"));
	}
	
	public TemaDetachedCriteria createOcultoCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_oculto"));
	}
	
	public TemaDetachedCriteria createPrivadoCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_privado"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

