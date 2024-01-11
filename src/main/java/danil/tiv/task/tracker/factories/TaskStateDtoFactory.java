package danil.tiv.task.tracker.factories;

import danil.tiv.task.tracker.api.dto.TaskStateDto;
import danil.tiv.task.tracker.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return  TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createAt(entity.getCreateAt())
                .ordinal(entity.getOrdinal())
                .build();
    }
}
