package com.home.lingvo.infrastructure.presenter;

import com.home.lingvo.core.exception.WordException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LingvoExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {WordException.class})
    protected ResponseEntity<Object> handleError(Exception ex, WebRequest request) {

        ex.printStackTrace();

        ApiResponse<String> response = new ApiResponse<>(404, ex.getMessage(), "");
        return handleExceptionInternal(ex, response,
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
