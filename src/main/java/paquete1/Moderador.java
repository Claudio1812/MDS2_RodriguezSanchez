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
@Table(name="Moderador")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Moderador")
@PrimaryKeyJoinColumn(name="UsuarioId_usuario", referencedColumnName="Id_usuario")
public class Moderador extends paquete1.Usuario implements Serializable {
	public Moderador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MODERADOR_MODERA) {
			return ORM_modera;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MODERADOR_RECIBE_PERMISOS) {
			this.recibe_permisos = (paquete1.Administrador) owner;
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
	
	@ManyToMany(mappedBy="ORM_es_moderado", targetEntity=paquete1.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_modera = new java.util.HashSet();
	
	@ManyToOne(targetEntity=paquete1.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioId_usuario", referencedColumnName="UsuarioId_usuario") }, foreignKey=@ForeignKey(name="FKModerador214593"))	
	private paquete1.Administrador recibe_permisos;
	
	public void setRecibe_permisos(paquete1.Administrador value) {
		if (recibe_permisos != null) {
			recibe_permisos.da_permisos.remove(this);
		}
		if (value != null) {
			value.da_permisos.add(this);
		}
	}
	
	public paquete1.Administrador getRecibe_permisos() {
		return recibe_permisos;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Recibe_permisos(paquete1.Administrador value) {
		this.recibe_permisos = value;
	}
	
	private paquete1.Administrador getORM_Recibe_permisos() {
		return recibe_permisos;
	}
	
	private void setORM_Modera(java.util.Set value) {
		this.ORM_modera = value;
	}
	
	private java.util.Set getORM_Modera() {
		return ORM_modera;
	}
	
	@Transient	
	public final paquete1.UsuarioSetCollection modera = new paquete1.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_MODERADOR_MODERA, ORMConstants.KEY_USUARIO_ES_MODERADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
