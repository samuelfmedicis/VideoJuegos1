package videojuegos;

import java.util.Date;

public class Zelda extends VideoJuegos{
    private String username;
    private int numeroDeMonedas;
    
    public Zelda(String nombre, 
            int numeroDePersonajes, 
            Date fechaDeDesarrollo, 
            String GeneroDelJuego, 
            Boolean AptoParaMenores){
        super(nombre, 
                numeroDePersonajes, 
                fechaDeDesarrollo, 
                GeneroDelJuego, 
                AptoParaMenores);
    }
    
}
