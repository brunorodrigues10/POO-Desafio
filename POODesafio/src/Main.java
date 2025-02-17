import iphone.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Iphone meuIphone = new Iphone();

        int opcao = -1;

        while(opcao != 0) {
            System.out.println("---Escolha uma opção---");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("---Reproduto Músical---");
                    System.out.println("1 - Tocar Música");
                    System.out.println("2 - Pausar Música");
                    System.out.println("3 - Selecionar Música");

                    int escolherMusica = scanner.nextInt();
                    scanner.nextLine();

                    if (escolherMusica == 1){
                        meuIphone.tocar();
                    }else if(escolherMusica == 2){
                        meuIphone.pausar();
                    }else if(escolherMusica == 3){
                        System.out.println("Escolha a música");
                        String musica = scanner.nextLine();
                        meuIphone.selecionarMusica(musica);
                    }
                    break;

                case 2:
                    System.out.println("---Aparelho Telefônico---");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Atender");
                    System.out.println("3 - Iniciar Correio de Voz");

                    int escolhaTelefone = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaTelefone == 1){
                        System.out.println("Digite o número para ligar");
                        String numero = scanner.nextLine();
                        meuIphone.ligar(numero);
                    }else if(escolhaTelefone == 2){
                        meuIphone.atender();
                    }else if(escolhaTelefone == 3){
                        meuIphone.iniciarCorreioVoz();
                    }
                    break;

                case 3:
                    System.out.println("---Navegador na Internet---");
                    System.out.println("1 - Exibir Página");
                    System.out.println("2 - Adicionar Nova Aba");
                    System.out.println("3 - Atualizar Página");

                    int escolhaNavegador = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaNavegador == 1){
                        System.out.println("Digite a página");
                        String url = scanner.nextLine();
                        meuIphone.exibirPagina(url);
                    } else if (escolhaNavegador == 2){
                        meuIphone.adicionarNovaAba();
                    }else if(escolhaNavegador == 3){
                        meuIphone.atualizarPagina();
                    }
                    break;

                case 0:
                    System.out.println("Desligando Iphone");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }
        }
        scanner.close();
    }
}
