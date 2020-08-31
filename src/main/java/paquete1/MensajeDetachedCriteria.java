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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_mensaje;
	public final IntegerExpression respuesta_deId;
	public final AssociationExpression respuesta_de;
	public final IntegerExpression esta_enId;
	public final AssociationExpression esta_en;
	public final IntegerExpression mensaje_escrito_porId;
	public final AssociationExpression mensaje_escrito_por;
	public final StringExpression cuerpo;
	public final IntegerExpression me_gusta;
	public final StringExpression titulo;
	public final CollectionExpression respondido_por;
	public final CollectionExpression referenciado_por;
	public final CollectionExpression gustado_por;
	
	public MensajeDetachedCriteria() {
		super(paquete1.Mensaje.class, paquete1.MensajeCriteria.class);
		id_mensaje = new IntegerExpression("id_mensaje", this.getDetachedCriteria());
		respuesta_deId = new IntegerExpression("respuesta_de.id_mensaje", this.getDetachedCriteria());
		respuesta_de = new AssociationExpression("respuesta_de", this.getDetachedCriteria());
		esta_enId = new IntegerExpression("esta_en.id_tema", this.getDetachedCriteria());
		esta_en = new AssociationExpression("esta_en", this.getDetachedCriteria());
		mensaje_escrito_porId = new IntegerExpression("mensaje_escrito_por.id_usuario", this.getDetachedCriteria());
		mensaje_escrito_por = new AssociationExpression("mensaje_escrito_por", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		respondido_por = new CollectionExpression("ORM_respondido_por", this.getDetachedCriteria());
		referenciado_por = new CollectionExpression("ORM_referenciado_por", this.getDetachedCriteria());
		gustado_por = new CollectionExpression("ORM_gustado_por", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.MensajeCriteria.class);
		id_mensaje = new IntegerExpression("id_mensaje", this.getDetachedCriteria());
		respuesta_deId = new IntegerExpression("respuesta_de.id_mensaje", this.getDetachedCriteria());
		respuesta_de = new AssociationExpression("respuesta_de", this.getDetachedCriteria());
		esta_enId = new IntegerExpression("esta_en.id_tema", this.getDetachedCriteria());
		esta_en = new AssociationExpression("esta_en", this.getDetachedCriteria());
		mensaje_escrito_porId = new IntegerExpression("mensaje_escrito_por.id_usuario", this.getDetachedCriteria());
		mensaje_escrito_por = new AssociationExpression("mensaje_escrito_por", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		respondido_por = new CollectionExpression("ORM_respondido_por", this.getDetachedCriteria());
		referenciado_por = new CollectionExpression("ORM_referenciado_por", this.getDetachedCriteria());
		gustado_por = new CollectionExpression("ORM_gustado_por", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createRespuesta_deCriteria() {
		return new MensajeDetachedCriteria(createCriteria("respuesta_de"));
	}
	
	public TemaDetachedCriteria createEsta_enCriteria() {
		return new TemaDetachedCriteria(createCriteria("esta_en"));
	}
	
	public UsuarioDetachedCriteria createMensaje_escrito_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("mensaje_escrito_por"));
	}
	
	public MensajeDetachedCriteria createRespondido_porCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_respondido_por"));
	}
	
	public NotificacionDetachedCriteria createReferenciado_porCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_referenciado_por"));
	}
	
	public UsuarioDetachedCriteria createGustado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_gustado_por"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

