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
@Table(name="Video")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Video")
@PrimaryKeyJoinColumn(name="MediaId_media", referencedColumnName="Id_media")
public class Video extends paquete1.Media implements Serializable {
	public Video() {
	}
	
	@OneToOne(mappedBy="mensaje_tiene_video", targetEntity=paquete1.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private paquete1.Mensaje mensaje_contenedor_video;
	
	public void setMensaje_contenedor_video(paquete1.Mensaje value) {
		if (this.mensaje_contenedor_video != value) {
			paquete1.Mensaje lmensaje_contenedor_video = this.mensaje_contenedor_video;
			this.mensaje_contenedor_video = value;
			if (value != null) {
				mensaje_contenedor_video.setMensaje_tiene_video(this);
			}
			if (lmensaje_contenedor_video != null && lmensaje_contenedor_video.getMensaje_tiene_video() == this) {
				lmensaje_contenedor_video.setMensaje_tiene_video(null);
			}
		}
	}
	
	public paquete1.Mensaje getMensaje_contenedor_video() {
		return mensaje_contenedor_video;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
