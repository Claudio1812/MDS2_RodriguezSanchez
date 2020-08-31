package com.example.MDS2_RodriguezSanchez;

import javax.swing.text.View;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import java.util.ArrayList;
import java.util.Arrays;

import paquete1.Bd_main;
import paquete1.Bd_seccion;
import paquete1.Seccion;
import paquete1.Tema;

public class foro_no_registrado_control extends foro_no_registrado_ventana implements com.vaadin.navigator.View {

	VerticalLayout lista;
	
	Navigator viaje;
	Label label_lista_modo_control;
	Label LabelcoleccionActual;
	Button ordenAntiguedad;
	Button ordenValoracion;
	ArrayList<Seccion> ordenListas;
	Panel volverMenuInicial;
	Panel buscar;
	TextField textoParaBuscar;
	Seccion seccionSelecionadaBusqueda;
	FormLayout lista_incremento_tamanio;
	private int tamanio_ampliacion_lista;
	private Bd_main accesoBD;
	
	public foro_no_registrado_control(Bd_main entrada) {
		accesoBD=entrada;
		tamanio_ampliacion_lista=23;
		lista=this.lista_secciones_entrada;
		this.label_lista_modo_control=this.foro_nombre_label;
		LabelcoleccionActual=this.label_actual;
		ordenAntiguedad=this.boton_antiguedad;
		ordenValoracion=this.boton_valoracion;
		volverMenuInicial=this.boton_menuDefecto;
		textoParaBuscar=this.textfield_buscar;
		buscar=this.boton_buscar;
		this.lista_incremento_tamanio=this.formLayout_interfaz;
		
		
		ordenValoracion.setVisible(false);
	}
	
	
	public void setNavigator(Navigator nav) {
		this.viaje=nav;
	}
	
	private void CargarSeccionesIniciales() {
		//INCONGRUENCIA EN ESTE METODO REVISAR
		Seccion[] inicializarLista= accesoBD.buscar_secciones_foro();
		item_secciones_ventana_control[] items_inicio= new item_secciones_ventana_control[inicializarLista.length];
		
		for(int i=0; i<inicializarLista.length; i++){
			items_inicio[i]=new item_secciones_ventana_control(inicializarLista[(inicializarLista.length-1)-i], lista, null, this.viaje,this, accesoBD);
			items_inicio[i].lugarPrincipalNoRegistrado=this;
		}

		lista.removeAllComponents();
		
		if((tamanio_ampliacion_lista*items_inicio.length)<100) {
			
			this.lista_incremento_tamanio.setHeight("100%");

		}else {
			this.lista_incremento_tamanio.setHeight(tamanio_ampliacion_lista*items_inicio.length+"%");
		}
		
		
		lista.addComponents(items_inicio);	
		
		LabelcoleccionActual.setValue("Secciones");
	}
	
	
	
	private void rellenarListaconSecciones(Seccion[] entrada) {
		
		item_secciones_ventana_control[] item_seccion= new item_secciones_ventana_control[entrada.length];

		for(int i=0; i<entrada.length; i++){
			item_seccion[i]=new item_secciones_ventana_control(entrada[i], lista, null, this.viaje, this, accesoBD);
			item_seccion[i].lugarPrincipalNoRegistrado=this;

		}
		this.LabelcoleccionActual.setValue("Secciones");
		
		lista.removeAllComponents();
		
		
		if(tamanio_ampliacion_lista*item_seccion.length<100) {
			
			this.lista_incremento_tamanio.setHeight("100%");

		}else {
			this.lista_incremento_tamanio.setHeight(tamanio_ampliacion_lista*item_seccion.length+"%");
		}

		lista.addComponents(item_seccion);	
		
	}
	
	public void rellenarListaconTemas(Tema[] entrada) {
		
		System.out.println("Estoy aqui hehehe");
		item_tema_control item_Temas[] =new item_tema_control[entrada.length];
		
		
		for(int i=0 ; i< entrada.length; i++) {
			//Es false, ya que no lo estamos llamando desde el perfil del usuario.
			//Es null ya que no hay un usuario logeado, estamos en foro_no_registrado
			item_Temas[i]=new item_tema_control(entrada[i], false ,null, this.viaje, accesoBD);
			
		}
		
		
		this.LabelcoleccionActual.setValue("Temas");
		this.LabelcoleccionActual.setCaption("Temas");
		
		lista.removeAllComponents();
		
		this.lista_incremento_tamanio.setHeight((tamanio_ampliacion_lista+26)*item_Temas.length+"%");

		lista.addComponents(item_Temas);	


	}
	
	public void iniciar() {

		this.iniciar_sesion.addClickListener(e->{
			
			
			iniciarSesion();
			
		});

		
		
		
		this.boton_registrarse.addClickListener(e->{
			
			registrase();
			
		});

	
		
		
		CargarSeccionesIniciales();
		
		this.ordenAntiguedad.addClickListener(e->{
			
			ordenAntiguedad();
		});		
		
		
		
		this.ordenValoracion.addClickListener(e->{
			
			
			//Sin implementar
			/*System.out.println("Ordenacion");

			Bd_main acceso=new Bd_main();
			acceso.ordenarPorPopularidad();*/
			
			
		});		
		
		
		this.buscar.addClickListener(e->{
			
			
			busqueda();
		});
		
		volverMenuInicial.addClickListener(e->{			
			CargarSeccionesIniciales();
		});		
	}
	
	private void registrase() {

		registrarse_control registrarse=new registrarse_control(this.viaje, accesoBD);
		this.viaje.addView("Registrarse",registrarse);
		this.viaje.navigateTo("Registrarse");
		
	}

	private static final long serialVersionUID = 1L;

	
	private void busqueda() {
		if(LabelcoleccionActual.getValue().equals("Secciones")) {
			Seccion[] peticionBusqueda=accesoBD.buscar_secciones_peticion(this.textoParaBuscar.getValue());
			
			rellenarListaconSecciones(peticionBusqueda);
			this.textoParaBuscar.clear();
		}else {
			System.out.println("Seccion selecionada busqueda "+this.seccionSelecionadaBusqueda.getId_seccion());
			
			this.rellenarListaconTemas(accesoBD.buscar_temas_peticion(this.textoParaBuscar.getValue(), this.seccionSelecionadaBusqueda.getId_seccion()));
			this.textoParaBuscar.clear();
		}
	}
	
	private void ordenAntiguedad() {
		System.out.println("Ordenacion");

		if(this.LabelcoleccionActual.getValue().equals("Secciones")) {
			Seccion[] listaNueva=accesoBD.ordenar_secciones_antiguedad();
			rellenarListaconSecciones(listaNueva);
			
		}else {
			//Sino son secciones son Temas.
			Tema[] listaTemasOrdenados=accesoBD.ordenarTemasAntiguedad(this.seccionSelecionadaBusqueda.getId_seccion());
			item_tema_control[] temasEncontrados=new item_tema_control[listaTemasOrdenados.length];
		
			for(int i=0 ; i< listaTemasOrdenados.length; i++) {
				
				//Es false, ya que no lo estamos llamando desde el perfil del usuario.
				
				temasEncontrados[i]=new item_tema_control(listaTemasOrdenados[i],false,null, viaje, accesoBD);
			}
		}
	}
	
	private void iniciarSesion() {
		logearse_control log=new logearse_control(accesoBD);
		//log.iniciar();
		this.viaje.addView("Login",log);
		log.viaje=this.viaje;
		log.viaje.navigateTo("Login");
	}
	
}
