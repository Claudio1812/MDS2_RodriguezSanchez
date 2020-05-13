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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SECCION_TEMA_HIJO) {
			this.tema_hijo = (paquete1.Tema) owner;
		}
		
		else if (key == ORMConstants.KEY_SECCION_CREADA_POR) {
			this.creada_por = (paquete1.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
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
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioId_usuario2", referencedColumnName="UsuarioId_usuario") }, foreignKey=@ForeignKey(name="FKSeccion300294"))	
	private paquete1.Administrador creada_por;
	
	@OneToOne(targetEntity=paquete1.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TemaId_tema2", referencedColumnName="Id_tema", nullable=false) }, foreignKey=@ForeignKey(name="FKSeccion720311"))	
	private paquete1.Tema tema_hijo;
	
	@Column(name="Fecha_creacion", nullable=true, length=255)	
	private String fecha_creacion;
	
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
	
	public void setTema_hijo(paquete1.Tema value) {
		if (this.tema_hijo != value) {
			paquete1.Tema ltema_hijo = this.tema_hijo;
			this.tema_hijo = value;
			if (value != null) {
				tema_hijo.setSeccion_padre(this);
			}
			if (ltema_hijo != null && ltema_hijo.getSeccion_padre() == this) {
				ltema_hijo.setSeccion_padre(null);
			}
		}
	}
	
	public paquete1.Tema getTema_hijo() {
		return tema_hijo;
	}
	
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
	
	public String toString() {
		return String.valueOf(getId_seccion());
	}
	
}
