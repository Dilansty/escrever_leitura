package br.com.allan.escrever_leitura.repository;

import br.com.allan.escrever_leitura.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public static Contato contato;
    private  Path arquivo = Paths.get("/Users/25203610/arquivos/dados.csv");

    public void gravar() {

        try {
            Files.writeString(arquivo,contato.separarDadosContato(), StandardOpenOption.APPEND);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();

        }
    }
    public void exibirContatos(){

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for (String linha : linhas) {
                String[] linhaSplit = linha.split(";");
                System.out.println("NOME: " + linhaSplit[1]);
                System.out.println("EMAIL: " + linhaSplit[2]);
                System.out.println("TELEFONE: " + linhaSplit[3]);
                System.out.println("---------------------------------");
        }
//           List<String> linhas = Files.readAllLines(arquivo);
//           int contador = 0;
//           while(contador < linhas.size());
//            System.out.println(linhas.get(contador));
//           contador++;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }


