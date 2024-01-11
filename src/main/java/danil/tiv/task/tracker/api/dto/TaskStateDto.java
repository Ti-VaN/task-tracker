package danil.tiv.task.tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskStateDto {

    @NotNull
    Long id;

    @NotNull
    String name;

    @NotNull
    Long ordinal;

    @NotNull
    @JsonProperty("created_at")
    Instant createAt;
}
