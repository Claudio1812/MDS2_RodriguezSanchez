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
@Table(name="Nota")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Nota")
public class Nota implements Serializable {
	public Nota() {
	}
	
	@Column(name="Id_nota", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAQUETE1_NOTA_ID_NOTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAQUETE1_NOTA_ID_NOTA_GENERATOR", strategy="native")	
	private int id_nota;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String Titulo;
	
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
		this.Titulo = value;
	}
	
	public String getTitulo() {
		return Titulo;
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
	
	public String toString() {
		return String.valueOf(getId_nota());
	}
	
}
