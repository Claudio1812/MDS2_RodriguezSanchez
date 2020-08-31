package com.example.MDS2_RodriguezSanchez;

import javax.servlet.annotation.WebServlet;

import org.orm.PersistentException;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.NavigationStateManager;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import paquete1.Bd_Mensaje;
import paquete1.Bd_Usuario;
import paquete1.Bd_main;
import paquete1.Mensaje;
import paquete1.Usuario;
import paquete1.UsuarioDAO;

import com.vaadin.ui.Button.ClickEvent;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@PreserveOnRefresh
public class MyUI extends UI {

	private Navigator viaje;
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {     
    	Bd_main nuevo=new Bd_main();
         viaje=new Navigator(this,this);
        foro_no_registrado_control hola=new foro_no_registrado_control(nuevo);

        
       hola.viaje=viaje;
       hola.iniciar();
      
       
       //Bd_Usuario prubea=new Bd_Usuario();
       //prubea.AgregarNuevo_Amigo(0, 0);
       
      /* hola.iniciar_sesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				logearse_control login=new logearse_control();
				login.iniciar();
				
				login.viaje=viaje;
				viaje.addView("login", login);
				viaje.navigateTo("login");
				
				
				Usuario user=new Usuario();
				user.setApellidos("Prueba");
				user.setNombre("Prueba");
				user.setContrasena("Prueba");
				user.setEmail("Prueba");
				
				try {
					UsuarioDAO.save(user);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error al insertar en base datos prueba");
				}
			}
		} );*/
        
        
        
        //Tenemos que incluir todo lo que queramos en la clase antes de añadirla como vista sino, no se guarda el codigo de configuracion de depsues
        
       
        
        //No se por que he teniado que hacer que la clase que hereda de un vertical layout tenga que implementar view, pero bueno.

		viaje.addView("Foro_sinRegistrar", hola);
        viaje.navigateTo("Foro_sinRegistrar");
        
        hola.setNavigator(viaje);

     
    }

    @Override
    protected void refresh(VaadinRequest request) {
        super.refresh(request);
        // TODO do your thing here
        
        this.viaje.navigateTo(this.viaje.getCurrentNavigationState());
        
    }
    
    
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
