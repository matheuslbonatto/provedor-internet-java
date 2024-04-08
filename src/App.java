import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    String nome_provedor = "Fenda do Biquini";
    String nome_atendente = "Bob Esponja";
    String nome_usuario; 
    String duvida_usuario;       
        
        System.out.printf("\nOlá, bem-vindo a central de atendimento \"%s\"." , nome_provedor);

        System.out.printf("\nMeu nome é %s, sou seu assistente virtual." , nome_atendente);

        System.out.print("\nDurante o atendimento siga minhas instruções");

        System.out.printf("\nPrimeiramente informe seu primeiro nome: ");
        nome_usuario = scanner.nextLine();
        
        System.out.printf("\nOlá %s, como posso lhe ajudar? ", nome_usuario);
        duvida_usuario = scanner.nextLine();

        // Também é possivel realizar o mesmo processo com texto concatenado, segue abaixo
        //System.out.println("Sua resposta foi: " + duvida_usuario);
        
        System.out.printf("\nUsuario: %s",nome_usuario);
        System.out.printf("\nDuvida: %s", duvida_usuario);
        
        scanner.close();

    }
}
