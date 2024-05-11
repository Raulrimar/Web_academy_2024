import java.util.Scanner;

public class sorveteria{
    public static void main(String[] args) throws Exception{
        System.out.println("Bem vindo a casa do Sorvete");
        System.out.println("Escolha os sabores");
        System.out.println("1 - Morango\n");
        System.out.println("2 - Chocolate\n");
        System.out.println("3 - Doce de Leite\n");

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Informe o sabor desejado ");

        int escolha = entradaDeDados.nextInt();

        if(escolha == 1){
            System.out.println("Você esolheu a opção " + escolha +" o sabor é Morango");
        }
        else if(escolha == 2){
            System.out.println("Você escolheu a opção " + escolha +" o sabor é Chocolate");
        }
        else if(escolha == 3){
            System.out.println("Você escolheu a opção " + escolha +" o sabor é Doce de leite");
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
        }
        System.out.println(escolha);
        entradaDeDados.close();
    }
}