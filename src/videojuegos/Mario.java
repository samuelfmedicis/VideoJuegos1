package videojuegos;

public class Mario extends Persona{
    private String personaje;
    private String modoDeJuego;

    public Mario(String personaje, String modoDeJuego, String nombre, int puntos) {
        super(nombre, puntos);
        this.personaje = personaje;
        this.modoDeJuego = modoDeJuego;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getModoDeJuego() {
        return modoDeJuego;
    }

    public void setModoDeJuego(String modoDeJuego) {
        this.modoDeJuego = modoDeJuego;
    }
    
    
}
