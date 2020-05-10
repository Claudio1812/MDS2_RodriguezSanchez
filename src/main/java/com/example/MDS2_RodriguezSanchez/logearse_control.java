package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;

public class logearse_control extends Logearse_ventana implements View {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Navigator viaje;
	
	public logearse_control() {
		
	}
	
	public void setNavigator(Navigator nav) {
		this.viaje=nav;
	}
	
}
