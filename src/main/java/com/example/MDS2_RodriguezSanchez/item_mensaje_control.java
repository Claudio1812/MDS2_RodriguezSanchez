package com.example.MDS2_RodriguezSanchez;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

import paquete1.Bd_main;
import paquete1.ClasesIUPersistentManager;
import paquete1.Mensaje;
import paquete1.MensajeDAO;
import paquete1.MensajeSetCollection;
import paquete1.Notificacion;
import paquete1.Tema;
import paquete1.TemaDAO;
import paquete1.Usuario;

public class item_mensaje_control extends item_mensaje_tema implements View {

	Navigator viajar;
	private Label usuario_mensaje_control;
	private Image incluir_amigo_imga_btn_control;
	private Button bORRAR_MENSAJE_PROPIO_control;
	private Panel ir_tema_principal_mostrar_solo_en_ultimos_mensajes_control;
	private Label texto_mensaje_control;
	private Label titulo_mensaje_control;
	private Panel panel_boton_like_control;
	public Mensaje mensajeCorrespondiente;
	private Button responder;
	private Panel panel_mensaje_dimensiones_control;
	private Button boton_creador_perfil_mensaje_control;
	private Button boton_reportar;
	private Usuario logeadoActual;
	private VerticalLayout listaPadreContenedora;
	private Tema temaReferenciaMensaje;
	private Bd_main accesoBD;
	
