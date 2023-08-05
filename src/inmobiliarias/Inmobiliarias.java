package inmobiliarias;

public class Inmobiliarias {

    public static void main(String[] args) {
          Inmobiliaria inmoMauricio = new Inmobiliaria();
        
        inmoMauricio.agregarBloqueDeVenta();
        
        Apartamento apt1 = new Apartamento(1, 30, "Septiembre 7, 2021"); // bloque 0
        Apartamento apt2 = new Apartamento(2, 40, "Enero 8, 2022");
        Apartamento apt3 = new Apartamento(3, 50, "Octubre 12, 2021");
        Apartamento apt4 = new Apartamento(4, 60, "Enero 21, 2022");
        Apartamento apt5 = new Apartamento(5, 70, "febrero 28, 2021");
        
        Apartamento apt6 = new Apartamento(1, 150, "Enero 8, 2022"); // bloque 1
        Apartamento apt7 = new Apartamento(2, 150, "Octubre 12, 2021");
        Apartamento apt8 = new Apartamento(3, 40, "Enero 21, 2022");
        Apartamento apt9 = new Apartamento(4, 40, "febrero 28, 2021");
        
        inmoMauricio.registrarApartamento(apt1, 0);
        inmoMauricio.registrarApartamento(apt2, 0);
        inmoMauricio.registrarApartamento(apt3, 0);
        inmoMauricio.registrarApartamento(apt4, 0);
        inmoMauricio.registrarApartamento(apt5, 0);
        
        BloqueDeVenta blq1 = new BloqueDeVenta();
        
        blq1.agregarApartamento(apt6);
        blq1.agregarApartamento(apt7);
        blq1.agregarApartamento(apt8);
        blq1.agregarApartamento(apt9);
        
        inmoMauricio.agregarBloqueDeVenta(blq1);
        
        inmoMauricio.mostrarInforme(); 

        
    }
    
}
