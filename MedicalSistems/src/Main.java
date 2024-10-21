import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe CadastroPacientes
        CadastroPacientes paciente = new CadastroPacientes();

        // Definindo os valores dos atributos
        paciente.setNome("João Silva");
        paciente.setEndereco("Rua Exemplo, 123");
        paciente.setCpf("123.456.789-00");
        paciente.setTelefone("(11) 98765-4321");
        paciente.setEmail("joao.silva@example.com");
        paciente.setDataNascimento(LocalDate.of(1990, 5, 15)); // Definindo a data de nascimento
        paciente.setProfissao("Engenheiro");
        paciente.setPlanoDeSaude("Plano X");

        // Salvando o objeto como JSON em um arquivo
        paciente.salvarComoJson("paciente_manual.json");

        System.out.println("Dados do paciente salvos em paciente_manual.json");
    }
}
