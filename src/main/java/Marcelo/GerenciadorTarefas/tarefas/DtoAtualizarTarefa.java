package Marcelo.GerenciadorTarefas.tarefas;

public record DtoAtualizarTarefa(
        long id,
        String descricao,
        boolean completa
) {
}
