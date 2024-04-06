import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        //Entrada
        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Texto
        System.out.print("Informe seu nome: ");
        String nome = scanner.next();
        
        //Caractere
        System.out.print("Escolha uma cor: ( A - Azul - B - Amarelo - C - Verde): ");
        char cor = scanner.next().charAt(0);
        
        //Números
        System.out.print("\n Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();

        //Processamento
        nome = nome.toUpperCase();

        //Saida
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(cor);

        scanner.close();
    }
    

}
