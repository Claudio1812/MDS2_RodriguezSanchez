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
	public final IntegerExpression mensaje_propietarioId;
	public final AssociationExpression mensaje_propietario;
	public final IntegerExpression mensaje_tiene_videoId;
	public final AssociationExpression mensaje_tiene_video;
	public final IntegerExpression tema_perteneceId;
	public final AssociationExpression tema_pertenece;
	public final StringExpression cuerpo;
	public final IntegerExpression me_gusta;
	public final CollectionExpression Respuesta_de;
	public final CollectionExpression es_gustado;
	
	public MensajeDetachedCriteria() {
		super(paquete1.Mensaje.class, paquete1.MensajeCriteria.class);
		id_mensaje = new IntegerExpression("id_mensaje", this.getDetachedCriteria());
		mensaje_propietarioId = new IntegerExpression("mensaje_propietario.id_usuario", this.getDetachedCriteria());
		mensaje_propietario = new AssociationExpression("mensaje_propietario", this.getDetachedCriteria());
		mensaje_tiene_videoId = new IntegerExpression("mensaje_tiene_video.", this.getDetachedCriteria());
		mensaje_tiene_video = new AssociationExpression("mensaje_tiene_video", this.getDetachedCriteria());
		tema_perteneceId = new IntegerExpression("tema_pertenece.id_tema", this.getDetachedCriteria());
		tema_pertenece = new AssociationExpression("tema_pertenece", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		Respuesta_de = new CollectionExpression("ORM_respuesta_de", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, paquete1.MensajeCriteria.class);
		id_mensaje = new IntegerExpression("id_mensaje", this.getDetachedCriteria());
		mensaje_propietarioId = new IntegerExpression("mensaje_propietario.id_usuario", this.getDetachedCriteria());
		mensaje_propietario = new AssociationExpression("mensaje_propietario", this.getDetachedCriteria());
		mensaje_tiene_videoId = new IntegerExpression("mensaje_tiene_video.", this.getDetachedCriteria());
		mensaje_tiene_video = new AssociationExpression("mensaje_tiene_video", this.getDetachedCriteria());
		tema_perteneceId = new IntegerExpression("tema_pertenece.id_tema", this.getDetachedCriteria());
		tema_pertenece = new AssociationExpression("tema_pertenece", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		me_gusta = new IntegerExpression("me_gusta", this.getDetachedCriteria());
		Respuesta_de = new CollectionExpression("ORM_respuesta_de", this.getDetachedCriteria());
		es_gustado = new CollectionExpression("ORM_es_gustado", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createMensaje_propietarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("mensaje_propietario"));
	}
	
	public VideoDetachedCriteria createMensaje_tiene_videoCriteria() {
		return new VideoDetachedCriteria(createCriteria("mensaje_tiene_video"));
	}
	
	public TemaDetachedCriteria createTema_perteneceCriteria() {
		return new TemaDetachedCriteria(createCriteria("tema_pertenece"));
	}
	
	public MensajeDetachedCriteria createRespuesta_deCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_respuesta_de"));
	}
	
	public UsuarioDetachedCriteria createEs_gustadoCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_es_gustado"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

