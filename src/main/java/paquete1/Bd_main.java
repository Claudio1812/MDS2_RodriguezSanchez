package paquete1;

public class Bd_main implements iUsuario_Registrado, iUsuario_NoRegistrado, iAdministrador, iModerador, iFuncionalidad_compartida_Ad_Moderador {
	public Bd_Usuario _unnamed_Bd_Usuario_;
	public Bd_Moderador _unnamed_Bd_Moderador_;
	public Bd_Mensaje _unnamed_Bd_Mensaje_;
	public Bd_Tema _unnamed_Bd_Tema_;
	public Bd_Administrador _unnamed_Bd_Administrador_;
	public Bd_Notificacion _unnamed_Bd_Notificacion_;
	public Bd_seccion _unnamed_Bd_seccion_;
	public Bd_Usuario _unnamed_Bd_Usuario_2;
	public Bd_Moderador _unnamed_Bd_Moderador_2;
	public Bd_Mensaje _unnamed_Bd_Mensaje_2;
	public Bd_Tema _unnamed_Bd_Tema_2;
	public Bd_Administrador _unnamed_Bd_Administrador_2;
	public Bd_Notificacion _unnamed_Bd_Notificacion_2;
	public Bd_seccion _unnamed_Bd_seccion_2;

	
	
	public Bd_main() {
		
		
		
		 _unnamed_Bd_Usuario_=new Bd_Usuario();
		  _unnamed_Bd_Mensaje_=new Bd_Mensaje();
		  _unnamed_Bd_Tema_=new Bd_Tema();
		  _unnamed_Bd_Administrador_=new Bd_Administrador();
		  _unnamed_Bd_Notificacion_=new Bd_Notificacion();
		  _unnamed_Bd_seccion_= new Bd_seccion();
	}

	public Media buscar_media_pc() {
		throw new UnsupportedOperationException();
	}

	public void asignar_media_mensaje(int aAId_Mensaje, Media aAMedia_a_asignar) {
		throw new UnsupportedOperationException();
	}

	public boolean Crear_Tema(Tema aATemaNuevo) {
		return _unnamed_Bd_Tema_.Crear_Tema(aATemaNuevo);

	}

	public void asignar_media_tema(int aAId_tema, Media aAMedia_a_asignar) {
		throw new UnsupportedOperationException();
	}

	public Usuario CargarPerfilUsuario(int aAId_usuario) {
		
		
		return _unnamed_Bd_Usuario_.CargarPerfilUsuario(aAId_usuario);
	}

	public Notificacion[] inicializarNotificaciones(Usuario aUsuario) {
		return _unnamed_Bd_Notificacion_.inicualizarNotificaciones(aUsuario);
		
	}

	public void AgregarNuevo_Amigo(Usuario aUsuario, Usuario aAmigo) {
		_unnamed_Bd_Usuario_.AgregarNuevo_Amigo(aUsuario, aAmigo);
	}

	public Tema VisitarTema(Notificacion aNotificacion) {
		throw new UnsupportedOperationException();
	}

	public void archivarNotificacion(Notificacion aNotificacion) {
		
		_unnamed_Bd_Notificacion_.archivarNotificacion(aNotificacion);
		
	}

	public void eliminarTema(int aAId_tema) {
		_unnamed_Bd_Tema_.eliminarTema(aAId_tema);
	}

	/**
	 * Donde hay un [] estab un __ lo he cambiado
	 */
	public Usuario[] buscarAmigosUsuario(Usuario aUsuario) {
		return _unnamed_Bd_Usuario_.buscarAmigosUsuario(aUsuario);
	}

	public void EliminarAmigo(Usuario aUsuario, Usuario aAmigo) {
		throw new UnsupportedOperationException();
	}

