package it.lamemind.todoapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(columnDefinition = "TEXT")
    public String description;

    @Column(length = 7)  // Format: #RRGGBB
    public String color;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    public LocalDateTime createdAt;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    public List<Todo> todos;
}
