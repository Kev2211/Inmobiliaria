/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliarias;

public class Inmobiliaria {
    private BloqueDeVenta bloquesDeVenta[];
    private int cantidad;
    
    public Inmobiliaria() {
        bloquesDeVenta = new BloqueDeVenta[12];
        cantidad = 0;
    }
    
    public void agregarBloqueDeVenta(BloqueDeVenta bdv) {
        bloquesDeVenta[cantidad] = bdv;
        cantidad++;
    }
    
    public void agregarBloqueDeVenta() { // bloque de venta vacio
        bloquesDeVenta[cantidad] = new BloqueDeVenta();
        cantidad++;
    }
    
    public void registrarApartamento(Apartamento apt, int numeroDeBloque) {
        bloquesDeVenta[numeroDeBloque].agregarApartamento(apt);
    }
    
    public void mostrarInforme() {
        for (int i = 0 ; i < cantidad; i++) {
            System.out.println("-------------------");
            System.out.println("BLoque de venta # "+i);
            
            // grandes
            System.out.print(  "Metros cuadrados promedio de " + bloquesDeVenta[i].cantidadGrandes() + " apartamentos grandes: " + bloquesDeVenta[i].metrosCuadradosPromedioGrandes());
            System.out.println(", total de metros cuadrados: " + bloquesDeVenta[i].metrosCuadradosTotalGrandes());
            
            // pequenos
            System.out.print(  "Metros cuadrados promedio de " + bloquesDeVenta[i].cantidadPequenos() + " apartamentos pequenos: " + bloquesDeVenta[i].metrosCuadradosPromedioPequenos());
            System.out.println(", total de metros cuadrados: " + bloquesDeVenta[i].metrosCuadradosTotalPequenos());
            
            System.out.println("Costo Total: " + bloquesDeVenta[i].precioDeVenta());
        }
    }
}
