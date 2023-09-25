package org.apple.model;

import org.apple.interfaces.AparelhoTelefonico;
import org.apple.interfaces.NavegadorInternet;
import org.apple.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciou correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo site " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionou nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizou página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausou música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionou a música " + musica);
    }
}
