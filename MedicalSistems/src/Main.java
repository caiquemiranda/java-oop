import cadastro.CadastroPacientes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de pacientes
        List<CadastroPacientes> listaPacientes = new ArrayList<>();

        // Criando alguns pacientes e adicionando à lista
        CadastroPacientes paciente1 = new CadastroPacientes();
        paciente1.setNome("João Silva");
        paciente1.setEndereco("Rua Exemplo, 123");
        paciente1.setCpf("123.456.789-00");
        paciente1.setTelefone("(11) 98765-4321");
        paciente1.setEmail("joao.silva@example.com");
        paciente1.setDataNascimento(LocalDate.of(1990, 5, 15));
        paciente1.setProfissao("Engenheiro");
        paciente1.setPlanoDeSaude("Plano X");

        CadastroPacientes paciente2 = new CadastroPacientes();
        paciente2.setNome("Maria Souza");
        paciente2.setEndereco("Rua Outro Exemplo, 456");
        paciente2.setCpf("987.654.321-00");
        paciente2.setTelefone("(11) 99999-8888");
        paciente2.setEmail("maria.souza@example.com");
        paciente2.setDataNascimento(LocalDate.of(1985, 3, 10));
        paciente2.setProfissao("Professora");
        paciente2.setPlanoDeSaude("Plano Y");

        // Adicionando os pacientes à lista
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);

        // Salvando a lista de pacientes como JSON
        salvarListaComoJson(listaPacientes, "src/dadosPacientes/lista_pacientes_manual.json");
    }

    // Método para salvar a lista de pacientes em JSON manualmente
    public static void salvarListaComoJson(List<CadastroPacientes> lista, String caminhoArquivo) {
        StringBuilder json = new StringBuilder();
        json.append("[\n");
        for (int i = 0; i < lista.size(); i++) {
            CadastroPacientes paciente = lista.get(i);
            json.append(paciente.toJson());
            if (i < lista.size() - 1) {
                json.append(",\n"); 
            }
        }
        json.append("\n]");

        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            writer.write(json.toString());
            System.out.println("Lista de pacientes salva em " + caminhoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
