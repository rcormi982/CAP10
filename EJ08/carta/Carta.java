package EJ08.carta;

public class Carta {
    private static String[] palo = {"oros", "copas", "espadas", "bastos"};
    private static String[] numero = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

    private String n;
    private String p;

    public Carta(){
        this.n = numero[(int)(Math.random()*10)];
        this.p = palo[(int)(Math.random()*4)];
    }

    public String getN() {
        return n;
    }

    public String getP() {
        return p;
    }
    @Override
    public String toString() {
        return String.format("%s de %s", this.n, this.p);
    }
}

