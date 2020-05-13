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
@Table(name="Foto")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Foto")
@PrimaryKeyJoinColumn(name="MediaId_media", referencedColumnName="Id_media")
public class Foto extends paquete1.Media implements Serializable {
	public Foto() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
