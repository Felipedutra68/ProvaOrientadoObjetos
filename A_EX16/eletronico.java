package A_EX16;

import EX5_EX9_Eletronicos.*;

/**
 *
 * @author ADM
 */
public class eletronico {

    String marca;
    String modelo;
    boolean ligar;

    public eletronico(String marca, String modelo, boolean ligar) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligar = ligar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }
    
    
    
    
}
