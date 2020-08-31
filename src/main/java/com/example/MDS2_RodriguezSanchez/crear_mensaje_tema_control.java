package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.Bd_main;
import paquete1.Mensaje;
import paquete1.Tema;
import paquete1.Usuario;

public class crear_mensaje_tema_control extends crear_mensaje_tema_ventana implements View {

	private TextField titulo_mensaje_en_tema_control;
	private TextArea descripcion_mensaje_control;
	private Button subir_mensaje_tema_control, cancelarControl;
	private String navegarAtras;
	private Navigator viajar;
	private Tema temaSource;
	private Usuario logeado;
	private Bd_main acceso;
	
	crear_mensaje_tema_control(Mensaje respuestaDe, Tema temaPadre, Navigator viajero, Usuario logeadoEntrada, String volverAtras, Bd_main entrada){
		this.acceso=entrada;
		this.navegarAtras=volverAtras;
		this.viajar=viajero;
		this.temaSource=temaPadre;
		this.logeado=logeadoEntrada;
		this.cancelarControl=this.boton_cancelar_html;
		this.titulo_mensaje_en_tema_control=this.titulo_mensaje_en_tema;
		this.descripcion_mensaje_control=this.descripcion_mensaje;
		this.subir_mensaje_tema_control=this.subir_mensaje_tema;
		
		
		cancelarControl.addClickListener(e-> {
					

			menu_tema_ventana_control volviendo=new menu_tema_ventana_control(temaSource, viajar, logeado, acceso);
			viajar.addView("MensajesDeTemaSeleccionado", volviendo);
			viajar.navigateTo("MensajesDeTemaSeleccionado");
		});
		
		
		subir_mensaje_tema_control.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			
			
				CrearMensaje(respuestaDe);
				
			}
		});
		
		
	}
	
	private void CrearMensaje(Mensaje respuestaDe) {
		if(titulo_mensaje_en_tema_control.getValue().isEmpty() || descripcion_mensaje_control.isEmpty()) {
			System.out.println("No se a rellenado todos los campos necesarios para crear el mensaje");
			}else {
				
				String extra="";
				Mensaje mensajeCreado=new Mensaje();

				if(respuestaDe!=null) {
					extra=extra+"Respuesta de: "+respuestaDe.getTitulo()+" |";
					
					//No hacemos esto ya que tenemos problemas al eliminarlo en casacada.
					//mensajeCreado.setRespuesta_de(respuestaDe);
				}
				
				mensajeCreado.setCuerpo(descripcion_mensaje_control.getValue());
				mensajeCreado.setMe_gusta(0);
				mensajeCreado.setORM_Mensaje_escrito_por(logeado);
				mensajeCreado.setEsta_en(temaSource);
				mensajeCreado.setTitulo(extra+titulo_mensaje_en_tema_control.getValue());
				acceso.Crear_Mensaje(mensajeCreado);
				
				
				menu_tema_ventana_control volviendo=new menu_tema_ventana_control(temaSource, viajar, logeado, acceso);
				viajar.addView("MensajesDeTemaSeleccionado", volviendo);
				viajar.navigateTo("MensajesDeTemaSeleccionado");
	}

}
	
}
