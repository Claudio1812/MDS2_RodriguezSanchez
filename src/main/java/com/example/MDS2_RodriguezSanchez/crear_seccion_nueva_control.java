package com.example.MDS2_RodriguezSanchez;

import java.util.Date;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.AdministradorDAO;
import paquete1.Bd_main;
import paquete1.Seccion;
import paquete1.Tema;
import paquete1.Usuario;

public class crear_seccion_nueva_control extends crear_seccion_nuevo implements View{

	private TextField texto_nuevo_seccion_control;
	private TextArea descrpcion_seccion_nuevo_control;
	private Button boton_cancelar_seccion_control;
	private Button boton_subir_secciion_control;
	private Navigator viaje;
	private Usuario log;
	private Bd_main accesoBD;
	crear_seccion_nueva_control(Navigator viajeEntrada, Usuario logeado, Bd_main entrada ){
		this.accesoBD=entrada;
		this.viaje=viajeEntrada;
		this.log=logeado;
		
		this.texto_nuevo_seccion_control=this.texto_nuevo_seccion;
		this.descrpcion_seccion_nuevo_control=this.descrpcion_seccion_nuevo;
		this.boton_cancelar_seccion=this.boton_cancelar_seccion;
		this.boton_subir_secciion_control=this.boton_subir_secciion;
		
		
		this.boton_subir_secciion_control.addClickListener(new Button.ClickListener() {
			
			
			@Override
			public void buttonClick(ClickEvent event) {
				Bd_main accesoPrinciapl= new Bd_main();
				
				if(!texto_nuevo_seccion_control.getValue().isEmpty() || descrpcion_seccion_nuevo_control.getValue().isEmpty()){
					
					Seccion nuevaSeccion=new Seccion();
					try {
						nuevaSeccion.setCreada_por(AdministradorDAO.getAdministradorByORMID(log.getId_usuario()));
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					nuevaSeccion.setDescripcion(descrpcion_seccion_nuevo_control.getValue());
					nuevaSeccion.setTitulo(texto_nuevo_seccion_control.getValue());
					
					Date ahora= new Date();
					nuevaSeccion.setFecha_creacion(ahora.toString());
				
					accesoPrinciapl.CrearSeccion(nuevaSeccion);
					
					
					viaje.navigateTo("Foro_Register");
				}
				
			}
		});
		
		
		boton_cancelar_seccion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				
				foro_registrado_ventana_control foro=new foro_registrado_ventana_control(log, viaje, accesoBD);
				
				viaje.addView("Foro_registrado_vuelta", foro);
				viaje.navigateTo("Foro_registrado_vuelta");
				
				
			}
		});
		
		
		
		
	}
	
}
