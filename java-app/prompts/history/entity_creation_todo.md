# Creazione Entità Todo

## Obiettivo
Definizione e implementazione dell'entità Todo per la todo app, compreso mapping ORM e versionamento.

## Sequenza Azioni
1. Proposta struttura entità astratta
2. Implementazione mapping JPA
3. Creazione directory structure
4. Scrittura file sorgente
5. Aggiunta TODO per sviluppi futuri
6. Commit delle modifiche

## Decisioni Chiave
- Struttura base Todo con id, title, description, completed, dueDate, timestamps
- Field pubblici senza accessor (da aggiungere in seguito)
- TODO su completed: prevista evoluzione da Boolean a enum (NOT_STARTED, IN_PROGRESS, DONE)

## Codice Prodotto
```java
@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String title;

    @Column(columnDefinition = "TEXT")
    public String description;

    // TODO: sostituire con enum (NOT_STARTED, IN_PROGRESS, DONE) quando necessario
    @Column(nullable = false)
    public Boolean completed = false;

    @Column(name = "due_date")
    public LocalDateTime dueDate;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    public LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public Priority priority = Priority.MEDIUM;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    public Category category;
}
```

## Note Tecniche
- Utilizzo JPA/Hibernate annotations
- Lazy loading per relazione ManyToOne con Category 
- Timestamps gestiti automaticamente con @CreationTimestamp e @UpdateTimestamp