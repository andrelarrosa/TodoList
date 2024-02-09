package port;

import domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITaskRepository extends JpaRepository<Task, Long> {
}
