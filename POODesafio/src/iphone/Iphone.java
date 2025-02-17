package iphone;

import aparelhotelefonico.AparelhoTelefonico;
import navegadornainternet.NavegadorNaInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    //-------------------Reprodutor Musical---------------------------
    @Override
    public void tocar() {
        System.out.println("Tocando a Música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a Música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a Música " + musica);
    }

    //-------------------Aparelho Telefônico---------------------------

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //-------------------Navegador na Internet---------------------------

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}