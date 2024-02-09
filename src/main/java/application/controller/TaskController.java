package application.controller;

import application.TaskDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import port.IDomainTaskService;
import port.ITaskController;

@RestController
@RequestMapping("/task")
public class TaskController implements ITaskController {

    private IDomainTaskService taskService;
    @Override
    public Long insert(TaskDTO taskDTO) {
        return taskService.createTask(taskDTO);
    }
}
