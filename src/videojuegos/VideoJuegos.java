
package videojuegos;
//nuevo 1n 
import java.util.Date;


public class VideoJuegos {

   private String nombre;
   private int numeroDePersonajes;
   private Date fechaDeDesarrollo;
   private String GeneroDelJuego;
   private Boolean AptoParaMenores;

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
      
    }
    
}
