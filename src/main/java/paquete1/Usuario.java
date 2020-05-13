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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_ES_MODERADO) {
			return ORM_es_moderado;
		}
		else if (key == ORMConstants.KEY_USUARIO_ADMINISTRADO) {
			return ORM_administrado;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIO_A_ESCRITO) {
			return ORM_usuario_a_escrito;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIO_TIENE_NOTIFICACION) {
			return ORM_usuario_tiene_notificacion;
		}
		else if (key == ORMConstants.KEY_USUARIO_LE_GUSTA) {
			return ORM_le_gusta;
		}
		else if (key == ORMConstants.KEY_USUARIO_AMIGO_DE) {
			return ORM_amigo_de;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIO_CREA_MENSAJE) {
			return ORM_usuario_crea_mensaje;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO__) {
			this._ = (paquete1.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_BANEADO_POR) {
			this.baneado_por = (paquete1.Administrador) owner;
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
	
	@Column(name="Id_usuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_USUARIO_ID_USUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_USUARIO_ID_USUARIO_GENERATOR", strategy="native")	
	private int id_usuario;
	
	@ManyToMany(targetEntity=paquete1.Administrador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Administrador_Usuario2", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="AdministradorUsuarioId_usuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_administrado = new java.util.HashSet();
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKUsuario250901"))	
	private paquete1.Usuario _;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@ManyToMany(targetEntity=paquete1.Moderador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Moderador_Usuario2", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="ModeradorUsuarioId_usuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_moderado = new java.util.HashSet();
	
	@OneToMany(mappedBy="mensaje_propietario", targetEntity=paquete1.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario_a_escrito = new java.util.HashSet();
	
	@OneToMany(mappedBy="notificacion_propietario", targetEntity=paquete1.Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario_tiene_notificacion = new java.util.HashSet();
	
	@ManyToMany(targetEntity=paquete1.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Mensaje_Usuario2", joinColumns={ @JoinColumn(name="UsuarioId_usuario") }, inverseJoinColumns={ @JoinColumn(name="MensajeId_mensaje") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta = new java.util.HashSet();
	
	@OneToMany(mappedBy="_", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo_de = new java.util.HashSet();
	
	@ManyToOne(targetEntity=paquete1.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioId_usuario", referencedColumnName="UsuarioId_usuario") }, foreignKey=@ForeignKey(name="FKUsuario346868"))	
	private paquete1.Administrador baneado_por;
	
	@OneToMany(mappedBy="tema_propietario", targetEntity=paquete1.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario_crea_mensaje = new java.util.HashSet();
	
	private void setId_usuario(int value) {
		this.id_usuario = value;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public int getORMID() {
		return getId_usuario();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	private void setORM_Es_moderado(java.util.Set value) {
		this.ORM_es_moderado = value;
	}
	
	private java.util.Set getORM_Es_moderado() {
		return ORM_es_moderado;
	}
	
	@Transient	
	public final paquete1.ModeradorSetCollection es_moderado = new paquete1.ModeradorSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ES_MODERADO, ORMConstants.KEY_MODERADOR_MODERA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Administrado(java.util.Set value) {
		this.ORM_administrado = value;
	}
	
	private java.util.Set getORM_Administrado() {
		return ORM_administrado;
	}
	
	@Transient	
	public final paquete1.AdministradorSetCollection administrado = new paquete1.AdministradorSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ADMINISTRADO, ORMConstants.KEY_ADMINISTRADOR_ADMINISTRA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Usuario_a_escrito(java.util.Set value) {
		this.ORM_usuario_a_escrito = value;
	}
	
	private java.util.Set getORM_Usuario_a_escrito() {
		return ORM_usuario_a_escrito;
	}
	
	@Transient	
	public final paquete1.MensajeSetCollection usuario_a_escrito = new paquete1.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIO_A_ESCRITO, ORMConstants.KEY_MENSAJE_MENSAJE_PROPIETARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void set_(paquete1.Usuario value) {
		if (_ != null) {
			_.amigo_de.remove(this);
		}
		if (value != null) {
			value.amigo_de.add(this);
		}
	}
	
	public paquete1.Usuario get_() {
		return _;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__(paquete1.Usuario value) {
		this._ = value;
	}
	
	private paquete1.Usuario getORM__() {
		return _;
	}
	
	private void setORM_Usuario_tiene_notificacion(java.util.Set value) {
		this.ORM_usuario_tiene_notificacion = value;
	}
	
	private java.util.Set getORM_Usuario_tiene_notificacion() {
		return ORM_usuario_tiene_notificacion;
	}
	
	@Transient	
	public final paquete1.NotificacionSetCollection usuario_tiene_notificacion = new paquete1.NotificacionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIO_TIENE_NOTIFICACION, ORMConstants.KEY_NOTIFICACION_NOTIFICACION_PROPIETARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Le_gusta(java.util.Set value) {
		this.ORM_le_gusta = value;
	}
	
	private java.util.Set getORM_Le_gusta() {
		return ORM_le_gusta;
	}
	
	@Transient	
	public final paquete1.MensajeSetCollection le_gusta = new paquete1.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_LE_GUSTA, ORMConstants.KEY_MENSAJE_ES_GUSTADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Amigo_de(java.util.Set value) {
		this.ORM_amigo_de = value;
	}
	
	private java.util.Set getORM_Amigo_de() {
		return ORM_amigo_de;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection amigo_de = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_AMIGO_DE, ORMConstants.KEY_USUARIO__, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setBaneado_por(paquete1.Administrador value) {
		if (baneado_por != null) {
			baneado_por.banea.remove(this);
		}
		if (value != null) {
			value.banea.add(this);
		}
	}
	
	public paquete1.Administrador getBaneado_por() {
		return baneado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Baneado_por(paquete1.Administrador value) {
		this.baneado_por = value;
	}
	
	private paquete1.Administrador getORM_Baneado_por() {
		return baneado_por;
	}
	
	private void setORM_Usuario_crea_mensaje(java.util.Set value) {
		this.ORM_usuario_crea_mensaje = value;
	}
	
	private java.util.Set getORM_Usuario_crea_mensaje() {
		return ORM_usuario_crea_mensaje;
	}
	
	@Transient	
	public final paquete1.TemaSetCollection usuario_crea_mensaje = new paquete1.TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIO_CREA_MENSAJE, ORMConstants.KEY_TEMA_TEMA_PROPIETARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_usuario());
	}
	
}
