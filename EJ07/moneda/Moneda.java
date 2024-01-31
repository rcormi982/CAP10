package EJ07.moneda;

public class Moneda {
    private static String[] caras = {"Cara", "Cruz"};
    private static String[] monedas = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", 
                                        "50 céntimos", "1 euro", "2 euros"};
    private String cantidad;
    private String posicion;

    public Moneda(){
        this.posicion = caras[(int)(Math.random()*2)];
        this.cantidad = monedas[(int)(Math.random()*8)];
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.cantidad, this.posicion);
    }
    
    

}
