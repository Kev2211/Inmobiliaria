
package inmobiliarias;

public class BloqueDeVenta {
    private Apartamento apartamentos[];
    private int cantidad;
    
    public BloqueDeVenta() {
        apartamentos = new Apartamento[60];
        for (int i = 0; i < 60; i++) {
            apartamentos[i] = new Apartamento();
        }
        cantidad = 0;
    }
    
    public void agregarApartamento(Apartamento apt) {
        apartamentos[cantidad] = apt;
        cantidad++;
    }
    
    public int cantidadPequenos() {
        int n = 0;
        for (int i = 0; i < cantidad; i++) {
            if (!apartamentos[i].getEsGrande()) // si el apartamento NO es grande
            {
                n++;
            }
        }
        return n;
    }
    
    public int metrosCuadradosTotalPequenos() {
        int mct = 0;
        for (int i = 0; i <= cantidad; i++) {
            if (!apartamentos[i].getEsGrande()) // si el apartamento NO es grande
            {
                mct += apartamentos[i].getMetrosCuadrados();
            }
        }
        return mct;
    }
    
    public double metrosCuadradosPromedioPequenos() {
        return (double)metrosCuadradosTotalPequenos()/(double)cantidadPequenos();
    }
    
    public int cantidadGrandes() {
        int n = 0;
        for (int i = 0; i <= cantidad; i++) {
            if (apartamentos[i].getEsGrande()) // si el apartamento es grande
            {
                n++;
            }
        }
        return n;
    }
    
    public int metrosCuadradosTotalGrandes() {
        int mct = 0;
        for (int i = 0; i <= cantidad; i++) {
            if (apartamentos[i].getEsGrande()) // si el apartamento es grande
            {
                mct += apartamentos[i].getMetrosCuadrados();
            }
        }
        return mct;
    }
    
    public double metrosCuadradosPromedioGrandes() {
        return (double)metrosCuadradosTotalGrandes()/(double)cantidadGrandes();
    }
    
    public int precioDeVenta() {
        int mct = 0;
        for (int i = 0; i <= cantidad; i++) {
            mct += apartamentos[i].getMetrosCuadrados();
        }
        return mct*2500000;
    }
}

