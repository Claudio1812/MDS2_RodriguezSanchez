package com.example.MDS2_RodriguezSanchez;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

import paquete1.Bd_Usuario;
import paquete1.Bd_main;
import paquete1.Usuario;
import paquete1.UsuarioDAO;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

public class registrarse_control extends registrarse_ventana implements View {

	TextField nombre_entrada, apellido_entrada, correo_entrada;
	PasswordField contrasena_entrada, contrasena_confirmacion_entrada;
	Button registrarse;
	Navigator viaje;
	Label mensajeError;
	private Bd_main accesoBD;
	
	private void limpiezaGeneral() {
		nombre_entrada.setValue("");
		apellido_entrada.setValue("");
		correo_entrada.setValue("");
		contrasena_entrada.setValue("");
		contrasena_confirmacion_entrada.setValue("");
	}
	
	registrarse_control(Navigator viajeEntrada, Bd_main entrada){
		this.accesoBD=entrada;
		this.viaje=viajeEntrada;
		nombre_entrada=this.text_nombre;
		apellido_entrada= this.text_apellido;
		correo_entrada= this.correo_texto;
		this.mensajeError=this.label_errores;
		
		contrasena_entrada= this.texto_contrasena;
		contrasena_confirmacion_entrada= this.contrasena_confirmacion_texto;
		
		boton_subir.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
		
				subir();
				
			}
		});
		
		
		
	}
	

	private void subir() {
		// TODO Auto-generated method stub
		Usuario prueba;
		Bd_Usuario accesBDUsuario=new Bd_Usuario();
		String auxContrasena, auxContrasenaConfirm, auxNombre, auxApellido, auxCorreo;
		
		auxContrasena= contrasena_entrada.getValue();
		auxContrasenaConfirm = contrasena_confirmacion_entrada.getValue();
		auxNombre = nombre_entrada.getValue();
		auxApellido = apellido_entrada.getValue();
		auxCorreo = correo_entrada.getValue();
		
		
		
		if(auxContrasena.isEmpty() || auxContrasenaConfirm.isEmpty() || auxNombre.isEmpty() || auxApellido.isEmpty() || auxCorreo.isEmpty()) {
			
			System.out.println("Todos los campos deben estar rellenos");
			limpiezaGeneral();
			
			
			mensajeError.setValue("");
			mensajeError.setValue("Exite algun campo vacio");
			mensajeError.setVisible(true);
		}else {
			
			if(!auxContrasena.equals(auxContrasenaConfirm)) {
				System.out.println("La contrasena no coninciden");
				limpiezaGeneral();
				
				
				mensajeError.setValue("Contrasenas no coinciden");
				mensajeError.setVisible(true);
			}else {
				
				 prueba= new Usuario();

				try {
					prueba=UsuarioDAO.loadUsuarioByQuery("email='"+correo_entrada.getValue()+"'","email");
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Excepcion al buscar por email, para ver si el usuario exite");
				}
				
				if(prueba==null) {
					prueba=new Usuario();
					prueba.setApellidos(auxApellido);
					prueba.setNombre(auxNombre);
					prueba.setContrasena(auxContrasena);
					prueba.setEmail(auxCorreo);
					prueba.setBaneado_por(null);
					
					try {
						UsuarioDAO.save(prueba);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Excepcion al insertar el nuevo usuario");
					}
					
					foro_registrado_ventana_control foro_logeado = null;
					try {
						foro_logeado = new foro_registrado_ventana_control(UsuarioDAO.getUsuarioByORMID(prueba.getId_usuario()), viaje, accesoBD);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					foro_logeado.viaje=viaje;
					viaje.addView("Foro_logeado_user", foro_logeado);
					viaje.navigateTo("Foro_logeado_user");
					
				}else {
					limpiezaGeneral();
					System.out.println("El email ya esta en uso");
					
					mensajeError.setValue("El email ya esta en uso");
					mensajeError.setVisible(true);
				}
			}		
		}
		
		
	}
	
}
