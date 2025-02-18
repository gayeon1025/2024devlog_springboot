package com.com.cnu.devlog_springboot.exception;

import com.com.cnu.devlog_springboot.model.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DevlogException.class)
    public ResponseEntity<ErrorResponse> handleDevlogException(HttpServletRequest request, DevlogException e) {
        return ResponseEntity.status(e.getErrorCode().getHttpStatus())
                .body(
                        new ErrorResponse(
                                e.getErrorCode().getDescription(),
                                e.getErrorCode().getHttpStatus().value(),
                                request.getRequestURI()
                        )
                );
    }
}
