package domain.service;

import application.TaskDTO;
import domain.Task;
import port.IDomainTaskService;
import port.ITaskRepository;

import java.util.Date;

public class DomainTaskService implements IDomainTaskService {
    private final ITaskRepository taskRepository;

    public DomainTaskService(ITaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Long createTask(TaskDTO taskDTO){
        Task task = new Task();
        task.setTitle(taskDTO.title);
        task.setDetails(taskDTO.details);
        task.setInclusionDate(new Date());
        task.setDeadLine(taskDTO.deadLine);
        task.setConcluded(taskDTO.isConcluded);

        taskRepository.save(task);

        return task.getId();
    }
}
