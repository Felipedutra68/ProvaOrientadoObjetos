package A_EX16;

import EX5_EX9_Eletronicos.*;

/**
 *
 * @author ADM
 */
public class geladeira extends eletronico{
    
    int temperatura;

    public geladeira(String marca, String modelo, boolean ligar, int temperatura) {
        super(marca, modelo, ligar);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
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
