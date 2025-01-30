package br.com.treinaweb;

import br.com.treinaweb.models.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista(1L, "Maria da Silva", "(11) 99999-9999", "123.123.123-11", "Av Paulista, 1220");

        System.out.println(diarista.getId());
        System.out.println(diarista.getNome());
        System.out.println(diarista.getTelefone());
        System.out.println(diarista.getCpf());
        System.out.println(diarista.getEndereco());
    }
}