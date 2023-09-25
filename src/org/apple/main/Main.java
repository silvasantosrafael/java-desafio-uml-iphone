package org.apple.main;

import org.apple.model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.atender();
        iPhone.ligar("71991972916");
        iPhone.iniciarCorreioVoz();

        iPhone.selecionarMusica("Beetles");
        iPhone.tocar();
        iPhone.pausar();

        iPhone.exibirPagina("www.google.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
