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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_RESPUESTA_DE) {
			return ORM_respuesta_de;
		}
		else if (key == ORMConstants.KEY_MENSAJE_ES_GUSTADO) {
			return ORM_es_gustado;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_TEMA_PERTENECE) {
			this.tema_pertenece = (paquete1.Tema) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_TIENE_VIDEO) {
			this.mensaje_tiene_video = (paquete1.Video) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_PROPIETARIO) {
			this.mensaje_propietario = (paquete1.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_mensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_MENSAJE_ID_MENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_MENSAJE_ID_MENSAJE_GENERATOR", strategy="native")	
	private int id_mensaje;
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKMensaje97513"))	
	private paquete1.Usuario mensaje_propietario;
	
	@OneToOne(optional=false, targetEntity=paquete1.Video.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VideoMediaId_media", referencedColumnName="MediaId_media", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje19308"))	
	private paquete1.Video mensaje_tiene_video;
	
	@ManyToOne(targetEntity=paquete1.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaId_tema", referencedColumnName="Id_tema", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje657495"))	
	private paquete1.Tema tema_pertenece;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String cuerpo;
	
	@Column(name="Me_gusta", nullable=true, length=10)	
	private int me_gusta;
	
	@OneToMany(targetEntity=paquete1.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MensajeId_mensaje", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respuesta_de = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_gustado = new java.util.HashSet();
	
	private void setId_mensaje(int value) {
		this.id_mensaje = value;
	}
	
	public int getId_mensaje() {
		return id_mensaje;
	}
	
	public int getORMID() {
		return getId_mensaje();
	}
	
	public void setCuerpo(String value) {
		this.cuerpo = value;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setMe_gusta(int value) {
		this.me_gusta = value;
	}
	
	public int getMe_gusta() {
		return me_gusta;
	}
	
	public void setTema_pertenece(paquete1.Tema value) {
		if (tema_pertenece != null) {
			tema_pertenece.tema_contiene.remove(this);
		}
		if (value != null) {
			value.tema_contiene.add(this);
		}
	}
	
	public paquete1.Tema getTema_pertenece() {
		return tema_pertenece;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tema_pertenece(paquete1.Tema value) {
		this.tema_pertenece = value;
	}
	
	private paquete1.Tema getORM_Tema_pertenece() {
		return tema_pertenece;
	}
	
	public void setMensaje_tiene_video(paquete1.Video value) {
		if (this.mensaje_tiene_video != value) {
			paquete1.Video lmensaje_tiene_video = this.mensaje_tiene_video;
			this.mensaje_tiene_video = value;
			if (value != null) {
				mensaje_tiene_video.setMensaje_contenedor_video(this);
			}
			if (lmensaje_tiene_video != null && lmensaje_tiene_video.getMensaje_contenedor_video() == this) {
				lmensaje_tiene_video.setMensaje_contenedor_video(null);
			}
		}
	}
	
	public paquete1.Video getMensaje_tiene_video() {
		return mensaje_tiene_video;
	}
	
	private void setORM_Respuesta_de(java.util.Set value) {
		this.ORM_respuesta_de = value;
	}
	
	private java.util.Set getORM_Respuesta_de() {
		return ORM_respuesta_de;
	}
	
	@Transient	
	public final paquete1.MensajeSetCollection respuesta_de = new paquete1.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPUESTA_DE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMensaje_propietario(paquete1.Usuario value) {
		if (mensaje_propietario != null) {
			mensaje_propietario.usuario_a_escrito.remove(this);
		}
		if (value != null) {
			value.usuario_a_escrito.add(this);
		}
	}
	
	public paquete1.Usuario getMensaje_propietario() {
		return mensaje_propietario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_propietario(paquete1.Usuario value) {
		this.mensaje_propietario = value;
	}
	
	private paquete1.Usuario getORM_Mensaje_propietario() {
		return mensaje_propietario;
	}
	
	private void setORM_Es_gustado(java.util.Set value) {
		this.ORM_es_gustado = value;
	}
	
	private java.util.Set getORM_Es_gustado() {
		return ORM_es_gustado;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection es_gustado = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_ES_GUSTADO, ORMConstants.KEY_USUARIO_LE_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void subirMedia() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId_mensaje());
	}
	
}
