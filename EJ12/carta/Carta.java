package EJ12.carta;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
    private static String[] paloArray = {"oros", "copas", "espadas", "bastos"};
    private static String[] numeroArray = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

    private Integer numero;
    private String palo;

    public Carta(){
        this.numero = (int)(Math.random()*10);
        this.palo = paloArray[(int)(Math.random()*4)];
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }
    public String getFigura() {
        return numeroArray[numero];
    }
    @Override
    public String toString() {
        return String.format("%s de %s", numeroArray[this.numero], this.palo);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        } else {
            return palo.compareTo(c.getPalo());
        }
    }
}

