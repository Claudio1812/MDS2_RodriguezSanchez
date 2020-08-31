package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

import paquete1.Bd_main;
import paquete1.Usuario;

public class item_amigo_control extends item_amigo_ventana implements View {
	//Hola
	Label nombre;
	Navigator viaje;
	Usuario itemUser;
	Usuario logeado;
	Panel panelItem; //Para visitar su perfil.
	private Bd_main accesoBD;
	public item_amigo_control(Navigator viaje, Usuario usuarioReferencia, Usuario log, Bd_main entrada) {
		accesoBD=entrada;
		this.viaje=viaje;
		this.logeado=log;
		
		this.panelItem=this.panel_item_amigo1;
		itemUser=usuarioReferencia;
		this.nombre=this.nombre_amigo;
		
		this.nombre.setValue(usuarioReferencia.getNombre());
		iniciar();
		
	}
	
	
	
	private void iniciar() {
		
		this.nombre=this.nombre_amigo;
		
		
		panelItem.addClickListener(e->{
			
			//El primer usuer es el que visitamos, el segundo es que esta logeado
			panel_informacion_user_control panel_usuario=new panel_informacion_user_control(itemUser, logeado, viaje, accesoBD);
			viaje.addView("PerfilAmigo"+itemUser.getNombre()+"de"+logeado.getNombre(), panel_usuario);
			viaje.navigateTo("PerfilAmigo"+itemUser.getNombre()+"de"+logeado.getNombre());
			
			
		});
		
		
	}
	
	private void eliminarAmigo() {
		//Llama bd_main eliminar amigo y  volver a lanzar perfil 
	}
}
