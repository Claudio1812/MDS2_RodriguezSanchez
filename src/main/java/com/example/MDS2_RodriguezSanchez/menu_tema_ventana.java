package com.example.MDS2_RodriguezSanchez;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class menu_tema_ventana extends VerticalLayout {
	protected Label label_nombre_tema;
	protected TextArea descripcion_tema;
	protected Panel panel_ficha_usuario;
	protected Image imagen_loegado;
	protected Label label_nombre_logeado;
	protected FormLayout form_layout_aumento;
	protected Button boton_volver;
	protected Button boton_responder_tema;
	protected VerticalLayout lista_contenedor;
	protected VerticalLayout lista_mensajes;

	public menu_tema_ventana() {
		Design.read(this);
	}
}
