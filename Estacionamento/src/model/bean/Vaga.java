package model.bean;

public class Vaga {
    private int idVaga;
    private int numero;
    private String rua;
    private boolean obliqua;
    
    public int getIdVaga() {
        return idVaga;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public boolean isObliqua() {
        return obliqua;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setObliqua(boolean obliqua) {
        this.obliqua = obliqua;
    }
    
    
}
