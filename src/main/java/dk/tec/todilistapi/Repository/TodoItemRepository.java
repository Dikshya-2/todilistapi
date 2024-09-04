package dk.tec.todilistapi.Repository;

import dk.tec.todilistapi.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {
}

