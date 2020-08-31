package com.example.MDS2_RodriguezSanchez;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.mapping.List;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.Bd_main;
import paquete1.Bd_seccion;
import paquete1.Seccion;
import paquete1.Tema;
import paquete1.Usuario;

public class foro_registrado_ventana_control extends foro_registrado_ventana  implements com.vaadin.navigator.View  {

	Label nombre_lista_estado;//secciones, temas o mensajes.
	Label nombre_tarjeta_usuario;
	Navigator viaje;
	VerticalLayout listaSeccionesControl;
	Usuario logeado;
	Button Crear_seccion;
	Button ordenValoracion;
	Button ordenAntiguedad;
	Button crearTema;
	Panel click_usuario_control;
	Panel busqueda;
	Panel foroNombre;
	TextField palabraBusqueda;
	Seccion seccionActualBusqueda;
	FormLayout lista_incremento_tamanio;
	private int tamanio_ampliacion_lista;
	private Bd_main accesoBD;

	/*
	 * 
	 * foro_registrado_ventana.html
	 */ 
	public foro_registrado_ventana_control(Usuario userLogeado, Navigator viajeEntrada, Bd_main entrada) {
		logeado=userLogeado;
		this.Crear_seccion=this.boton_crear_seccion;
		this.crearTema=this.boton_crear_tema;
		this.accesoBD=entrada;
		this.ordenValoracion=this.boton_valorar;
		this.busqueda=this.boton_buscar;
		this.viaje=viajeEntrada;
		palabraBusqueda=this.textfield_buscar;
		this.ordenAntiguedad=this.boton_antiguedad;
		this.foroNombre=this.panel_foro_nombre;
		this.lista_incremento_tamanio=this.formLayout_interfaz;
		tamanio_ampliacion_lista=23;
		accesoBD=entrada;
		
		
		if(accesoBD.comprobarSiUsuarioEsAdmin(logeado)) {
			this.Crear_seccion.setVisible(true);
		}else {
			this.Crear_seccion.setVisible(false);
		}
		
		this.crearTema.setVisible(false);
		iniciar();
		nombre_tarjeta_usuario.setValue(userLogeado.getNombre());
	}
	
	
	
	
	private void iniciarClickPanelUsuario() {
		
		click_usuario_control.addClickListener(new ClickListener() {

			@Override
			public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
				
				//En este caso es un click al panel de foro registrado, el unico que puede clickear en esto es el mismo usuario
				panel_informacion_user_control panel_usuario=new panel_informacion_user_control(logeado, logeado, viaje, accesoBD);
				viaje.addView("PerfilPropio", panel_usuario);
				viaje.navigateTo("PerfilPropio");
				
			}
		});
		
	}
	

	
	public void cargarTemasLista(Tema[] entrada) {
		
		item_tema_control item_Temas[] =new item_tema_control[entrada.length];

		for(int i=0 ; i< entrada.length; i++) {
			//Es false, ya que no lo estamos llamando desde el perfil del usuario.
			item_Temas[i]=new item_tema_control(entrada[i], false ,logeado, this.viaje, accesoBD);
		}
		
		this.nombre_lista_estado.setValue("Temas");
		
		this.listaSeccionesControl.removeAllComponents();
		
		if((tamanio_ampliacion_lista+36)*item_Temas.length<100) {
			this.lista_incremento_tamanio.setHeight("100%");
		}else {
			this.lista_incremento_tamanio.setHeight(((tamanio_ampliacion_lista+36)*item_Temas.length)+"%");
		}
		
		this.listaSeccionesControl.addComponents(item_Temas);	
		
	}
	
	
	public void cargarSecionesLista(Seccion[] entrada) {
		item_secciones_ventana_control[] item_seccion= new item_secciones_ventana_control[entrada.length];

		
		for(int i=0; i<entrada.length; i++){
			item_seccion[i]=new item_secciones_ventana_control(entrada[i], this.listaSeccionesControl, logeado, this.viaje, this, accesoBD);
		}
		
		this.nombre_lista_estado.setValue("Secciones");
		
		this.listaSeccionesControl.removeAllComponents();
		
		if(tamanio_ampliacion_lista*item_seccion.length<100) {
			this.lista_incremento_tamanio.setHeight("100%");
		}else {
			this.lista_incremento_tamanio.setHeight(tamanio_ampliacion_lista*item_seccion.length+"%");
		}
		this.listaSeccionesControl.addComponents(item_seccion);	
		
		
	}
	
	
	
	//Este metodo se lanza cuando navegamos hacia este estado.
	//Por ejemplo cuando creamos uan seccion nueva, si no hacemos esto y volvemos
	//a la view tal y como estaba no veremos la nueva seccion ya que no se a refrescado
	@Override
	public  void enter(ViewChangeEvent event) {
		Bd_main accesoBD =new Bd_main();

		cargarSecionesLista(accesoBD.buscar_secciones_foro());
	}
	
	public void iniciar(){
		
		Bd_main accesoBD =new Bd_main();
		
		this.click_usuario_control=this.click_perfilUsuario;
		nombre_lista_estado=this.label_lista_modo;
		nombre_tarjeta_usuario=this.nombre_tarjeta_user;
		listaSeccionesControl=this.layout_Secciones;

 		iniciarClickPanelUsuario();
		

 		this.foroNombre.addClickListener(e->{
 			
 			Bd_main entrada=new Bd_main();
 			
 			nombre_lista_estado.setValue("Secciones");
 			this.cargarSecionesLista(entrada.buscar_secciones_foro());
 			this.crearTema.setVisible(false);
 			this.Crear_seccion.setVisible(true);
 		});
 		
 		
 		this.Crear_seccion.addClickListener(e->{
 			crear_seccion_nueva_control crearSecion=new crear_seccion_nueva_control(viaje, logeado, accesoBD);
 			viaje.addView("CrearNuevaSeccion", crearSecion);
 			viaje.navigateTo("CrearNuevaSeccion");
 			
 			
 		});
 		
 		this.crearTema.addClickListener(e->{
 			crearTema();
 		}); 		
 		
 		this.ordenAntiguedad.addClickListener(e->{
 			Bd_main acceso=new Bd_main();

 			if(nombre_lista_estado.getValue().equals("Secciones")) {
 				this.cargarSecionesLista(accesoBD.ordenar_secciones_antiguedad());
 			}else {
 				this.cargarTemasLista((accesoBD.ordenarTemasAntiguedad(this.seccionActualBusqueda.getId_seccion())));
 			}
 			
 		});
 		
 		
 		this.busqueda.addClickListener(e->{
 			Bd_main acceso=new Bd_main();
 			
 			if(nombre_lista_estado.getValue().equals("Secciones")) {
 				this.cargarSecionesLista(accesoBD.buscar_secciones_peticion(palabraBusqueda.getValue()));
 			}else {
 				
 				this.cargarTemasLista(accesoBD.buscar_temas_peticion(palabraBusqueda.getValue().toString(), seccionActualBusqueda.getId_seccion()));
 			}
 			
 			palabraBusqueda.clear();
 		});
	}
	
		private void crearTema() {
			crear_tema_nuevo_control crearTema=new crear_tema_nuevo_control(viaje, seccionActualBusqueda, logeado, accesoBD);
 			viaje.addView("CrearNuevoTema", crearTema);
 			viaje.navigateTo("CrearNuevoTema");
		}
}
