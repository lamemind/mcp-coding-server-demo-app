package it.lamemind.todoapp.model;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoryRepository implements PanacheRepository<Category> {
    public Category findByName(String name) {
        return find("name", name).firstResult();
    }
}