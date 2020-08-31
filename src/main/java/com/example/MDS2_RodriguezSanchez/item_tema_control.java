package com.example.MDS2_RodriguezSanchez;
import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.Bd_Mensaje;
import paquete1.Bd_main;
import paquete1.Mensaje;
import paquete1.Notificacion;
import paquete1.Tema;
import paquete1.Usuario;
import paquete1.UsuarioDAO;


public class item_tema_control extends item_tema_ventana implements View {

	Label nombre_tema;
	Button boton_perfil_creador_control;
	TextArea text_area_descripcion_control;
	Panel item_panel_control;
	Label label_fecha_control;
	Tema temaAsignado;
	Navigator viaje;
	Usuario logeado;
	Button reportarItem_tema, eliminar;
	String estadoPadre;
	private Bd_main accesoBD;
	public item_tema_control(Tema temaEntrada, boolean lista_mensajes_recientes, Usuario entradaUsuario, Navigator travel, Bd_main entrada){
		 accesoBD=entrada;
		
		this.viaje=travel;
		estadoPadre=viaje.getCurrentNavigationState();
		this.logeado= entradaUsuario;
		this.temaAsignado=temaEntrada;
		this.nombre_tema=this.nombre_tema_label;
		this.text_area_descripcion_control= this.text_area_descripcion;
		this.item_panel_control=this.item_panel;
		this.label_fecha_control= this.label_fecha;
		this.boton_perfil_creador_control=this.boton_visitar_perfil_creador;
		this.reportarItem_tema=this.boton_reportar_item_tema;
		this.eliminar=this.eliminarTema;
		
		this.nombre_tema.setValue(temaEntrada.getTitulo());
		this.label_fecha_control.setValue(temaEntrada.getFecha_creacion());
		this.text_area_descripcion_control.setValue(temaEntrada.getDescripcion());
		
		this.boton_perfil_creador_control.setCaption(temaAsignado.getCreador_tema().getNombre());
		
		if(entradaUsuario==null || this.logeado.equals(temaAsignado.getCreador_tema())) {
			this.reportarItem_tema.setVisible(false);
		}
		
		
		if(logeado!=null) {
			if (logeado.equals(temaAsignado.getCreador_tema())) {
				this.eliminar.setVisible(true);
				this.reportarItem_tema.setVisible(false);

			}else {
				this.reportarItem_tema.setVisible(true);
				this.eliminar.setVisible(false);

			}
			
		}else {
			this.reportarItem_tema.setVisible(false);
			this.eliminar.setVisible(false);

		}
		
		
		this.boton_reportar_item_tema.addClickListener(e -> {
			Notificacion reporte=new Notificacion();
			
			
			reporte.setMotivo("Reporte_Tema");
			reporte.setCuerpo(this.temaAsignado.getTitulo());
			reporte.setTitulo(this.temaAsignado.getId_tema()+"");
			reporte.setPertenece_a(this.logeado);
			reporte.setReferencia_a(null);
			
			accesoBD.crear_notificacion(reporte);
			
			
			this.boton_reportar_item_tema.setVisible(false);
			
		});

		
		
		
		boton_perfil_creador_control.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				panel_informacion_user_control panelVisitar=new panel_informacion_user_control(temaAsignado.getCreador_tema(), logeado, viaje, accesoBD);
				viaje.addView("Visita_perfil", panelVisitar);
				viaje.navigateTo("Visita_perfil");
				
			}
		});
		
		
		
		item_panel_control.addClickListener(new ClickListener() {

			@Override
			public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
				
			menu_tema_ventana_control temaSalto= new menu_tema_ventana_control(temaAsignado, viaje, logeado, accesoBD);
			viaje.addView("MensajesDeTemaSeleccionado", temaSalto);
			viaje.navigateTo("MensajesDeTemaSeleccionado");
				
			}
			
		} );
	
		
		this.eliminar.addClickListener(e->{
			
			/*Notificacion[] notificaciones_comprobar = accesoBD.inicializarNotificaciones(null);
			Mensaje[] mensajes_comprobar = accesoBD.selecionar_mensajes_tema(this.temaAsignado);
			int aux;
			
			for(int i=0; i< notificaciones_comprobar.length; i++) {
			
				//Eliminamos las notificaciones que tienen asociado un mensaje perteneciente al tema.
				if(notificaciones_comprobar[i].getReferencia_a()!=null) {
					if(notificaciones_comprobar[i].getReferencia_a().getEsta_en().getId_tema()==this.temaAsignado.getId_tema()) {
						accesoBD.archivarNotificacion(notificaciones_comprobar[i]);						
					}
				}else{
					//Eliminamos los reportes a este tema
					
					aux=Integer.parseInt(notificaciones_comprobar[i].getTitulo());
					
					if(aux== this.temaAsignado.getId_tema() && notificaciones_comprobar[i].getMotivo().startsWith("Reporte")) {
						accesoBD.archivarNotificacion(notificaciones_comprobar[i]);
					}
				}
			}
			
			
			
			//Borramos los mensajes y las notificaciones asignadas a estos.
			notificaciones_comprobar = accesoBD.inicializarNotificaciones(null);
			for(int i=0; i<mensajes_comprobar.length; i++) {	
				if(mensajes_comprobar[i].getEsta_en().getId_tema()==this.temaAsignado.getId_tema()) {
					
					for(Notificacion auxNotificacion: notificaciones_comprobar) {
						
						if(auxNotificacion.getReferencia_a()!=null) {
							if(auxNotificacion.getReferencia_a().equals(mensajes_comprobar[i])) {
								accesoBD.archivarNotificacion(auxNotificacion);					
							}
						}
						
					}
					
					accesoBD.eliminarMensaje(mensajes_comprobar[i]);
					notificaciones_comprobar = accesoBD.inicializarNotificaciones(null);
				}
			}*/
			
			eliminarTema();
			
			
			
			
		});

		
	}
	
	private void eliminarTema() {
		// TODO Auto-generated method stub
		accesoBD.eliminarTema(this.temaAsignado.getId_tema());
		
		foro_registrado_ventana_control foro_entrada=new foro_registrado_ventana_control(logeado, viaje, accesoBD);
		foro_entrada.viaje=viaje;
		
		viaje.addView("Foro_Register", foro_entrada);
		viaje.navigateTo("Foro_Register");
	}
	
	
	
}
