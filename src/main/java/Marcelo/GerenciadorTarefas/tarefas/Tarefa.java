package Marcelo.GerenciadorTarefas.tarefas;

import jakarta.persistence.*;

@Table(name = "tarefa")
@Entity(name = "tarefa")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descricao;
    private boolean completa;

    public Tarefa(DtoBody dtoBody) {
        this.descricao = dtoBody.descricao();
        this.completa = false;
    }
    public Tarefa() {
    }

    public void update() {
        this.completa = true;
    }


    // --------------------------------- get ---------------------------------
    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleta() {
        return completa;
    }


}
