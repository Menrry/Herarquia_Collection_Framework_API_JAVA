import java.util.ArrayList;
import java.util.List;

public class ListaTarefa{

    private List<Tarefa> tarefaList;

    //Constructor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
//********************************  Adiciona uma nova tarefa à lista com a descrição fornecida.  ******************************/
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
      }
//********************************  Remove uma tarefa da lista com base em sua descrição.  ******************************/
      public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
          for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefasParaRemover.add(t);
            }
          }
          tarefaList.removeAll(tarefasParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
//********************************  Retorna o número total de tarefas na lista.  ******************************/
      public int obterNumeroTotalTarefas() {
        return tarefaList.size();
      }
//********************************  Retorna uma lista contendo a descrição de todas as tarefas na lista. ******************************/
      public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
          System.out.println(tarefaList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
//-----------------------------------------------------------

      public static void main(String[] args) {
    
    
// Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

// Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

// Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

// Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

// Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");

// Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

// Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

// Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");

// Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();
    }
}