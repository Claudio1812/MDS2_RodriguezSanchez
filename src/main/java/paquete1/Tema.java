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
@Table(name="Tema")
public class Tema implements Serializable {
	public Tema() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEMA_TEMA_TIENE_MEN) {
			return ORM_tema_tiene_men;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEMA_PERTENECE_A) {
			this.pertenece_a = (paquete1.Seccion) owner;
		}
		
		else if (key == ORMConstants.KEY_TEMA_CREADOR_TEMA) {
			this.creador_tema = (paquete1.Usuario) owner;
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
	
	@Column(name="Id_tema", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_TEMA_ID_TEMA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_TEMA_ID_TEMA_GENERATOR", strategy="native")	
	private int id_tema;
	
	@ManyToOne(targetEntity=paquete1.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="seccion_padre", referencedColumnName="Id_seccion", nullable=false) }, foreignKey=@ForeignKey(name="FKTema457492"))	
	private paquete1.Seccion pertenece_a;
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="usuario_creador", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKTema41406"))	
	private paquete1.Usuario creador_tema;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Fecha_creacion", nullable=true, length=255)	
	private String fecha_creacion;
	
	@Column(name="Me_gusta", nullable=false, length=10)	
	private int me_gusta;
	
	@Column(name="Participantes", nullable=false, length=10)	
	private int participantes;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@OneToMany(mappedBy="esta_en", targetEntity=paquete1.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tema_tiene_men = new java.util.HashSet();
	
	private void setId_tema(int value) {
		this.id_tema = value;
	}
	
	public int getId_tema() {
		return id_tema;
	}
	
	public int getORMID() {
		return getId_tema();
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFecha_creacion(String value) {
		this.fecha_creacion = value;
	}
	
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	
	public void setMe_gusta(int value) {
		this.me_gusta = value;
	}
	
	public int getMe_gusta() {
		return me_gusta;
	}
	
	public void setParticipantes(int value) {
		this.participantes = value;
	}
	
	public int getParticipantes() {
		return participantes;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setPertenece_a(paquete1.Seccion value) {
		if (pertenece_a != null) {
			pertenece_a.contiene_.remove(this);
		}
		if (value != null) {
			value.contiene_.add(this);
		}
	}
	
	public paquete1.Seccion getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(paquete1.Seccion value) {
		this.pertenece_a = value;
	}
	
	private paquete1.Seccion getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	public void setCreador_tema(paquete1.Usuario value) {
		if (creador_tema != null) {
			creador_tema.usuario_crea_tema.remove(this);
		}
		if (value != null) {
			value.usuario_crea_tema.add(this);
		}
	}
	
	public paquete1.Usuario getCreador_tema() {
		return creador_tema;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creador_tema(paquete1.Usuario value) {
		this.creador_tema = value;
	}
	
	private paquete1.Usuario getORM_Creador_tema() {
		return creador_tema;
	}
	
	private void setORM_Tema_tiene_men(java.util.Set value) {
		this.ORM_tema_tiene_men = value;
	}
	
	private java.util.Set getORM_Tema_tiene_men() {
		return ORM_tema_tiene_men;
	}
	
	@Transient	
	public final paquete1.MensajeSetCollection tema_tiene_men = new paquete1.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMA_TEMA_TIENE_MEN, ORMConstants.KEY_MENSAJE_ESTA_EN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_tema());
	}
	
}
