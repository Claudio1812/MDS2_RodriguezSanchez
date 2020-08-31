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
@Table(name="Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SECCION_CONTIENE_) {
			return ORM_contiene_;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SECCION_CREADA_POR) {
			this.creada_por = (paquete1.Administrador) owner;
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
	
	@Column(name="Id_seccion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_SECCION_ID_SECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_SECCION_ID_SECCION_GENERATOR", strategy="native")	
	private int id_seccion;
	
	@ManyToOne(targetEntity=paquete1.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="admin_creador", referencedColumnName="UsuarioId_usuario") }, foreignKey=@ForeignKey(name="relacion_seccion_admin_crear"))	
	private paquete1.Administrador creada_por;
	
	@Column(name="Fecha_creacion", nullable=true, length=255)	
	private String fecha_creacion;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String Titulo;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String Descripcion;
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=paquete1.Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_ = new java.util.HashSet();
	
	private void setId_seccion(int value) {
		this.id_seccion = value;
	}
	
	public int getId_seccion() {
		return id_seccion;
	}
	
	public int getORMID() {
		return getId_seccion();
	}
	
	public void setFecha_creacion(String value) {
		this.fecha_creacion = value;
	}
	
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	
	public void setTitulo(String value) {
		this.Titulo = value;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setDescripcion(String value) {
		this.Descripcion = value;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	
	private void setORM_Contiene_(java.util.Set value) {
		this.ORM_contiene_ = value;
	}
	
	private java.util.Set getORM_Contiene_() {
		return ORM_contiene_;
	}
	
	@Transient	
	public final paquete1.TemaSetCollection contiene_ = new paquete1.TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_SECCION_CONTIENE_, ORMConstants.KEY_TEMA_PERTENECE_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCreada_por(paquete1.Administrador value) {
		if (creada_por != null) {
			creada_por.crea_seccion.remove(this);
		}
		if (value != null) {
			value.crea_seccion.add(this);
		}
	}
	
	public paquete1.Administrador getCreada_por() {
		return creada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creada_por(paquete1.Administrador value) {
		this.creada_por = value;
	}
	
	private paquete1.Administrador getORM_Creada_por() {
		return creada_por;
	}
	
	public void EliminarSeccion(int int_Seccion) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId_seccion());
	}
	
}
