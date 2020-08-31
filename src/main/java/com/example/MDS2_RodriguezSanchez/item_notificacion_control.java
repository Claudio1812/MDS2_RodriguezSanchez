package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.Bd_main;
import paquete1.Notificacion;
import paquete1.Usuario;

public class item_notificacion_control extends  item_notifiacion_ventana implements View{

	
	private Label titulo_notificacion_control;
	private Label usuario_creador_control;
	private Label tipo_notificaciones_control, cuerpoNotificacion_control;
	private Button atender_Notificacion_control;
	private Button eliminar_notificacion_control;
	private Navigator viaje;
	private Usuario logeado;
	private item_notificacion_control selfNotificacion;
		private Notificacion referenciaNotificacion;
	
	item_notificacion_control(Usuario logeadoEntrada, Navigator viajeEntrada, Notificacion notificacion){
		
		this.viaje=viajeEntrada;
		this.logeado=logeadoEntrada;
		this.referenciaNotificacion=notificacion;
		this.titulo_notificacion_control=this.tipo_notificaciones;
		this.usuario_creador_control=this.usuario_creador;
		this.tipo_notificaciones_control=this.tipo_notificaciones;
		this.atender_Notificacion_control=this.atender_Notificacion;
		this.eliminar_notificacion_control=this.eliminar_notificacion;
		this.cuerpoNotificacion_control=this.cuerpo_notificacion;
		this.usuario_creador_control.setValue(notificacion.getPertenece_a().getNombre());
		this.titulo_notificacion_control.setValue(notificacion.getTitulo());
		this.tipo_notificaciones_control.setValue(notificacion.getMotivo());
		
		selfNotificacion=this;
		cuerpoNotificacion_control.setValue(notificacion.getCuerpo());
		
		eliminar_notificacion_control.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {

				archivarNotificacion();
				

			}

			
		});
		
		
		
		atender_Notificacion_control.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {

				
				
			}
		});
		
	}
	
	private void Atender_notificacion() {

		Bd_main principal=new Bd_main();
		Usuario enviantePeticion=new Usuario();
		if(referenciaNotificacion.getMotivo().equals("Amistad")) {
			
			enviantePeticion=principal.CargarPerfilUsuario(Integer.valueOf(referenciaNotificacion.getCuerpo()));
			
			principal.AgregarNuevo_Amigo(enviantePeticion, logeado);
			principal.AgregarNuevo_Amigo(logeado, enviantePeticion);
			
			
			principal.archivarNotificacion(referenciaNotificacion);
			selfNotificacion.setVisible(false);
			
		}
		
	}
	
	private void archivarNotificacion() {
		// TODO Auto-generated method stub
		Bd_main principal=new Bd_main();
		
		principal.archivarNotificacion(referenciaNotificacion);
		selfNotificacion.setVisible(false);
	}
	
	
}
