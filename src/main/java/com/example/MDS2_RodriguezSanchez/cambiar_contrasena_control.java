package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.Bd_main;
import paquete1.Usuario;

public class cambiar_contrasena_control extends Cambiar_contrasena implements View{
	
	private TextField contrasena_actual_label_control;
	private TextField contrasena_nueva_label_control;
	private TextField confirmar_contrasena_nueva_control;
	private Button boton_confirmar_nuevas_pass_control;
	private Button cancelar_nueva_pass_control;
	Navigator viaje;
	Usuario login;
	
	
	cambiar_contrasena_control(Usuario loginUser, Navigator viajeControl, panel_informacion_user_control perfil){
		this.viaje=viajeControl;
		this.login=loginUser;
		
		this.contrasena_actual_label_control=this.contrasena_actual_label;
		this.contrasena_nueva_label_control=this.contrasena_nueva_label;
		this.confirmar_contrasena_nueva_control= this.confirmar_contrasena_nueva;
		
		
		this.boton_confirmar_nuevas_pass_control= this.boton_confirmar_nuevas_pass;
		this.cancelar_nueva_pass_control=this.cancelar_nueva_pass;
		
		
		boton_confirmar_nuevas_pass_control.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				System.out.println("HOLA cambio pass");
				
				if(contrasena_nueva_label_control.getValue().equals(confirmar_contrasena_nueva_control.getValue())) {
					
					if(login.getContrasena().equals(contrasena_actual_label_control.getValue())) {
						Bd_main main=new Bd_main();
						
						main.cambiar_contrasena(login, contrasena_nueva_label_control.getValue());
						viaje.addView("Volver_perfil",perfil );
						viaje.navigateTo("Volver_perfil");
					}
					System.out.println("La contrasena actual no es la que tenias antes ");
					
					
				}
				
			}
		});
		
		
	}
	
}
