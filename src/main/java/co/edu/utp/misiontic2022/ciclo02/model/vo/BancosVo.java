package co.edu.utp.misiontic2022.ciclo02.model.vo;

public class BancosVo {

    private String nombreBanco;

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return nombreBanco;
    }

}
