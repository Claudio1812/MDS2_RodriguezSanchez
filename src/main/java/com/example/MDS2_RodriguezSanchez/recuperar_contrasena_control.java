package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;

import paquete1.Usuario;

public class recuperar_contrasena_control extends recuperar_contrasena_ventana implements View {

	private TextField contrasena_actual_control;
	private TextField contrasena_nueva_control;
	private TextField confirmar_contrasena_nueva_control;
	private Button boton_confirmar_nuevas_pass_contrasena;
	private Button cancelar_nueva_pass_contrasena;
	private Navigator viaje;
	
	
	recuperar_contrasena_control(Usuario user_logeado, Navigator viajar){
		this.viaje=viajar;
		
		this.contrasena_actual_control=this.contrasena_actual_label;
		this.contrasena_nueva_control=this.contrasena_nueva_label;
		this.confirmar_contrasena_nueva_control= this.confirmar_contrasena_nueva;
		this.boton_confirmar_nuevas_pass_contrasena=this.boton_confirmar_nuevas_pass;
		this.cancelar_nueva_pass_contrasena=this.cancelar_nueva_pass;
		
		
		
		boton_confirmar_nuevas_pass_contrasena.addClickListener(e->{
			
			if(contrasena_nueva_control.getValue().equals(confirmar_contrasena_nueva_control.getValue())) {
				
			//
				//Llamar metodo cambiar contrasne base de datos.
			//
			}else {
				
				System.out.println("A la hora de registrarse la confirmacion de la contrasena no conincide");
				
			}
		
			
		});
		
	}
	
}
