package videojuegos;

class Instalar {
    private int horas;
    private int peso;
    private String origen;

    public Instalar(int horas, int peso, String origen) {
        this.horas = horas;
        this.peso = peso;
        this.origen = origen;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
}
