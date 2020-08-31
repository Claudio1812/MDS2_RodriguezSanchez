package paquete1;


public interface iAdministrador {

	public Notificacion[] InicializarNotificacionesPerfilAdmin(Administrador aAdmin);

	public void ValidarReporte(int aAId_notificacion, int aAId_usuario);

	public boolean darQuitarModeracion(int aAId_usuario);

	public void EliminarModerador(int aAId_usuario);

	public void AgregarModerador(int aAId_usuario);

	public void EliminarSeccion(int aAId_seccion);

	public void BanearUsuario(Usuario aUsuarioABanear, int id_admin);
	
	public boolean comprobarSiUsuarioEsAdmin(Usuario usuario); 
		
	public Notificacion[] devolverNotificacionesReporte();
		
	
}