package danil.tiv.task.tracker.factories;

import danil.tiv.task.tracker.api.dto.TaskDto;
import danil.tiv.task.tracker.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity){

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createAt(entity.getCreateAt())
                .description(entity.getDescription())
                .build();
    }
}
