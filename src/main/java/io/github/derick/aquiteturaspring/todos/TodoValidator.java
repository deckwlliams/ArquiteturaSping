package io.github.derick.aquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {
    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
if(exiteTodos(todo.getDescricao())){
    throw new IllegalArgumentException("ja existe");
}
    }
    public boolean exiteTodos(String descricao){
        return repository.existsByDescricao(descricao);
    }
}
