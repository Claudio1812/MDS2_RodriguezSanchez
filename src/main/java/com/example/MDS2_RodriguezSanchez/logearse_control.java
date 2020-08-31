package com.example.MDS2_RodriguezSanchez;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;

import com.vaadin.navigator.View;import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

import paquete1.*;
public class logearse_control extends Logearse_ventana implements View {

	
	/**
	 * Logearse_ventana.html
	 */
	private static final long serialVersionUID = 1L;
	Navigator viaje; //El valor de este navigator se asigna en la clase foro_no_registrado
	TextField email, contrasena;
	Button loginBoton;
	Button Registrarse;
	Label mostrarErrores;
	private Bd_main accesoBD;
	
	public logearse_control(Bd_main entrada) {
		accesoBD=entrada;
		email=this.text_email;
		contrasena=this.text_contrasena;
		loginBoton=this.iniciar_sesion_login;
		mostrarErrores=this.label_de_error;
		
		
		this.boton_registrarse.addClickListener(e->{
			
			registrarse_control registrarse=new registrarse_control(this.viaje, accesoBD);
			
			this.viaje.addView("Registrarse",registrarse);
			this.viaje.navigateTo("Registrarse");
		});
		
		
		
		loginBoton.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				System.out.println("HOLA 28");

				Bd_main accesoBD=new Bd_main();
				Usuario user_acceso=accesoBD.IniciarSesion(email.getValue(), contrasena.getValue());
			
				
				
				System.out.println(viaje.getCurrentNavigationState()+ "Hey");
				//viaje.navigateTo("Foro_sinRegistrar");
				
				if(user_acceso!=null) {
					
					if(comprobarBaneado(user_acceso)) {
						//Si el usuario es baneado , no entra en el foro
						foro_no_registrado_control hola=new foro_no_registrado_control(accesoBD);

					       hola.viaje=viaje;
					       hola.iniciar();
					       viaje.addView("foro_no_registrado", hola);
					       viaje.navigateTo("foro_no_registrado");
						
					}else {
						//Si el usuario es correcto y no esta baneado entra en el foro

						foro_registrado_ventana_control foro_entrada=new foro_registrado_ventana_control(user_acceso, viaje, accesoBD);
						foro_entrada.viaje=viaje;

						viaje.addView("Foro_Register", foro_entrada);
						viaje.navigateTo("Foro_Register");
					}
					
					
				}else {
					
					
					System.out.println("Ese usuario no exite");
					limpiarEntradasTexto();
					mostrarErrores.setValue("Error en las credenciales");
					mostrarErrores.setVisible(true);

				
				}
				
				
				
				
				
				
				
			}
		} );
	}
	
	private boolean comprobarBaneado(Usuario log) {
		
		if(log.getBaneado_por()==null) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public void setNavigator(Navigator nav) {
		this.viaje=nav;
	}
	
	private void limpiarEntradasTexto() {
		this.email.setValue("");
		this.contrasena.setValue("");
	}
	
}
