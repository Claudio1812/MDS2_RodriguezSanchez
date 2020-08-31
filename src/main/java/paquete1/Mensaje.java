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
		if (key == ORMConstants.KEY_MENSAJE_RESPONDIDO_POR) {
			return ORM_respondido_por;
		}
		else if (key == ORMConstants.KEY_MENSAJE_REFERENCIADO_POR) {
			return ORM_referenciado_por;
		}
		else if (key == ORMConstants.KEY_MENSAJE_GUSTADO_POR) {
			return ORM_gustado_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_ESTA_EN) {
			this.esta_en = (paquete1.Tema) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_ESCRITO_POR) {
			this.mensaje_escrito_por = (paquete1.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_RESPUESTA_DE) {
			this.respuesta_de = (paquete1.Mensaje) owner;
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
	
	
	//En todos estos ponia Cascade type LOCK
	//org.hibernate.annotations.CascadeType.LOCK
	//
	//
	
	@ManyToOne(targetEntity=paquete1.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="respuesta_de", referencedColumnName="Id_mensaje") }, foreignKey=@ForeignKey(name="FKMensaje900990"))	
	private paquete1.Mensaje respuesta_de;
	
	@ManyToOne(targetEntity=paquete1.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="tema_padre", referencedColumnName="Id_tema", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje442400"))	
	private paquete1.Tema esta_en;
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="usuario_creador", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKMensaje430277"))	
	private paquete1.Usuario mensaje_escrito_por;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String cuerpo;
	
	@Column(name="Me_gusta", nullable=false, length=10)	
	private int me_gusta;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	
	//
	//org.hibernate.annotations.CascadeType.SAVE_UPDATE
	//
	
	@OneToMany(mappedBy="respuesta_de", targetEntity=paquete1.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respondido_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="referencia_a", targetEntity=paquete1.Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_referenciado_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustado_por = new java.util.HashSet();
	
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
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setEsta_en(paquete1.Tema value) {
		if (esta_en != null) {
			esta_en.tema_tiene_men.remove(this);
		}
		if (value != null) {
			value.tema_tiene_men.add(this);
		}
	}
	
	public paquete1.Tema getEsta_en() {
		return esta_en;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_en(paquete1.Tema value) {
		this.esta_en = value;
	}
	
	private paquete1.Tema getORM_Esta_en() {
		return esta_en;
	}
	
	private void setORM_Respondido_por(java.util.Set value) {
		this.ORM_respondido_por = value;
	}
	
	private java.util.Set getORM_Respondido_por() {
		return ORM_respondido_por;
	}
	
	@Transient	
	public final paquete1.MensajeSetCollection respondido_por = new paquete1.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, ORMConstants.KEY_MENSAJE_RESPUESTA_DE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Referenciado_por(java.util.Set value) {
		this.ORM_referenciado_por = value;
	}
	
	private java.util.Set getORM_Referenciado_por() {
		return ORM_referenciado_por;
	}
	
	@Transient	
	public final paquete1.NotificacionSetCollection referenciado_por = new paquete1.NotificacionSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_REFERENCIADO_POR, ORMConstants.KEY_NOTIFICACION_REFERENCIA_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMensaje_escrito_por(paquete1.Usuario value) {
		if (mensaje_escrito_por != null) {
			mensaje_escrito_por.usuario_escribe.remove(this);
		}
		if (value != null) {
			value.usuario_escribe.add(this);
		}
	}
	
	public paquete1.Usuario getMensaje_escrito_por() {
		return mensaje_escrito_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_escrito_por(paquete1.Usuario value) {
		this.mensaje_escrito_por = value;
	}
	
	private paquete1.Usuario getORM_Mensaje_escrito_por() {
		return mensaje_escrito_por;
	}
	
	private void setORM_Gustado_por(java.util.Set value) {
		this.ORM_gustado_por = value;
	}
	
	private java.util.Set getORM_Gustado_por() {
		return ORM_gustado_por;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection gustado_por = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_GUSTADO_POR, ORMConstants.KEY_USUARIO_LE_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setRespuesta_de(paquete1.Mensaje value) {
		if (respuesta_de != null) {
			respuesta_de.respondido_por.remove(this);
		}
		if (value != null) {
			value.respondido_por.add(this);
		}
	}
	
	public paquete1.Mensaje getRespuesta_de() {
		return respuesta_de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Respuesta_de(paquete1.Mensaje value) {
		this.respuesta_de = value;
	}
	
	private paquete1.Mensaje getORM_Respuesta_de() {
		return respuesta_de;
	}
	
	public String toString() {
		return String.valueOf(getId_mensaje());
	}
	
}
