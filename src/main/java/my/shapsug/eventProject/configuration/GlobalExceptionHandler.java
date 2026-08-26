package my.shapsug.eventProject.configuration;

import my.shapsug.eventProject.event.EventException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EventException.class)
    public ResponseEntity<ErrorResponse> eventTrouble(EventException eventException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ErrorResponse(eventException.getMessage()));
    }

}
