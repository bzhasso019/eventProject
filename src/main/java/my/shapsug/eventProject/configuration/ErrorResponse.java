package my.shapsug.eventProject.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {

    public ErrorResponse(String message) {
        this.localDateTime = LocalDateTime.now();
        this.message = message;
    }

    private String message;
    private LocalDateTime localDateTime;
}
