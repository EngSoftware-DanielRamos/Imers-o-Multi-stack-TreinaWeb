package br.com.treinaweb.classes;

public class Atendimento {

    private String data;
    
    private int horas;

    private Cliente cliente;

    private Diarista diarista;

    public void setHoras(int horas) {
        if (horas < 1 || horas > 12) {
            System.out.println("A quantidade de horas de um atendimento não pode ser menor que 1 e nem maior que 12");
        } else {
            this.horas = horas;
        }
    }

    public int getHoras() {
        return horas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Diarista getDiarista() {
        return diarista;
    }

    public void setDiarista(Diarista diarista) {
        this.diarista = diarista;
    }

}
