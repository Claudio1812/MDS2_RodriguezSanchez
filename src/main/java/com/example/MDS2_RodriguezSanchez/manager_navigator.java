package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.NavigationStateManager;
import com.vaadin.navigator.Navigator;

public class manager_navigator implements NavigationStateManager {

	String cadena;
	
	public manager_navigator(String entrada) {
		this.cadena=entrada;
	}
	
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return cadena;
	}

	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub
		this.cadena=this.cadena+"/"+state;
		
	}

	@Override
	public void setNavigator(Navigator navigator) {
		// TODO Auto-generated method stub
		
	}

}
