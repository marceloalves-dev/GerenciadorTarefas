package Marcelo.GerenciadorTarefas.Repository;

import Marcelo.GerenciadorTarefas.tarefas.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
