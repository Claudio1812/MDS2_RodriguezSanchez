package com.example.MDS2_RodriguezSanchez;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import paquete1.Bd_Mensaje;
import paquete1.Bd_Tema;
import paquete1.Bd_main;
import paquete1.Seccion;
import paquete1.Tema;
import paquete1.Usuario;
import paquete1.UsuarioDAO;

public class item_secciones_ventana_control extends item_secciones_ventana  implements com.vaadin.navigator.View{

	Label nombreSeccion;
	Label cantidadMegusta;
	Panel dondeSeGuarda;
	Seccion seccionReferencia;
	VerticalLayout listaPadre;
	Tema[] temasSeccion;
	Usuario logeado;
	Navigator viajero;
	Button creacion;
	//lugar principal lo rellenamos en foro registrado.
	foro_registrado_ventana_control lugarPrincipal;
	foro_no_registrado_control  lugarPrincipalNoRegistrado;
	private Bd_main accesoBD;
	
	public item_secciones_ventana_control(Seccion seccion, VerticalLayout listaPadre, Usuario entrada, Navigator entradaViajero, Object lugarProveniente, Bd_main entradaBD) {
		this.accesoBD=entradaBD;
		this.viajero=entradaViajero;
		this.listaPadre=listaPadre;
		this.logeado=entrada;
		
		if(logeado==null) {
			lugarPrincipalNoRegistrado=(foro_no_registrado_control) lugarProveniente;
			lugarPrincipalNoRegistrado.seccionSelecionadaBusqueda=seccion;
		}else {
			lugarPrincipal=(foro_registrado_ventana_control) lugarProveniente;
			lugarPrincipal.seccionActualBusqueda=seccion;
			
			
		}
		
		iniciar(seccion);

		
	}

	public item_secciones_ventana_control() {
		// TODO Auto-generated constructor stub
	}

	public void iniciar(Seccion seciones){
		nombreSeccion=this.label_nombre_seccion;
		nombreSeccion.setCaption(seciones.getTitulo());
		dondeSeGuarda= this.panel_item_seccion;
		seccionReferencia = seciones;
		this.creacion=  this.boton_perfil_creador;
		this.creacion.setCaption(seccionReferencia.getCreada_por().getNombre());
		//dondeSeGuarda.addClickListener(listener)
		
		
		
		
		
		
		
		
		this.creacion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				panel_informacion_user_control panelVisitar=new panel_informacion_user_control(seccionReferencia.getCreada_por(), logeado, viajero, accesoBD);
				viajero.addView("Visita_perfil", panelVisitar);
				viajero.navigateTo("Visita_perfil");
			}
		});
		
		
		
		dondeSeGuarda.addClickListener(new ClickListener() {
				

				@Override
				public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
					// TODO Auto-generated method stub
					Bd_Tema accesoMensajes=new Bd_Tema();
					System.out.println("HOLA estoy en donde se guarda");
					//Los mensajes si se pueden ordenar por valoracion por lo que hacemos visible el boton
					if(logeado==null) {
						
						System.out.println("NO ESTOY LOGEADO");
						
						lugarPrincipalNoRegistrado.rellenarListaconTemas(accesoMensajes.buscar_temas_peticion(null, seccionReferencia.getId_seccion()));
						lugarPrincipalNoRegistrado.seccionSelecionadaBusqueda=seccionReferencia;
						
					}else {
						
						lugarPrincipal.cargarTemasLista(accesoMensajes.buscar_temas_peticion(null,seccionReferencia.getId_seccion()));
						lugarPrincipal.seccionActualBusqueda=seccionReferencia;
						lugarPrincipal.crearTema.setVisible(true);
						lugarPrincipal.Crear_seccion.setVisible(false);
					}
					
					
		
					
					if(logeado!=null) {
						iniciarBotonCreacionRegistrado();
					}
					
					
					
				}
				
			} );
		
	}
	
	
	public void iniciarBotonCreacionRegistrado() {
		
		
		
	}
	
	
	

}
