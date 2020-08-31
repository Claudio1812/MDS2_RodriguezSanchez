package com.example.MDS2_RodriguezSanchez;

import org.orm.PersistentException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;

import paquete1.Bd_Tema;
import paquete1.Bd_main;
import paquete1.Mensaje;
import paquete1.Tema;
import paquete1.Usuario;
import paquete1.UsuarioDAO;

public class menu_tema_ventana_control extends menu_tema_ventana implements View {

	private Label label_nombre_tema_control;
	private Image imagen_loegado_control;
	private Label label_nombre_logeado_control;
	VerticalLayout lista_mensajes_control; 
	private Button boton_volver_control;
	private Tema temaMenu;
	private TextArea descripcion_tema_control;
	Navigator viaje;
	Panel perfilUsuario;
	Button boton_responder_tema_control, volver_boton;
	Usuario logeado;
	VerticalLayout contenerdorLista;
	String vista_volver;
	
	//Panel donde se muestran los mensajes.
	private Bd_main accesoBD;
	
	private FormLayout lista_form;
	
	menu_tema_ventana_control(Tema temaEntrande, Navigator viajeEntrada, Usuario logeadoEntrada, Bd_main entrada){
		accesoBD=entrada;
		this.temaMenu=temaEntrande;
		this.panel_ficha_usuario=this.panel_ficha_usuario;
		this.lista_form=this.form_layout_aumento;
		this.contenerdorLista=this.lista_contenedor;
		System.out.println("HOLA");
		
		if(logeadoEntrada!=null) {
			if(comprobarBaneado(logeadoEntrada)) {
				foro_no_registrado_control hola=new foro_no_registrado_control(accesoBD);

			       hola.viaje=viaje;
			       hola.iniciar();
			       viaje.addView("foro_no_registrado", hola);
			       viaje.navigateTo("foro_no_registrado");
			}else {
				this.inicializacion(temaEntrande, viajeEntrada, logeadoEntrada, entrada);
			}
		}else {
			this.inicializacion(temaEntrande, viajeEntrada, logeadoEntrada, entrada);
		}
	}
	
	private boolean comprobarBaneado(Usuario log) {
		
		if(log.getBaneado_por()==null) {
			return false;
		}else {
			return true;
		}
		
	}
	
	private void inicializacion(Tema temaEntrande, Navigator viajeEntrada, Usuario logeadoEntrada, Bd_main entrada) {
		
		this.logeado=logeadoEntrada;
		this.temaMenu=temaEntrande;
		this.viaje=viajeEntrada;
		this.label_nombre_tema_control= label_nombre_tema;
		this.imagen_loegado_control = imagen_loegado;
		this.label_nombre_logeado_control = label_nombre_logeado;
		this.lista_mensajes_control = lista_mensajes;
		this.boton_volver_control = boton_volver;
		this.descripcion_tema_control=this.descripcion_tema;
		this.boton_responder_tema_control=this.boton_responder_tema;
		label_nombre_tema_control.setValue(temaEntrande.getTitulo());
		descripcion_tema_control.setValue(temaEntrande.getDescripcion());
		this.volver_boton=this.boton_volver;
		if(logeado==null) {
			boton_responder_tema_control.setVisible(false);
			label_nombre_logeado_control.setVisible(false);
			panel_ficha_usuario.setVisible(false);
		}else {
			//buscar panel y esconderlo
			label_nombre_logeado_control.setValue(logeado.getNombre());

		}
		//item_mensaje_control(Usuario logeado, Mensaje mensajeEntrada, boolean lista_mensajes_recientes_usuario){

			Mensaje[] mensajesTema=accesoBD.selecionar_mensajes_tema(temaMenu);
			
			item_mensaje_control[] item_mensajes=new item_mensaje_control[mensajesTema.length];
			
			for(int i=0; i<item_mensajes.length ; i++) {
				item_mensajes[i]= new item_mensaje_control(logeado, mensajesTema[i], false, viaje, contenerdorLista, this.viaje.getCurrentNavigationState(), accesoBD);
			}
			
			if(70*item_mensajes.length< 100) {
				lista_form.setHeight("120%");

			}else{
				lista_form.setHeight(70*item_mensajes.length+"%");

			}
			
			contenerdorLista.setHeight(70*item_mensajes.length+"%");
			this.lista_mensajes_control.addComponents(item_mensajes);
		
			
			volver_boton.addClickListener(e->{
				
				if(logeado==null) {
					foro_no_registrado_control hola=new foro_no_registrado_control(accesoBD);

			        
				       hola.viaje=viaje;
				       hola.iniciar();
				  
				       viaje.addView("Foro_sinRegistrar", hola);
				        viaje.navigateTo("Foro_sinRegistrar");
				        
				        hola.setNavigator(viaje);
				}else {
					foro_registrado_ventana_control foro_entrada=new foro_registrado_ventana_control(logeado, viaje, accesoBD);

					foro_entrada.cargarTemasLista(accesoBD.buscar_temas_peticion("", temaEntrande.getPertenece_a().getId_seccion()));
					foro_entrada.viaje=viaje;
					viaje.addView("Foro_Register", foro_entrada);
					viaje.navigateTo("Foro_Register");	
				}
				
			});
			
			
		panel_ficha_usuario.addClickListener(e->{
				
				panel_informacion_user_control panel_usuario=new panel_informacion_user_control(logeado, logeado, viaje, accesoBD);
				viaje.addView("PerfilPropio", panel_usuario);
				viaje.navigateTo("PerfilPropio");
			});
		
		boton_responder_tema_control.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				crear_mensaje_tema_control responderEsteTema=new crear_mensaje_tema_control(null, temaMenu,viaje,logeado, viaje.getCurrentNavigationState() , accesoBD);
				viaje.addView("Crear_mensaje_tema", responderEsteTema);
				viaje.navigateTo("Crear_mensaje_tema");
			}
		});
	}
	
	public void eliminarUnMensaje(Mensaje entrada) {
	
		item_mensaje_control auxiliar;
		
		for(int i=0; i<this.lista_mensajes_control.getComponentCount(); i++) {
			auxiliar= (item_mensaje_control)this.lista_mensajes_control.getComponent(i);
			
			if(auxiliar.mensajeCorrespondiente.equals(entrada)) {
				this.lista_mensajes_control.removeComponent(auxiliar);
				break;
			}
			
		}
		Bd_main acceso=new Bd_main();
		acceso.eliminarMensaje(entrada);
	}
	
}