	public void SolicitarContrasena(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void Borrar_Cuenta(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void AvisarAdministrador(int aAId_usuario, int aAId_admin) {
		throw new UnsupportedOperationException();
	}

	public void DarMeGustaTema(Usuario aUsuarioIncio, Tema aTemaGustado) {
		throw new UnsupportedOperationException();
	}

	public void darMeGusta_Mensaje(Mensaje aAMensaje, Usuario aAUsuario) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo que nos devuelve los mensajes del propio usuario, los cuales se cargaran al iniciar su perfil.
	 */
	public Mensaje[] inicializarMensajesPropiosPerfil(Usuario aAUsuario) {
		return _unnamed_Bd_Mensaje_.inicializarMensajesPropiosPerfil(aAUsuario);
	}

	public int numeroMensajesTotalesUsuario(Usuario aAUsuario) {
		
		
		
		return _unnamed_Bd_Mensaje_.numeroMensajesTotalesUsuario(aAUsuario);
				
	}

	public int cantidadlikeMensaje(Usuario aAUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Mensaje(Mensaje aMensajeEntrada) {
		_unnamed_Bd_Mensaje_.Crear_mensaje(aMensajeEntrada);
	}

	public boolean cambiar_contrasena(Usuario aAUsuario, String aAContrasena) {
		return _unnamed_Bd_Usuario_.cambiar_contrasena(aAUsuario, aAContrasena);
	}

	public void cambiarDescripcion(Usuario aUsuarioCambiar, String aDescripcionNueva) {
		throw new UnsupportedOperationException();
	}

	public void ordenarPorPopularidad() {
		throw new UnsupportedOperationException();
	}

	public boolean Registrarse(Usuario aAUsuarioAregistrar) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] selecionar_mensajes_tema(Tema aTema) {
		return _unnamed_Bd_Mensaje_.selecionar_mensajes_tema(aTema);
		
	}

	/**
	 * Aqui devolver item_seccion__ relamente quiero devolver secciones, los items los generare luego
	 */
	public Seccion[] buscar_secciones_peticion(String aABuscar) {
		return _unnamed_Bd_seccion_.buscar_secciones_peticion(aABuscar);
		
	}

	/**
	 * Aqui buscaba secciones aun que eran temas relamente
	 */
	
	public Tema[] buscar_temas_peticion(String aABuscar, int id_seccion) {
		return _unnamed_Bd_Tema_.buscar_temas_peticion(aABuscar, id_seccion);
	}

	public Usuario IniciarSesion(String aAEmail, String aAContrasena) {
		return _unnamed_Bd_Usuario_.iniciarSesion(aAEmail, aAContrasena);
		
	}

	public Seccion[] buscar_secciones_foro() {
		
		return _unnamed_Bd_seccion_.cargar_SeccionesInicio();
	}

	public Notificacion[] InicializarNotificacionesPerfilAdmin(Administrador aAdmin) {
		throw new UnsupportedOperationException();
	}

	public void ValidarReporte(int aAId_notificacion, int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public boolean darQuitarModeracion(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void EliminarModerador(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void AgregarModerador(int aAId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void EliminarSeccion(int aAId_seccion) {
		throw new UnsupportedOperationException();
	}

	public void BanearUsuario(Usuario aUsuarioABanear, int id_admin) {
		 _unnamed_Bd_Usuario_.BanearUsuario(aUsuarioABanear, id_admin);
	}

	public void CrearSeccion(Seccion aParameter) {
		_unnamed_Bd_seccion_.CrearSeccion(aParameter);
	}

	public void Crear_seccion(int aAId_seccion, int aACreada_por, String aAFecha_creacion, String aATitulo, String aADescripcion) {
		throw new UnsupportedOperationException();
	}
	
	public boolean comprobarSiUsuarioEsAdmin(Usuario usuario) {
		
		return _unnamed_Bd_Administrador_.ComprobarSiUserEsAdmin(usuario);
	}

	@Override
	public void eliminarMensaje(Mensaje mensaje) {
		
		_unnamed_Bd_Mensaje_.eliminarMensaje(mensaje);
		
	}

	@Override
	public void crear_notificacion(Notificacion notificacion) {
		_unnamed_Bd_Notificacion_.crear_notificacion(notificacion);
		
	}

	@Override
	public Seccion[] ordenar_secciones_antiguedad() {
		return _unnamed_Bd_seccion_.ordenar_secciones_antiguedad();

	}

	@Override
	public Tema[] ordenarTemasAntiguedad(int id_seccion) {
		// TODO Auto-generated method stub
		return _unnamed_Bd_Tema_.ordenarTemasAntiguedad(id_seccion);
		
	}

	public Notificacion[] devolverNotificacionesReporte() {
		return _unnamed_Bd_Notificacion_.devolverNotificacionesReporte();
	}

	@Override
	public Tema accesoDirectoTema(int idTema) {
		return _unnamed_Bd_Tema_.accesoDirectoTema(idTema);
	}

	@Override
	public Usuario[] usuarioParticipantes(int id_tema) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * 
		
	 */
	
}