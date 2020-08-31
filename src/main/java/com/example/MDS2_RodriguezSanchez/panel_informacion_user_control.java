package com.example.MDS2_RodriguezSanchez;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;

import paquete1.Bd_main;
import paquete1.Mensaje;
import paquete1.Notificacion;
import paquete1.Usuario;

@PreserveOnRefresh
public class panel_informacion_user_control extends panel_informacion_user_ventana implements View{
	private Image imagen_perfil_usuario_control;
	private Label nombre_perfil_texto_control;
	private Label cantidad_amigos_texto_control;
	private Label cantidad_mensajes_texto_control;
	private Panel panel_usuario_logeado_actual_control;
	private Image imagen_usuario_logeado_perfil_control;
	private Label nombre_usuario_logeado_control;
	private VerticalLayout ultimos_mensajes;
	private Button cambiar_contrasena;
	private Button borrar_cuenta;
	private Button incluir_amigo;
	private Button cerrar_sesion;
	private Button lista_amigos_boton;
	private Button perfil_historial_notificaciones;
	private Button reportarCuenta;
	private Button panelModeracion;

	private Label correo_label_perfil_control;
	private Usuario usuarioLogeado;
	private Label label_descripcion_perfil_control;
	private Navigator navegador;
	private Usuario usuarioPerfil;
	private Label texto_lista;
	private TextField mensaje_reporte;
	private boolean Administrador;
	private FormLayout lista_tamanio;
	private Bd_main accesoBD;
	
