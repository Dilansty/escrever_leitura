package br.com.allan.escrever_leitura;

import br.com.allan.escrever_leitura.model.Contato;

import br.com.allan.escrever_leitura.repository.ContatoRepository;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class LeituraEscritaApp {

    public static void main(String[] args) {

            System.out.println("Leitura Escrita App");
            Scanner leitor = new Scanner(System.in);

            Contato contato = new Contato();

            System.out.println("digite o nome do contato:");
            contato.nome = "";
            contato.nome = leitor.next();
            System.out.println("digite o email do contato:");
            contato.email = "";
            contato.email = leitor.next();
            System.out.println("digite o telefone do contato:");
            contato.telefone = "";
            contato.telefone = leitor.next();
            contato.Id = UUID.randomUUID().toString();

            ContatoRepository contatoRepository = new ContatoRepository();
            ContatoRepository.contato = contato;
            contatoRepository.gravar();
            contatoRepository.exibirContatos();

    }

}
