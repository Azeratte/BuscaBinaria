import java.util.ArrayList;

public class GerenciaCliente {
    
    private ArrayList<Cliente> ListaCliente;
    private int contCompara;

    public int getContCompara() {
        return contCompara;
    }

    public GerenciaCliente(){
        ListaCliente = new ArrayList<>();
    }

    public void adicionarCliente(String nome, String sexo, String endereco, String cidade, String email, String telefone, String idade){
        ListaCliente.add(new Cliente(nome, sexo, endereco, cidade, email, telefone, idade));
    }

    public int PesquisaBinaria(String chave) {
        int inicio, fim, meio;
        inicio = 0;
        contCompara = 0;
        meio = 0;
        fim = ListaCliente.size()-1;
        while(inicio <= fim) {
            meio = (inicio + fim)/2;
            contCompara++;
            if(ListaCliente.get(meio).getNome().equals(chave))
                return meio;
            contCompara++;
            if(ListaCliente.get(meio).getNome().compareTo(chave) > 0)
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return -meio;   
    }

    public Cliente retornoCliente(int indice){
        return ListaCliente.get(indice);
    }

}
