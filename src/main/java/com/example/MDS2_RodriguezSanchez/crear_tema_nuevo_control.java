package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import java.util.Date;
import paquete1.Bd_main;
import paquete1.Seccion;
import paquete1.Tema;
import paquete1.Usuario;

import com.vaadin.ui.Button.ClickEvent;

public class crear_tema_nuevo_control extends crear_tema_nuevo_ventana implements View {

	private TextField texto_nuevo_tema_control;
	private TextArea descrpcion_tema_nuevo_control;
	private Button boton_subir_control;
	private Navigator viajar;
	private Bd_main accesoBD;
	Seccion seccionPadre;
	Usuario logeado;
	
	crear_tema_nuevo_control( Navigator Entradaviajar, Seccion seccionEntrada, Usuario userEntrada, Bd_main entrada){
		this.accesoBD=entrada;
		this.logeado=userEntrada;
		this.texto_nuevo_tema_control=this.texto_nuevo_tema;
		this.descrpcion_tema_nuevo_control=this.descrpcion_tema_nuevo;
		this.boton_subir_control=this.boton_subir;
		
		this.viajar=Entradaviajar;
		this.seccionPadre=seccionEntrada;
	
		boton_subir_control.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				
				if(texto_nuevo_tema_control.getValue().isEmpty() || descrpcion_tema_nuevo_control.getValue().isEmpty()) {
					
					System.out.println("Rellena los campos para insertar el nuevo tema");
				}else {
					Tema nuevoTema=new Tema();
					Date ahora=new Date();

					nuevoTema.setPertenece_a(seccionPadre);
					nuevoTema.setParticipantes(0);
					nuevoTema.setCreador_tema(logeado);
					nuevoTema.setMe_gusta(0);
					nuevoTema.setTitulo(texto_nuevo_tema_control.getValue());
					nuevoTema.setDescripcion(descrpcion_tema_nuevo_control.getValue());
					nuevoTema.setFecha_creacion(ahora.toString());

					//Devuelve un booleano que podemos user o no
					accesoBD.Crear_Tema(nuevoTema);
				}
				
				foro_registrado_ventana_control volver=new foro_registrado_ventana_control(logeado, viajar, accesoBD);
				
				viajar.addView("Foro_registrado_desde_Crear_tema", volver);
				viajar.navigateTo("Foro_registrado_desde_Crear_tema");
				
			}
		});
		
	}
	
}
