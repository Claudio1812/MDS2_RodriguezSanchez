package com.example.MDS2_RodriguezSanchez;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;

import paquete1.Bd_main;
import paquete1.Mensaje;
import paquete1.Notificacion;
import paquete1.Tema;
import paquete1.Usuario;

public class item_notificacion_modificador_control extends item_notificacion_modificador implements View{

	
	private Button boton_denuncia, boton_perdonar;
	private Panel denunciante, denunciado;
	private Label tipo_denuncia, nombreDenunciante, nombreDenunciado, tituloNotificacionReporte;
	private TextArea cuerpoNotificacion;
	private Usuario logeado, UserDenunciado, UserDenunciante;
	private Navigator viaje;
	private  Bd_main accesoBD;
	private Label textoAuxiliar_control;
	private Notificacion referenciaItem;
	public item_notificacion_modificador_control(Notificacion entrada, Usuario login, Navigator navegador, Bd_main entradaBD) {
		accesoBD=entradaBD;
		
		this.viaje=navegador;
		this.logeado=login;
		this.referenciaItem=entrada;
		this.textoAuxiliar_control=this.texto_auxiliar;
		this.textoAuxiliar_control.setVisible(false);
		this.boton_denuncia=this.boton_banear;
		this.boton_perdonar=this.boton_perdonar_ventana;
		this.tipo_denuncia=this.label_tipoDenuncia;
		
		this.nombreDenunciado= this.label_denunciado;
		this.nombreDenunciante= this.label_denunciante;
		
		this.denunciante=this.perfil_denunciante;
		this.denunciado=this.perfil_denunciante;
		
		this.cuerpoNotificacion=this.text_Area_informacion;
		this.tituloNotificacionReporte= this.titulo_item_reporte;
		
		this.UserDenunciante= entrada.getPertenece_a();
		this.nombreDenunciante.setValue(UserDenunciante.getNombre());
		nombreDenunciante.setValue(entrada.getPertenece_a().getNombre());
		tipo_denuncia.setValue(entrada.getMotivo());
		
		
		
		switch(entrada.getMotivo()) {
		
		case "Reporte_Tema":
			
			Tema temaReporte= accesoBD.accesoDirectoTema(Integer.parseInt(entrada.getTitulo()));
			this.UserDenunciado=temaReporte.getCreador_tema();
			
			this.cuerpoNotificacion.setValue(temaReporte.getDescripcion());
			this.titulo_item_reporte.setValue(temaReporte.getTitulo());
			this.tipo_denuncia.setValue("Tema: ");
			this.nombreDenunciado.setValue(UserDenunciado.getNombre());
			
			
			break;
		
		case "Reporte_mensaje":
			
			//Entre todos los mensajes del denunciado buscamos el que es en concreto.
			this.tipo_denuncia.setValue("Mensaje: ");
			this.titulo_item_reporte.setValue(entrada.getReferencia_a().getTitulo());
			this.cuerpoNotificacion.setValue(entrada.getReferencia_a().getCuerpo());
			this.UserDenunciado=entrada.getReferencia_a().getMensaje_escrito_por();
			this.nombreDenunciado.setValue(UserDenunciado.getNombre());
			
			break;
			
		case "Reporte_usuario":
			
			this.UserDenunciado=accesoBD.CargarPerfilUsuario(Integer.parseInt(entrada.getTitulo()));

			this.tipo_denuncia.setValue("Usuario: ");
			this.titulo_item_reporte.setVisible(false);
			this.cuerpoNotificacion.setValue(entrada.getCuerpo());
			this.nombreDenunciado.setValue(UserDenunciado.getNombre());

			break;
		}
		
		this.perfil_denunciado.addClickListener(e->
		{
		
			panel_informacion_user_control panel_usuario=new panel_informacion_user_control(UserDenunciado, logeado, viaje, accesoBD);
			viaje.addView("Perfil_denunciado_"+UserDenunciado.getNombre(), panel_usuario);
			viaje.navigateTo("Perfil_denunciado_"+UserDenunciado.getNombre());
		
		});
		
		this.perfil_denunciante.addClickListener(e -> {
			

			panel_informacion_user_control panel_usuario=new panel_informacion_user_control(logeado, logeado, viaje, accesoBD);
			viaje.addView("Perfil_denunciante"+logeado.getNombre(), panel_usuario);
			viaje.navigateTo("Perfil_denunciante"+logeado.getNombre());
			
		});
		
		this.boton_perdonar.addClickListener(e -> {
			
			accesoBD.archivarNotificacion(referenciaItem);
			historial_notificacion_control lista_notificaciones=new historial_notificacion_control(logeado, navegador, true, accesoBD);
			lista_notificaciones.setVistaAnterior(navegador.getCurrentNavigationState());
			navegador.addView("NotificacionesHistorial_Reportes", lista_notificaciones);
			navegador.navigateTo("NotificacionesHistorial_Reportes");
			
			
		});
		
		this.boton_denuncia.addClickListener(e-> {
			banearUsuario(referenciaItem, logeado, viaje);
		});
		
		if(accesoBD.comprobarSiUsuarioEsAdmin(UserDenunciado)) {
			this.textoAuxiliar_control.setValue("No se puede banear a un admin");
			this.boton_denuncia.setVisible(false);
		}
		
	
		
	}
	
	private void banearUsuario(Notificacion entrada, Usuario login, Navigator viaje2) {
		switch(entrada.getMotivo()) {
		case "Reporte_Tema":
			Tema temaReporte= accesoBD.accesoDirectoTema(Integer.parseInt(entrada.getTitulo()));
			accesoBD.eliminarTema(temaReporte.getId_tema());
			break;
		
		case "Reporte_mensaje":
			
			accesoBD.eliminarMensaje(entrada.getReferencia_a());
			break;
		case "Reporte_usuario":
			
			this.UserDenunciado=accesoBD.CargarPerfilUsuario(Integer.parseInt(entrada.getTitulo()));
			
			accesoBD.BanearUsuario(UserDenunciado, login.getId_usuario());
			accesoBD.archivarNotificacion(referenciaItem);

			break;
		
	
		}

		historial_notificacion_control lista_notificaciones=new historial_notificacion_control(logeado, viaje2, true, accesoBD);
		viaje2.addView("NotificacionesHistorial_Reportes", lista_notificaciones);
		viaje2.navigateTo("NotificacionesHistorial_Reportes");
		
	}
	
	
}
