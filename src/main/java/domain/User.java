package domain;

import domain.types.Name;
import domain.types.Password;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private Name name;
    @Column(name = "username")
    private Name username;
    @Column(name = "password")
    private Password password;
}
