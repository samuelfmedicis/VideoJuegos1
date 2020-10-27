
package videojuegos;

import java.util.Date;


public class VideoJuegos {

   private String nombre; //Este nos permite ver el nombre del videojuego
   private int numeroDePersonajes; //Este nos permite ver el numero de personajes disponibles en el juego
   private Date fechaDeDesarrollo; //Este nos permite ver la fecha de desarrollo del juego
   private String GeneroDelJuego; //Este nos permite ver el genero del juego
   private Boolean AptoParaMenores; //Este nos permite ver si el juego es apto para menores con true o false
//Aqui empieza el constructor de la clase
   
   private Persona personaje = null;
   private Instalar instalador;

    public Persona getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Persona personaje) {
        this.personaje = personaje;
    }

    public Instalar getInstalador() {
        return instalador;
    }

    public void setInstalador(Instalar instalador) {
        this.instalador = instalador;
    }
   
    public VideoJuegos(String nombre,
            int numeroDePersonajes,
            Date fechaDeDesarrollo,
            String GeneroDelJuego,
            Boolean AptoParaMenores) {
        this.nombre = nombre;
        this.numeroDePersonajes = numeroDePersonajes;
        this.fechaDeDesarrollo = fechaDeDesarrollo;
        this.GeneroDelJuego = GeneroDelJuego;
        this.AptoParaMenores = AptoParaMenores;
        this.instalador = new Instalar(2, 512, "Origin");
    }
   
    //Este método me permite agregar personajes en cantidad de a 1
   public void agregarPersonajes() {
   this.numeroDePersonajes += 1;  
   }
    /**
     Este método me permite eliminar las escenas gráficas del juego y que sea apto
     para menores y cambiar su genero
     * @param nuevoGenero Es el nuevo genero del videojuego
     */
   public void eliminarEscenasGraficas( 
           String nuevoGenero){
   this.AptoParaMenores = true;
   this.GeneroDelJuego = nuevoGenero;
}
//aqui empieza el metodo get set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDePersonajes() {
        return numeroDePersonajes;
    }

    public void setNumeroDePersonajes(int NumeroDePersonajes) {
        this.numeroDePersonajes = NumeroDePersonajes;
    }

    public Date getFechaDeDesarrollo() {
        return fechaDeDesarrollo;
    }

    public void setFechaDeDesarrollo(Date fechaDeDesarrollo) {
        this.fechaDeDesarrollo = fechaDeDesarrollo;
    }

    public String getGeneroDelJuego() {
        return GeneroDelJuego;
    }

    public void setGeneroDelJuego(String GeneroDelJuego) {
        this.GeneroDelJuego = GeneroDelJuego;
    }

    public Boolean getAptoParaMenores() {
        return AptoParaMenores;
    }

    public void setAptoParaMenores(Boolean AptoParaMenores) {
        this.AptoParaMenores = AptoParaMenores;
    }
    
   
   
    public static void main(String[] args) {
      VideoJuegos VideoJuegoUno = new VideoJuegos(
              "Haloon Manituká",
              15,
              new Date (),
              "Acción, Romance, Aventura y drama",
              false);
      
      Mario juegoInstalado = new Mario("Mario", 
              "Bombas", 
              "Samu_234", 
              2000);
      
      VideoJuegoUno.setPersonaje(juegoInstalado);
      
        System.out.println("Nombre del juego:");
        System.out.println(VideoJuegoUno.getPersonaje().getNombre());
        System.out.println("La cantidad de puntos en el juego son:");
        System.out.println(VideoJuegoUno.getPersonaje().getPuntos());
    }
    
}
