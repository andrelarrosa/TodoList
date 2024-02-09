package application;

import domain.types.Details;
import domain.types.Title;

import java.util.Date;

public class TaskDTO {
    public Title title;
    public Details details;
    public Date deadLine;
    public Date inclusionDate;
    public boolean isConcluded;
}
