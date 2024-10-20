import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroPacientes {

    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    private String profissao;
    private String planoDeSaude;

    // Construtor vazio
    public CadastroPacientes() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    // Método para converter o objeto em JSON e salvar em arquivo
    public void salvarComoJson(String caminhoArquivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // Formata o JSON para facilitar a leitura
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            gson.toJson(this, writer); // Serializa o objeto e salva no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
