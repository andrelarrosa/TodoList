package port;

import application.TaskDTO;

public interface ITaskController {

    public Long insert(TaskDTO taskDTO);
}
