package br.com.allan.escrever_leitura.model;

public class Contato {

    public String Id;
    public String nome;
    public String email;
    public String telefone;

    public String separarDadosContato() {

        String contatoSeparado = Id + ";" + nome + ";" + email + ";" + telefone;
        return contatoSeparado;
    }
}
