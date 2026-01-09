import java.util.ArrayList;

public class Cadastro {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa p : pessoas) {
                System.out.println("Nome: " + p.getNome() +
                                   " | Idade: " + p.getIdade());
            }
        }
    }

    public boolean removerPorNome(String nome) {
        nome = nome.trim();

        for (Pessoa p : pessoas) {
            if (p.getNome().trim().equalsIgnoreCase(nome)) {
                pessoas.remove(p);
                return true;
            }
        }
        return false;
    
          
        
       
    }
}
