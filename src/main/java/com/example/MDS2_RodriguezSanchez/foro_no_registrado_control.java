package com.example.MDS2_RodriguezSanchez;

import javax.swing.text.View;

import com.vaadin.navigator.Navigator;

public class foro_no_registrado_control extends foro_no_registrado_ventana {

	/**
	 * 
	 */
	Navigator viaje;
	public foro_no_registrado_control() {
		
		
	}
	
	public void setNavigator(Navigator nav) {
		this.viaje=nav;

	}
	
	public void iniciar() {
		this.iniciar_sesion.addClickListener(e->{
			
			logearse_control log=new logearse_control();
			this.viaje.addView("Login",log);
			log.viaje=this.viaje;
			log.viaje.navigateTo("Login");
			
		});
	}
	
	private static final long serialVersionUID = 1L;

}
