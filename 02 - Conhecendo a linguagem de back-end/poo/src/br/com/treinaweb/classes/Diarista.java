package br.com.treinaweb.classes;

public class Diarista extends Pessoa {

    private String chavePix;

    public Diarista(String nome) {
        super(nome, null, null);
    }

    public Diarista(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }

    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para cliente " + nomeCliente);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
    }

    @Override
    public void depositar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual + valor;
        this.setSaldo(novoSaldo);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((chavePix == null) ? 0 : chavePix.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Diarista other = (Diarista) obj;
        if (chavePix == null) {
            if (other.chavePix != null)
                return false;
        } else if (!chavePix.equals(other.chavePix))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Diarista: " + this.getNome();
    }

}