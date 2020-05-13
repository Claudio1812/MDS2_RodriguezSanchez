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
@Table(name="Media")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Media")
public class Media implements Serializable {
	public Media() {
	}
	
	@Column(name="Id_media", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_MEDIA_ID_MEDIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_MEDIA_ID_MEDIA_GENERATOR", strategy="native")	
	private int id_media;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Tamaño", nullable=true, length=255)	
	private String tamaño;
	
	@Column(name="Formato", nullable=true, length=255)	
	private String formato;
	
	private void setId_media(int value) {
		this.id_media = value;
	}
	
	public int getId_media() {
		return id_media;
	}
	
	public int getORMID() {
		return getId_media();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setTamaño(String value) {
		this.tamaño = value;
	}
	
	public String getTamaño() {
		return tamaño;
	}
	
	public void setFormato(String value) {
		this.formato = value;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public String toString() {
		return String.valueOf(getId_media());
	}
	
}
