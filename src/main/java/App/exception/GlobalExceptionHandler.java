package App.exception;

import App.dto.ErrorResp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResp> handleValidationException(MethodArgumentNotValidException e, WebRequest webRequest){
        String errMsg = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .toList()
                .toString();

        ErrorResp errorDetail = ErrorResp.builder()
                .path(webRequest.getDescription(false))
                .timestamp(LocalDateTime.now())
                .errorCode("INVALID_JSON")
                .message(errMsg)
                .build();

        return new ResponseEntity<>(errorDetail, HttpStatus.BAD_REQUEST);
    }
}
