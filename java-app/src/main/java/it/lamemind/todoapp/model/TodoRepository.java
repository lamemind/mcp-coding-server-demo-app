package it.lamemind.todoapp.model;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class TodoRepository implements PanacheRepository<Todo> {
    public List<Todo> findByCategory(Category category) {
        return list("category", category);
    }

    public List<Todo> findByCompleted(boolean completed) {
        return list("completed", completed);
    }

    public List<Todo> findByPriority(Priority priority) {
        return list("priority", priority);
    }

    public List<Todo> findOverdue() {
        return list("dueDate < CURRENT_TIMESTAMP and completed = false");
    }
}