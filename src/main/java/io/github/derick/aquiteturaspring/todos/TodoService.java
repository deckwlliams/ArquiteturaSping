package io.github.derick.aquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public TodoRepository repository;
    private TodoValidator validator;
    private MainSender mainSender;

    public TodoService(TodoRepository todoRepository, TodoValidator validator, MainSender mainSender) {
        this.repository = todoRepository;
        this.validator = validator;
        this.mainSender = mainSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "concluido" : "não comcluido";
        mainSender.enviar("Todo de codigo" + todo.getDescricao() + " atualizado com sucesso!" + status);
    }
    public TodoEntity buscarPorId(Integer id){
         return repository.findById(id).orElse(null);
    }
}
