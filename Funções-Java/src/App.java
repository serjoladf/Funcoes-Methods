import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) throws Exception {

        // ao utilizar este tipo de varivael o sistema aceita somente de -128 negativo a 127 positivo
        byte variavelByte = 127;
        // short -32768 a 32767
        short variavelShort = 3276;
        // char o a 65535
        char variavelChar = 65535;
        // int -2.147.483.648 a 2.147.483.647
        int variavelInt = 2147483647;
        // O valor máximo que um long pode ter no Java é 2 elevado a 63 -1. comentado abaixo e ainda é maior
        // long variavelLong = 200000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

        // int[] numer = {1,2,3,4,5,6,7,8}; formas de ecrever arreys
        // int []numer2 = {1,2,3,4,5,6,7};
        // int number3[] = {1,2,3,4,5,67,8};
        // int number4[] = new int[10];
        // int[] number5 = new int[10];

        // Metódo JoptionPane.ShowInputDialog
        // Atalho para System.out.println = SOUT IntelliJ e VsCode
        // Atalho para System.out.printf = SOUf IntelliJ e VsCode
        // Atalho para System.out.println = Sysout Eclipse e VsCode
        // O Prompt de Comando se tornar ambiente Java ao executar JSshel

        // Trabalhando com Data e Hora no Java
        LocalDate hoje = LocalDate.now(); // Uma criação de objeto para data
        LocalDateTime hojeHora = LocalDateTime.now(); // Uma criação de objeto para data e Hora
        System.out.println(hoje); // Mostra a Data de Hoje
        System.out.println(hojeHora); // Mostra a Data de Hoje e hora atual

        Locale brasil = new Locale("pt","BR");
        System.out.println(hoje.getChronology().dateNow()); // Mostra a Data de Hoje
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // Mostra o dia por extenso
        System.out.println(hoje.getMonth().getDisplayName(TextStyle.FULL, brasil));// Mostra o Mês por extenso
        System.out.println(hoje.getYear()-42); // Dá pra fazer operação matemática
        System.out.println(hoje.getYear()); // retorna o Ano vigente

        // Exemplo de se utilizando HORA
        String saudacao;
        String nome5 = "Sérgio";

        if(hojeHora.getHour() >= 8 && hojeHora.getHour() < 12) {
            saudacao = "Bom dia";
        }
        else if(hojeHora.getHour() >= 12 && hojeHora.getHour() < 18){
            saudacao = "Boa Tarde";
        }
        else{
            saudacao = "Boa Noite";
        }
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(saudacao); // Impressão e impressão da Saudação e utilisando o PRINTF abaixo
        System.out.printf("Olá, %s hoje é %s ,%s.",nome5,diaDaSemana,saudacao);


        // -----------------------------------------------------------------------------------------
        String nome2 = "Sergio";
        double peso;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da pessoa"));

        // podemos utilizar tbm para reveber dados o
        String nome;
        nome = JOptionPane.showInputDialog("Informe o nome da pessoa");

        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));

        System.out.println(nome2.equals(nome)+" Comparando");
        System.out.println(nome2.equalsIgnoreCase(nome)+" Ignorando"); // Serve para comparar e não levar em conta Caixa alta ou baixa

        // System.out.println(idade);
        // System.out.println(nome+" sua idade é "+ idade);
        //JOptionPane.showInternalMessageDialog(null,nome+" sua idade é "+ idade+" anoos"); // forma de imprimir na caxinha o SHOW é diferente
        // JOptionPane.showMessageDialog(null,nome+" sua idade é "+ idade+" anos"); // forma de imprimir na caxinha o SHOW é diferente
        // (como JOptionPane.INFORMATION_MESSAGE, JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE)
        JOptionPane.showMessageDialog(null,nome+" sua idade é "+ idade+" anos","vc esta velho porra",JOptionPane.INFORMATION_MESSAGE); // forma de imprimir na caxinha o SHOW é diferente

        System.out.println(nome);
        System.out.println(idade);
        System.out.println("Hello, World!");


        String y = ("Serjola");
        String x = (" Hello, World!, e ai Serjola tudo bem.");
        System.out.println(x.length()); // Conta a quantidade de caractere de uma String
        System.out.println(x.contains("llo")); // verifica se há a palavra igual ou parte da palavra na String X
        System.out.println(x.indexOf("ld")); // verifica onde de caracter esta a palavra ou parte na String X
        System.out.println(x.lastIndexOf("bem"));
        System.out.println(x.indexOf("ld"));
        System.out.println(x.toLowerCase()); // Converte a String para caixa baixa
        System.out.println(x.toUpperCase()); // Converte a String para caixa Alta
        System.out.println(x.trim()); // Tira espaços desnecessário do inicio
        System.out.println(x.substring(16)); // Rescreva a String a partir do da quantidade de numero dado
        System.err.println(x.equals("Serjola")); // Compara a palavra com a String - AQUI FALSO
        System.err.println(y.equals("Serjola")); // Compara a palavra com a String - AQUI Verdadeiro

        // Metódo Scanner

        Scanner sc = new Scanner(System.in); // Recebe dados de Fora
        String sobrenome;
        System.out.println("Digite o sobrenome da pessoa");
        sobrenome = sc.nextLine(); // forma de entrada com Scanner

        // Conicionais
        int numb1 = 2, numb2 = 3;
        // if, else if, else
        if(numb1 > numb2){
            System.err.println("legal numb1 é maior que numb2");
        }else if(numb1 == numb2){
            System.err.println("legal numb1 é igual que numb2");
        }else {
            System.err.println("legal, numb1 é menor que numb2 ");
        }


        // Operadores Ternários
        System.out.println((numb1 > numb2) ? "lá éle misera" : "não peste");

        String qualquer =  ((numb1 > numb2) ? "lá éle misera" : "não peste");
        System.out.println(qualquer);

        // switch comportamento
        System.out.println("Digite um numero na switch 1");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 :
                System.err.println("caso 1 primeira opção");
                break;
            case 2 :
                System.err.println("caso 2 primeira opção");
                break;
            default:
                throw new IllegalArgumentException("Opção inválida"+ opcao + "redigite");
        }

        System.out.println("Digite um numero na switch 2");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 :
                System.err.println("caso 1");
                break;
            case 2 :
                System.err.println("caso 2");
                break;
            default:
                throw new AssertionError("err");
        }
        // laço FOR

        for(int i = 1; i <= 3; i++){
            System.err.println(" for "+ i + "ª vez");
        }
        // Quebrando um laço de Repetição
        for(int i = 1; i <= 50 ; i++){
            System.err.println(" Testando for "+ i + "ª vez");

            if(i == 7){  // Condição para parar o Loop utilizando BREAK;
                break;
            }
        }
        // Array de Strings contendo os nomes dos meses
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Laço for-each para percorrer e imprimir cada mês
        for (String mes : meses) {
            System.out.println("Mês: " + mes);
        }
        // Forma toString para impressão
        System.out.println(Arrays.toString(meses)); // passar o nome do arrays

        // Wlhile e DO while
        int number = 0;
        do{
            System.out.println("Digite um numero DO While 1 para sair");
            number = sc.nextInt();

        }while(number != 1); // Se o numero for igual a 1 sai do loop tem que ser deiferente de 1

        // Wlhile e DO while
        number = 0;

        do{
            System.out.println("Digite um numero DO While "+ number+ " Vez");
            number++;
        }while(number < 5); // (ENQUANTO i FOR MENOR QUE 5) o Loop não para

        int i = 0;

        while(i < 3){ // Significa: (ENQUANTO i FOR MENOR QUE 3) Neste caso o Lopp só termina quiando a condição é verdadeira.
            System.out.println("Digite um numero somente while, digitar 3 numeros");
            number = sc.nextInt();
            i++;
        }
        sc.close(); // Fechamenbto do Scanner

        // Dica 1000
        // Quando você usa sc.nextDouble() para ler um valor numérico e depois tenta ler uma linha com sc.nextLine(),
        //  você pode enfrentar problemas. O nextDouble() não consome a quebra de linha após o número, então o nextLine()
        //  imediatamente após pode ler uma linha em branco.
        // Solução: Use >> sc.nextLine() << após sc.nextDouble() para consumir a quebra de linha restante,
        // ou leia todas as entradas usando sc.nextLine() e faça a conversão manualmente

        int n1 = 5;
        int n2 = 2;
        int divisao = n1 / n2; // O JAva não transforma em um numero deciamal
        float div2 = n1 / n2; // neste caso o Java não entende o numero deciamal

        System.out.println(divisao);
        System.out.println(div2);
        div2 = (float) n1 / n2; // Ja neste caso apos colocar o (float) antes da operação ele entende o numero deciamal
        System.out.println(div2);

        // Dicas de Herança

       // @Override em Heranão serve para modificar uma propriedade ou um metodo personalizando
   
    }

    }
}
