public class Cliente {
    private String nome, sexo, endereco, cidade, email, telefone, idade;

    public Cliente (String nome, String sexo, String endereco, String cidade, String email, String telefone, String idade){
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        
        return getNome()+" - "+ getSexo()+" - "+getEndereco()+" - "+getCidade()+" - "+getEmail()+" - "+getTelefone()+" - "+getIdade();
    }
}
