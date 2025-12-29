package io.github.derick.aquiteturaspring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }
    public TodoEntity salvar(@RequestBody TodoEntity todo) {
        try{
            return this.service.salvar(todo);
        }
        catch (IllegalArgumentException ex){
            var msg = ex.getMessage();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, msg);
        }


    }
    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        service.atualizarStatus(todo);
    }
    @GetMapping("{id}")
    public TodoEntity buscar(@PathVariable("id")  Integer id){
        return service.buscarPorId(id);
    }
}
