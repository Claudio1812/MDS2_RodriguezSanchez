package paquete1;

public interface iUsuario_NoRegistrado {

	public void ordenarPorPopularidad();

	public boolean Registrarse(Usuario aAUsuarioAregistrar);

	public Mensaje[] selecionar_mensajes_tema(Tema aTema);

	/**
	 * Aqui devolver item_seccion__ relamente quiero devolver secciones, los items los generare luego
	 */
	public Seccion[] buscar_secciones_peticion(String aABuscar);

	/**
	 * Aqui buscaba secciones aun que eran temas relamente
	 */
	public Tema[] buscar_temas_peticion(String aABuscar, int id_seccion);

	public Usuario IniciarSesion(String aAEmail, String aAContrasena);

	public Seccion[] buscar_secciones_foro();
	
	public Seccion[] ordenar_secciones_antiguedad();
	
	public Tema[] ordenarTemasAntiguedad(int id_seccion);

	public Usuario[] usuarioParticipantes(int id_tema);

	
	
}