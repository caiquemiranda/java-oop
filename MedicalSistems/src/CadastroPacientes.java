import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    public CadastroPacientes() {}

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

    // Método para converter o objeto em uma String JSON manualmente
    public String toJson() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"nome\": \"").append(nome).append("\",\n");
        json.append("  \"endereco\": \"").append(endereco).append("\",\n");
        json.append("  \"cpf\": \"").append(cpf).append("\",\n");
        json.append("  \"telefone\": \"").append(telefone).append("\",\n");
        json.append("  \"email\": \"").append(email).append("\",\n");
        json.append("  \"dataNascimento\": \"").append(dataNascimento != null ? dataNascimento.format(formatter) : null).append("\",\n");
        json.append("  \"profissao\": \"").append(profissao).append("\",\n");
        json.append("  \"planoDeSaude\": \"").append(planoDeSaude).append("\"\n");
        json.append("}");
        return json.toString();
    }

    // Método para salvar o JSON em um arquivo
    public void salvarComoJson(String caminhoArquivo) {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            writer.write(this.toJson());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
