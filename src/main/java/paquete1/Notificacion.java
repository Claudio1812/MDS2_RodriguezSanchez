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
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTIFICACION_PERTENECE_A) {
			this.pertenece_a = (paquete1.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTIFICACION_REFERENCIA_A) {
			this.referencia_a = (paquete1.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_nota", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_NOTIFICACION_ID_NOTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_NOTIFICACION_ID_NOTA_GENERATOR", strategy="native")	
	private int id_nota;
	
	@ManyToOne(targetEntity=paquete1.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="usuario_propietario", referencedColumnName="Id_usuario") }, foreignKey=@ForeignKey(name="FKNotificaci833069"))	
	private paquete1.Usuario pertenece_a;
	
	@ManyToOne(targetEntity=paquete1.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="mensaje_referencia", referencedColumnName="Id_mensaje") }, foreignKey=@ForeignKey(name="FKNotificaci406426"))	
	private paquete1.Mensaje referencia_a;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String cuerpo;
	
	@Column(name="Motivo", nullable=true, length=255)	
	private String motivo;
	
	private void setId_nota(int value) {
		this.id_nota = value;
	}
	
	public int getId_nota() {
		return id_nota;
	}
	
	public int getORMID() {
		return getId_nota();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setCuerpo(String value) {
		this.cuerpo = value;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setMotivo(String value) {
		this.motivo = value;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setPertenece_a(paquete1.Usuario value) {
		if (pertenece_a != null) {
			pertenece_a.puede_tener.remove(this);
		}
		if (value != null) {
			value.puede_tener.add(this);
		}
	}
	
	public paquete1.Usuario getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(paquete1.Usuario value) {
		this.pertenece_a = value;
	}
	
	private paquete1.Usuario getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	public void setReferencia_a(paquete1.Mensaje value) {
		if (referencia_a != null) {
			referencia_a.referenciado_por.remove(this);
		}
		if (value != null) {
			value.referenciado_por.add(this);
		}
	}
	
	public paquete1.Mensaje getReferencia_a() {
		return referencia_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Referencia_a(paquete1.Mensaje value) {
		this.referencia_a = value;
	}
	
	private paquete1.Mensaje getORM_Referencia_a() {
		return referencia_a;
	}
	
	public String toString() {
		return String.valueOf(getId_nota());
	}
	
}