	panel_informacion_user_control(Usuario perfil_visita, Usuario logeado, Navigator navegadorEntranda, Bd_main entrada){
	accesoBD=entrada;

	this.usuarioPerfil=perfil_visita;
	this.navegador=navegadorEntranda;
	this.usuarioLogeado=logeado;
	

	this.mensaje_reporte=this.field_motivo_de_reporte;
	this.mensaje_reporte.setVisible(false);
	this.cantidad_amigos_texto_control=this.cantidad_amigos_texto;
	this.lista_tamanio=this.formLayout_interfaz;
	
	this.reportarCuenta=this.boton_reportarPerfil;
	this.nombre_perfil_texto_control=this.nombre_perfil_texto;
	this.cantidad_amigos_texto_control= this.cantidad_amigos_texto;
	this.cantidad_mensajes_texto_control=this.cantidad_mensajes_texto;
	this.panel_usuario_logeado_actual_control=this.panel_usuario_logeado_actual;
	this.imagen_usuario_logeado_perfil_control=this.imagen_usuario_logeado_perfil;
	this.nombre_usuario_logeado_control=this.nombre_usuario_logeado;
	this.ultimos_mensajes=this.lista_ultimos_mensajes;
	this.cambiar_contrasena=this.perfil_cambiar_contrasena;
	this.borrar_cuenta=this.perfil_borrar_cuenta;
	this.incluir_amigo=this.perfil_incluir_amigo;
	this.cerrar_sesion=this.perfil_cerrar_sesion;
	this.lista_amigos_boton=this.listaAmigos;
	this.perfil_historial_notificaciones=this.perfil_historial_notificaciones_boton;
	this.correo_label_perfil_control=this.correo_label_perfil;
	this.label_descripcion_perfil_control=this.label_descripcion_perfil;
	this.texto_lista=this.texto_ultimos_mensajes;
	this.panelModeracion=this.boton_moderacion_reportes;
	panel_informacion_user_control aux=this;
	invisible();
	
		cantidad_amigos_texto_control.setValue("Numero de amigos: "+this.usuarioPerfil.amigo_de.size());
		//cantidad_mensajes_texto_control.setValue(""+acceso.numeroMensajesTotalesUsuario(perfil_visita));
		
		if(logeado!=null && !(perfil_visita.getEmail().equals(logeado.getEmail()))) {
			//this.incluir_amigo.setVisible(true);
			this.nombre_usuario_logeado_control.setValue(logeado.getNombre()+" "+logeado.getApellidos());
			this.reportarCuenta.setVisible(true);
			
			//Comprobamos si ya es amigo de este usuario
			if(logeado.amigo_de.contains(perfil_visita)) {
				this.incluir_amigo.setVisible(false);
			}else {
				this.incluir_amigo.setVisible(true);
			}
			
			//Comprobamos que no exite ninguna peticion pendiente
			Notificacion[] comprobarPeticionPendienteAmisitad=accesoBD.inicializarNotificaciones(perfil_visita);
			String auxId=Integer.toString(logeado.getId_usuario());

			for(Notificacion auxNotificacion: comprobarPeticionPendienteAmisitad) {
				if(auxNotificacion.getMotivo().equals("Amistad") && auxNotificacion.getCuerpo().equals(auxId)) {
					this.incluir_amigo.setVisible(false);
					break;
				}
			}
		}
	
		if(logeado!=null && (perfil_visita.getEmail().equals(logeado.getEmail()))) {
			//Si visita su propio perfil
			
			visible();
			this.nombre_usuario_logeado_control.setValue(logeado.getNombre()+" "+logeado.getApellidos());
			this.incluir_amigo.setVisible(false);
			
			
			this.Administrador= accesoBD.comprobarSiUsuarioEsAdmin(logeado);
			
			if(Administrador) {
				this.panelModeracion.setVisible(true);
			}else {
				this.panelModeracion.setVisible(false);
			}

			if(accesoBD.comprobarSiUsuarioEsAdmin(perfil_visita)) {
				this.panelModeracion.setVisible(true);
			}
			
			this.reportarCuenta.setVisible(false);
			this.incluir_amigo.setVisible(false);
		}
	
		if(logeado==null) {
			this.nombre_usuario_logeado_control.setValue("Usuario invitado");
			this.reportarCuenta.setVisible(false);
		}
			
	
		this.lista_amigos_boton.addClickListener(e->{

			lista_amigos_cargar();
			
			
		});
		
		this.reportarCuenta.addClickListener(e-> {
			
			
			if(!this.mensaje_reporte.isVisible()) {
				this.mensaje_reporte.setVisible(true);
			}else {
				
				Notificacion reporte=new Notificacion();
				reporte.setMotivo("Reporte_usuario");
				reporte.setCuerpo(this.mensaje_reporte.getValue());
				reporte.setTitulo(this.usuarioPerfil.getId_usuario()+"");
				reporte.setPertenece_a(this.usuarioLogeado);
				reporte.setReferencia_a(null);
				
				accesoBD.crear_notificacion(reporte);
				
				this.reportarCuenta.setVisible(false);
				this.mensaje_reporte.setVisible(false);
			}
		
			
		});
		
		panel_usuario_logeado_actual_control.addClickListener(e->
		{
			
			if(logeado!=null) {
				foro_registrado_ventana_control foro_entrada=new foro_registrado_ventana_control(logeado, this.navegador, accesoBD);
				foro_entrada.viaje=this.navegador;

				this.navegador.addView("Foro_Register", foro_entrada);
				this.navegador.navigateTo("Foro_Register");
			}else {
				
				foro_no_registrado_control hola=new foro_no_registrado_control(accesoBD);

		        
			       hola.viaje=navegador;
			       hola.iniciar();
				navegador.addView("foro_no_registrado", hola);
				navegador.navigateTo("foro_no_registrado");
			}
			
			
			
		});
		
		
		
		this.panelModeracion.addClickListener(e->{
			
			historial_notificacion_control lista_notificaciones=new historial_notificacion_control(logeado, navegador, true, accesoBD);
			lista_notificaciones.setVistaAnterior(this.navegador.getCurrentNavigationState());
			navegador.addView("NotificacionesHistorial_Reportes", lista_notificaciones);
			navegador.navigateTo("NotificacionesHistorial_Reportes");
			
			
		});
		
		
		
		
		this.perfil_historial_notificaciones.addClickListener(e ->
				{
				historial_notificacion_control lista_notificaciones=new historial_notificacion_control(logeado, navegador, false, accesoBD);
				lista_notificaciones.setVistaAnterior(this.navegador.getCurrentNavigationState());

				navegador.addView("NotificacionesHistorial", lista_notificaciones);
				navegador.navigateTo("NotificacionesHistorial");
			
		});
		
		
		
		
		this.cambiar_contrasena.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				Bd_main hola=new Bd_main();
				
				cambiar_contrasena_control cambiar=new cambiar_contrasena_control(logeado, navegador, aux);
				navegador.addView("cambiar_contrasena", cambiar);
				navegador.navigateTo("cambiar_contrasena");
			}
		});
		
		
		this.incluir_amigo.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				Notificacion ahora=new Notificacion();
				
				ahora.setPertenece_a(perfil_visita);
				ahora.setMotivo("Amistad");
				ahora.setTitulo(logeado.getNombre()+" quiere ser tu amigo");
				ahora.setCuerpo(String.valueOf(logeado.getId_usuario()));
				accesoBD.crear_notificacion(ahora);
				
				incluir_amigo.setVisible(false);
			}
		});
		
		this.cerrar_sesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				foro_no_registrado_control hola=new foro_no_registrado_control(accesoBD);

		        
			       hola.viaje=navegador;
			       hola.iniciar();
				navegador.addView("foro_no_registrado", hola);
				navegador.navigateTo("foro_no_registrado");
				
			}
		});
		
		this.correo_label_perfil_control.setValue(perfil_visita.getEmail());
		this.label_descripcion_perfil_control.setVisible(false);
		this.nombre_perfil_texto_control.setValue(perfil_visita.getNombre());

		inicialiarListaUltimosMensajes();
		}
	
	



	private void lista_amigos_cargar() {
		// TODO Auto-generated method stub
		if(this.lista_amigos_boton.getCaption().toString().equals("Mostrar amigos")) {
			
			
			Usuario[] listaAmigos = accesoBD.buscarAmigosUsuario(usuarioLogeado);
			item_amigo_control[] itemsAmigos=new item_amigo_control[listaAmigos.length];
			
			for(int i=0; i<listaAmigos.length; i++) {
				itemsAmigos[i]=new item_amigo_control(this.navegador, listaAmigos[i], this.usuarioLogeado, accesoBD );	
			}
			
			this.lista_ultimos_mensajes.removeAllComponents();
			
			this.formLayout_interfaz.setHeight(listaAmigos.length*80+"%");
			
			if(this.formLayout_interfaz.getHeight()<100.0) {
				this.formLayout_interfaz.setHeight("100%");
				
			}
			
			this.lista_ultimos_mensajes.addComponents(itemsAmigos);
			
			this.texto_lista.setValue("Lista Amigos");
			this.lista_amigos_boton.setCaption("Lista mensajes");
		}else {
			this.lista_ultimos_mensajes.removeAllComponents();
			inicialiarListaUltimosMensajes();				

			this.texto_lista.setValue("Ultimos mensajes");
			this.lista_amigos_boton.setCaption("Mostrar amigos");
		}
	}





	private void invisible() {
		this.cambiar_contrasena.setVisible(false);
		this.lista_amigos_boton.setVisible(false);
		this.incluir_amigo.setVisible(false);
		this.perfil_historial_notificaciones.setVisible(false);
		this.cerrar_sesion.setVisible(false);
		this.borrar_cuenta.setVisible(false);
	}
	
	private void visible() {
		this.cambiar_contrasena.setVisible(true);
		this.lista_amigos_boton.setVisible(true);
		this.incluir_amigo.setVisible(true);
		this.perfil_historial_notificaciones.setVisible(true);
		this.cerrar_sesion.setVisible(true);
		this.borrar_cuenta.setVisible(true);
	}
	

	
	private void inicialiarListaUltimosMensajes() {
		Bd_main accesoBD=new Bd_main();
		
		Mensaje[] historialUsuario=accesoBD.inicializarMensajesPropiosPerfil(usuarioPerfil);
		item_mensaje_control[] listaItems_mensaje=null;
		
		if(historialUsuario.length>10) {
			 listaItems_mensaje= new item_mensaje_control[10];
		}else {
			 listaItems_mensaje= new item_mensaje_control[historialUsuario.length];
		}
		
		
		for(int i=0; i<listaItems_mensaje.length; i++) {
			
			if(i==10) {
				break;
			}
			listaItems_mensaje[i]=new item_mensaje_control(usuarioLogeado, historialUsuario[i], true, navegador, ultimos_mensajes, this.navegador.getCurrentNavigationState(), accesoBD);
			listaItems_mensaje[i].panel_mensaje_dimensiones.setWidth("500px");
			
			
		}
		
		this.formLayout_interfaz.setHeight(listaItems_mensaje.length*80+"%");

		this.ultimos_mensajes.addComponents(listaItems_mensaje);
		
	}
	
	private void Borrar_cuenta() {
		//Llamar bd_main eliminar cuenta.
	}
}
