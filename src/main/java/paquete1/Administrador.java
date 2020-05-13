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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Administrador")
@PrimaryKeyJoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario")
public class Administrador extends paquete1.Usuario implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_BANEA) {
			return ORM_banea;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_CREA_SECCION) {
			return ORM_crea_seccion;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_ADMINISTRA) {
			return ORM_administra;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_DA_PERMISOS) {
			return ORM_da_permisos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(mappedBy="ORM_administrado", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_administra = new java.util.HashSet();
	
	@OneToMany(mappedBy="baneado_por", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_banea = new java.util.HashSet();
	
	@OneToMany(mappedBy="creada_por", targetEntity=paquete1.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_seccion = new java.util.HashSet();
	
	@OneToMany(mappedBy="recibe_permisos", targetEntity=paquete1.Moderador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_permisos = new java.util.HashSet();
	
	private void setORM_Banea(java.util.Set value) {
		this.ORM_banea = value;
	}
	
	private java.util.Set getORM_Banea() {
		return ORM_banea;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection banea = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_BANEA, ORMConstants.KEY_USUARIO_BANEADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Crea_seccion(java.util.Set value) {
		this.ORM_crea_seccion = value;
	}
	
	private java.util.Set getORM_Crea_seccion() {
		return ORM_crea_seccion;
	}
	
	@Transient	
	public final paquete1.SeccionSetCollection crea_seccion = new paquete1.SeccionSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_CREA_SECCION, ORMConstants.KEY_SECCION_CREADA_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Administra(java.util.Set value) {
		this.ORM_administra = value;
	}
	
	private java.util.Set getORM_Administra() {
		return ORM_administra;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection administra = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_ADMINISTRA, ORMConstants.KEY_USUARIO_ADMINISTRADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Da_permisos(java.util.Set value) {
		this.ORM_da_permisos = value;
	}
	
	private java.util.Set getORM_Da_permisos() {
		return ORM_da_permisos;
	}
	
	@Transient	
	public final paquete1.ModeradorSetCollection da_permisos = new paquete1.ModeradorSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_DA_PERMISOS, ORMConstants.KEY_MODERADOR_RECIBE_PERMISOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
