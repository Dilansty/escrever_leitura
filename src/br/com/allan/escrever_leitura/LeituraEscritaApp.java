package br.com.allan.escrever_leitura.repository.ContatoRepository;

import br.com.allan.escrever_leitura.model.Contato;

import br.com.allan.escrever_leitura.repository.ContatoRepository;

public class LeituraEscritaApp {

    public static void main(String[] args) {
        System.out.println("Leitura Escrita App");

        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.gravar();
    }
}
