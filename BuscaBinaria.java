import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class BuscaBinaria {
    public static void main(String[] args) {
        try {
            File file = new File("arquivoDados.csv");
            Scanner scanner = new Scanner(file);

            GerenciaCliente Gerencia = new GerenciaCliente();

            
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                

                String[] partes = linha.split(","); 
                
                Gerencia.adicionarCliente(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6] );

            }

            
           Scanner entrada = new Scanner (System.in);

            int indice;

            String teste = "";

            while(!teste.equals("exit")){

                System.out.println("Digite o nome do cliente a ser pesquisado ou exit para encerrar o programa.");

                teste = entrada.nextLine();

                if(!teste.equals("exit")){
                    indice = Gerencia.PesquisaBinaria(teste);
                    if(indice > - 1) {
                        System.out.println("\n"+Gerencia.retornoCliente(indice));
                        System.out.println("Número de comparações: "+Gerencia.getContCompara()+"\n");
                    } else {
                        System.out.println("\nNome não encontrado!");
                        System.out.println("Número de comparações: "+Gerencia.getContCompara()+"\n");
                    }
                }

            }


            scanner.close();
            entrada.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
