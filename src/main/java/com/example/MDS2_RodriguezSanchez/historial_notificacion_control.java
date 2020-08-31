package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import paquete1.Bd_main;
import paquete1.Notificacion;
import paquete1.Usuario;

public class historial_notificacion_control extends historail_notificaciones implements View {

	private Panel etiqueta_user_control;
	private Label nombre_user_historial_notificaciones_control;
	private Label amigos_var_historial_notificaciones_control;
	private Label cantidad_mensajes_var_historial_control;
	private Button boton_atender_control;
	private Button boton_archivar_control;
	private Button boton_denunciar_control;
	private Button boton_volver_control;
	private VerticalLayout lista_items_notificaciones_control;
	private Navigator viajar;
	private boolean modo_admin;
	private FormLayout lista_control_tamanio;
	private String vistaAnterior;
	private Bd_main accesoBD;
	
	historial_notificacion_control(Usuario logeado, Navigator viajante, boolean modo_admin, Bd_main entrada){
		accesoBD=entrada;
		
		this.viajar=viajante;
		this.modo_admin=modo_admin;
		this.lista_control_tamanio=this.form_layout_lista;
		this.etiqueta_user_control = this.etiqueta_user;
		this.nombre_user_historial_notificaciones_control = this.nombre_user_historial_notificaciones;
		this.amigos_var_historial_notificaciones_control = this.amigos_var_historial_notificaciones;
		this.cantidad_mensajes_var_historial_control = this.cantidad_mensajes_var_historial;
		this.boton_atender_control = this.boton_atender;
		this.boton_archivar_control = this.boton_archivar;
		this.boton_denunciar_control = this.boton_denunciar;
		this.boton_volver_control = this.boton_volver;
		this.lista_items_notificaciones_control = this.lista_items_notificaciones;
		
		this.nombre_user_historial_notificaciones_control.setValue(logeado.getNombre());
		
		//Inicializar notificaciones
		
		//Los items rellenar.
		
		
		
		//Modo admin.
		Notificacion[] notificacionesUsuario=null;
		item_notificacion_control[] notificaciones=null;
		
		if(modo_admin) {
			
			notificacionesUsuario= accesoBD.devolverNotificacionesReporte();
			item_notificacion_modificador_control[] notificaciones_reporte=new item_notificacion_modificador_control[notificacionesUsuario.length];
			
			
			for(int i=0; i<notificaciones_reporte.length; i++) {

				notificaciones_reporte[i]=new item_notificacion_modificador_control(notificacionesUsuario[i], logeado,viajar, accesoBD);
	 		}
			
			
			
			lista_control_tamanio.setHeight(104*(notificaciones_reporte.length)+"%");			
			lista_items_notificaciones_control.addComponents(notificaciones_reporte);

			
		}else {
			
			notificacionesUsuario = accesoBD.inicializarNotificaciones(logeado);
			notificaciones=new item_notificacion_control[notificacionesUsuario.length];
			for(int i=0; i<notificaciones.length; i++) {

	 			notificaciones[i]=new item_notificacion_control(logeado,viajar,notificacionesUsuario[i]);
	 		}
			
			lista_control_tamanio.setHeight(45*(notificaciones.length)+"%");

			
			lista_items_notificaciones_control.addComponents(notificaciones);
			
		}
		
		
		this.boton_volver_control.addClickListener(e->
		{
			
			
			panel_informacion_user_control panel_usuario=new panel_informacion_user_control(logeado, logeado, viajar, accesoBD);
			viajar.addView("PerfilPropio", panel_usuario);
			viajar.navigateTo("PerfilPropio");
			
		}
		);
		
		
		
		
		
	}
	
	
	public void setVistaAnterior(String entrada) {
		this.vistaAnterior=entrada;
	}
	
}
