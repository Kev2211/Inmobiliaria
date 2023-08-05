package inmobiliarias;

public class Apartamento {
    private int numeroDeApartamento;
    private int metrosCuadrados;
    private String fechaDeVenta;
    private boolean esGrande;
    
    public Apartamento(int numero, int metros, String fecha) {
        numeroDeApartamento = numero;
        metrosCuadrados = metros;
        fechaDeVenta = fecha;
        
        esGrande = false;
        if (metros >= 50) {
            esGrande = true;
        }
    }
    
    public Apartamento () {
        
    }

    public int getNumeroDeApartamento() {
        return numeroDeApartamento;
    }

    public void setNumeroDeApartamento(int numeroDeApartamento) {
        this.numeroDeApartamento = numeroDeApartamento;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getFechaDeVenta() {
        return fechaDeVenta;
    }

    public void setFechaDeVenta(String fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }
    
    public boolean getEsGrande() {
        return esGrande;
    }
}