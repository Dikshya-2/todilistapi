package dk.tec.todilistapi.Controller;

import dk.tec.todilistapi.Repository.TodoItemRepository;
import dk.tec.todilistapi.TodoItem;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoitem")
public class TodoItemController {
    TodoItemRepository repository;

    TodoItemController(TodoItemRepository repository) {
        this.repository = repository;
    }

    //    @PostMapping("/create")
//    void create(@RequestBody TodoItem todoItem){
//        repository.save(TodoItem);
//    }
    @PostMapping()
    void create(@RequestBody TodoItem todoItem) {
        repository.save(todoItem);
    }

    @GetMapping("/{id}")
    TodoItem read(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @GetMapping()
    List<TodoItem> getAll() {
        return repository.findAll();
    }

    @PutMapping()
    void update(@RequestBody TodoItem todoItem) {
        repository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
