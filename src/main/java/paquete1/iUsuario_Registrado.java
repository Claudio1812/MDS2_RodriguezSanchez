package paquete1;


/**
 * Donde hay un [] estab un __ lo he cambiado
 */
public interface iUsuario_Registrado {

	public Media buscar_media_pc();

	public void asignar_media_mensaje(int aAId_Mensaje, Media aAMedia_a_asignar);

	public boolean Crear_Tema(Tema aATemaNuevo);

	public void asignar_media_tema(int aAId_tema, Media aAMedia_a_asignar);

	public Usuario CargarPerfilUsuario(int aAId_usuario);

	public Notificacion[] inicializarNotificaciones(Usuario aUsuario);

	public void AgregarNuevo_Amigo(Usuario aUsuario, Usuario aAmigo);

	public Tema VisitarTema(Notificacion aNotificacion);

	public void archivarNotificacion(Notificacion aNotificacion);

	public void eliminarTema(int aAId_tema);

	/**
	 * Donde hay un [] estab un __ lo he cambiado
	 */
	public Usuario[] buscarAmigosUsuario(Usuario aUsuario);

	public void EliminarAmigo(Usuario aUsuario, Usuario aAmigo);

	public void SolicitarContrasena(int aAId_usuario);

	public void Borrar_Cuenta(int aAId_usuario);

	public void AvisarAdministrador(int aAId_usuario, int aAId_admin);

	public void DarMeGustaTema(Usuario aUsuarioIncio, Tema aTemaGustado);

	public void darMeGusta_Mensaje(Mensaje aAMensaje, Usuario aAUsuario);

	/**
	 * Metodo que nos devuelve los mensajes del propio usuario, los cuales se cargaran al iniciar su perfil.
	 */
	public Mensaje[] inicializarMensajesPropiosPerfil(Usuario aAUsuario);

	public int numeroMensajesTotalesUsuario(Usuario aAUsuario);

	public int cantidadlikeMensaje(Usuario aAUsuario);

	public void Crear_Mensaje(Mensaje aMensajeEntrada);

	public boolean cambiar_contrasena(Usuario aAUsuario, String aAContrasena);

	public void cambiarDescripcion(Usuario aUsuarioCambiar, String aDescripcionNueva);
	
	public void eliminarMensaje(Mensaje mensaje);
	
	public void crear_notificacion(Notificacion notificacion);
	
	public Tema accesoDirectoTema(int idTema);
	
}