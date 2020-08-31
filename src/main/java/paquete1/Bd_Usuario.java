package paquete1;

import org.orm.PersistentException;

public class Bd_Usuario {
	public Bd_main _unnamed_Bd_main_;
	public Usuario _usuario1;
	public Bd_main _unnamed_Bd_main_2;
	public Usuario _usuario;

	public Usuario CargarPerfilUsuario(int aAId_usuario) {
		
		Usuario devolver=null;
		
		try {
			devolver= UsuarioDAO.getUsuarioByORMID(aAId_usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion al buscar usuario idnicando id");
		}
		return devolver;
		
	}

	public boolean Registrarse(Usuario aAUsuarioAregistrar) {
		throw new UnsupportedOperationException();
	}

	public void AgregarNuevo_Amigo(Usuario aUsuario, Usuario aAmigo) {
		try {
			
			aUsuario.amigo_de.add(aAmigo);
			UsuarioDAO.save(aUsuario);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void BanearUsuario(Usuario aUsuarioABanear, int id_admin) {
		
		try {
			aUsuarioABanear.setBaneado_por(AdministradorDAO.getAdministradorByORMID(id_admin));
			UsuarioDAO.save(aUsuarioABanear);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void InicializarPerfilAdmin(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] buscarAmigosUsuario(Usuario aUsuario) {
		Usuario[] devolver;
		
		
		devolver=aUsuario.amigo_de.toArray();
		return devolver;
		
	}

	public void EliminarAmigo(int aAId_usuario_amigo, int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void SolicitarContrasena(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void Borrar_cuenta(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario iniciarSesion(String aAEmail, String aAContrasena) {
		Usuario usuario = null;
	
	try {
		 usuario= UsuarioDAO.loadUsuarioByQuery("Usuario.email='"+aAEmail+"'", null) ;
		
		if(usuario!=null) {
			
			if (!usuario.getContrasena().equals(aAContrasena)){
				usuario=null; //Si la contrasena que ha introducido no es correcta.
			}
		}
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("A saltado excepcion en Bd_Usuario");
		System.out.println(e.getMessage());
		System.out.println("A saltado excepcion en Bd_Usuario");
	}
		
	return usuario;
		
	}

	public void eliminarTema(Object aAId_tema) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_contrasena(Usuario aAUsuario, String aAContrasena) {
		
		aAUsuario.setContrasena(aAContrasena);
		try {
			UsuarioDAO.save(aAUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Excepcion al cambiar contrasena");
			return false;
		}
		return true;
	}

	public void cambiarDescripcion(Usuario aUsuarioCambiar, String aDescripcionNueva) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAmigo(Usuario aUsuario, Usuario aAmigo) {
		throw new UnsupportedOperationException();
	}
}