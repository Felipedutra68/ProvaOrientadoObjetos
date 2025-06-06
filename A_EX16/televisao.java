package A_EX16;

import EX5_EX9_Eletronicos.*;

/**
 *
 * @author ADM
 */
public class televisao extends eletronico{
    
    int canal;
    int volume;

    public televisao(String marca, String modelo, boolean ligar, int canal,int volume ) {
        super(marca, modelo, ligar);
        this.canal = canal;
          this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