	item_mensaje_control(Usuario logeado, Mensaje mensajeEntrada, boolean lista_mensajes_recientes_usuario, Navigator viajar, VerticalLayout contenedor, String estadoAnterior, Bd_main entrada){
		accesoBD=entrada;
		this.temaReferenciaMensaje=mensajeEntrada.getEsta_en();
		this.logeadoActual=logeado;
		this.listaPadreContenedora=contenedor;
		this.viajar=viajar;
		
		this.usuario_mensaje_control= this.usuario_mensaje;
		this.incluir_amigo_imga_btn_control=this.incluir_amigo_imga_btn;
		this.panel_boton_like_control= this.panel_boton_like;
		this.bORRAR_MENSAJE_PROPIO_control= this.boton_eliminar_mensaje;
		this.ir_tema_principal_mostrar_solo_en_ultimos_mensajes_control= this.ir_tema_principal_mostrar_solo_en_ultimos_mensajes;
		this.texto_mensaje_control=this.texto_mansaje;
		this.titulo_mensaje_control=this.texto_titulo;
		this.responder=this.boton_responder;
		this.panel_mensaje_dimensiones_control=this.panel_mensaje_dimensiones;
		this.boton_reportar=this.reportar_mensaje_en_item;
		this.mensajeCorrespondiente=mensajeEntrada;
		this.boton_creador_perfil_mensaje_control= this.boton_creador_perfil_mensaje;
		if(!lista_mensajes_recientes_usuario) {
			this.ir_tema_principal_mostrar_solo_en_ultimos_mensajes_control.setVisible(false);
		}
		
		if(logeadoActual==null || this.logeadoActual.equals(this.mensajeCorrespondiente.getMensaje_escrito_por())) {
			this.boton_reportar.setVisible(false);
		}
		
		if(lista_mensajes_recientes_usuario) {
			boton_creador_perfil_mensaje_control.setVisible(false);
		}
		
		if(logeado==null) {
			this.bORRAR_MENSAJE_PROPIO_control.setVisible(false);
			responder.setVisible(false);
			this.boton_reportar.setVisible(false);
		}else {
	
			if(logeado.getId_usuario()== mensajeCorrespondiente.getMensaje_escrito_por().getId_usuario()) {
				//Si el usuario logeado a escrito este mensaje.
				this.bORRAR_MENSAJE_PROPIO_control.setVisible(true);
				this.incluir_amigo_imga_btn_control.setVisible(false);
				this.boton_reportar.setVisible(false);

				
				
				bORRAR_MENSAJE_PROPIO_control.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
				
						//Comprobamos que no tenga denuncias en el mensaje
						/*Notificacion[] historialNotificaciones_comprobar=accesoBD.devolverNotificacionesReporte();
						
							
						for(int i=0; i<historialNotificaciones_comprobar.length; i++) {
								
							if(historialNotificaciones_comprobar[i].getReferencia_a()!=null) {
								if(historialNotificaciones_comprobar[i].getReferencia_a().equals(mensajeCorrespondiente)) {
										accesoBD.archivarNotificacion(historialNotificaciones_comprobar[i]);
								}	
							}
							
						}*/
							
						if(lista_mensajes_recientes_usuario) {
						
							accesoBD.eliminarMensaje(mensajeCorrespondiente);
							
							panel_informacion_user_control panel_usuario=new panel_informacion_user_control(logeado, logeado, viajar, accesoBD);
							viajar.addView("PerfilPropio", panel_usuario);
							
							viajar.navigateTo("PerfilPropio");
							
						}else {
							
							accesoBD.eliminarMensaje(mensajeCorrespondiente);
							
							menu_tema_ventana_control nuevoPerfil= new menu_tema_ventana_control(temaReferenciaMensaje, viajar, logeado, accesoBD);
							viajar.addView("MensajesDeTemaSeleccionado", nuevoPerfil);
							viajar.navigateTo("MensajesDeTemaSeleccionado");
						}
					}
				});
				
				
			}else {
				//Si el usuario logeado NO  a escrito este mensaje.
				this.boton_reportar.setVisible(true);

				this.bORRAR_MENSAJE_PROPIO_control.setVisible(false);
				
			}
		}
		
		
		
		this.titulo_mensaje_control.setValue(this.mensajeCorrespondiente.getTitulo());
		this.texto_mensaje_control.setValue(this.mensajeCorrespondiente.getCuerpo());
		this.usuario_mensaje_control.setValue(this.mensajeCorrespondiente.getMensaje_escrito_por().getNombre());
		//this.text_numero_likes_boton_control.setValue(String.valueOf(this.mensajeCorrespondiente.getMe_gusta()));
		
		this.boton_reportar.addClickListener(e-> {
			
			
			
		});
		
		
		boton_creador_perfil_mensaje_control.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				panel_informacion_user_control panelVisitar=new panel_informacion_user_control(mensajeCorrespondiente.getMensaje_escrito_por(), logeado, viajar, accesoBD);
				viajar.addView("Visita_perfil", panelVisitar);
				viajar.navigateTo("Visita_perfil");
				
			}
		});
		
		
		this.boton_reportar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				
				Notificacion nuevaNotificacion=new Notificacion();
				
				nuevaNotificacion.setCuerpo(mensajeCorrespondiente.getCuerpo());
				nuevaNotificacion.setMotivo("Reporte_mensaje");
				nuevaNotificacion.setTitulo(mensajeCorrespondiente.getTitulo());
				nuevaNotificacion.setPertenece_a(logeadoActual);
				nuevaNotificacion.setReferencia_a(mensajeCorrespondiente);
				
				accesoBD.crear_notificacion(nuevaNotificacion);
			}
		});
		
		
		responder.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				crear_mensaje_tema_control mensajeRespuesta=new crear_mensaje_tema_control(mensajeCorrespondiente,mensajeEntrada.getEsta_en(), viajar, logeado, viajar.getCurrentNavigationState(), accesoBD);
				
				viajar.addView("CrearMensajeRespuesta", mensajeRespuesta);
				viajar.navigateTo("CrearMensajeRespuesta");
			}
		});
		
	}
	
	//Metodo para eliminar en cascada
	//Por desgracia recibimos excepcion del hibernate.
	
	/*private void eliminarMensajeCascada(Mensaje entrada) {
		MensajeSetCollection respuestas_hijos= entrada.respondido_por;
		
		
		if(!respuestas_hijos.isEmpty()) {
			
			for(Mensaje aux : respuestas_hijos.toArray()) {
				eliminarMensajeCascada(aux);
			}
		}
		
		this.principal.eliminarMensaje(entrada);
	}*/
	
	
}
