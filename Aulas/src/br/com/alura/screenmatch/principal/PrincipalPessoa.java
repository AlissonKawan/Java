package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Pessoa;
import com.google.gson.Gson;

public class PrincipalPessoa {
    public static void main(String[] args) {
        String json = "{ \"nome\": \"Alisson\", \"idade\": 22, \"cidade\": \"São Paulo\" }";
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa.nome());
        System.out.println(pessoa.idade());
        System.out.println(pessoa.cidade());
    }
}
