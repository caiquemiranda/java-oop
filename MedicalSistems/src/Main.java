import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CadastroPacientes paciente = new CadastroPacientes();
        paciente.setNome("João Silva");
        paciente.setEndereco("Rua Exemplo, 123");
        paciente.setCpf("123.456.789-00");
        paciente.setTelefone("(11) 98765-4321");
        paciente.setEmail("joao.silva@example.com");
        paciente.setDataNascimento(LocalDate.of(1990, 5, 15));
        paciente.setProfissao("Engenheiro");
        paciente.setPlanoDeSaude("Plano X");

        paciente.salvarComoJson("paciente.json");
    }
}
