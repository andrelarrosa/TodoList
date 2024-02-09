package domain;

import domain.types.Details;
import domain.types.Title;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="TASK")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private Title title;
    @Column(name = "details")
    private Details details;
    @Column(name = "deadLine")
    private Date deadLine;
    @Column(name = "inclusionDate")
    private Date inclusionDate;
    @Column(name = "isConcluded")
    private boolean isConcluded;

    public Task(){
        this.isConcluded = false;
    }


}
