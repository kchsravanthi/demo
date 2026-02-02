import jakarta.persistence.*;

@Entity
public class EmpDemo {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attachment_id") // Specifies the foreign key column in the 'Message' table
    private Attachment attachment;

    // Getters, setters, and other fields
}

@Entity
public class Attachment {
    @Id
    @GeneratedValue
    private Long id;

    private String filePath;

    // Getters, setters, and other fields
}