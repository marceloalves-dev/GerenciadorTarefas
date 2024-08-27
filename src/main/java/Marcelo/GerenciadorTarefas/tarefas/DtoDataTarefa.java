package Marcelo.GerenciadorTarefas.tarefas;

public record DtoDataTarefa(
        Long id,
        String descricao,
        boolean completa
        ) {

    public DtoDataTarefa(Tarefa tarefa){
        this(tarefa.getId(),tarefa.getDescricao(),tarefa.isCompleta());
    }
}
