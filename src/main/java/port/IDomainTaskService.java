package port;

import application.TaskDTO;
import domain.Task;

public interface IDomainTaskService {
    public Long createTask(TaskDTO taskDTO);
}
