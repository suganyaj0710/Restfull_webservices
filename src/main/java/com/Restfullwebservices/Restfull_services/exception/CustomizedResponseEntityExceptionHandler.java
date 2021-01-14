package com.Restfullwebservices.Restfull_services.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice shares the controller across multiple controller
@ControllerAdvice
@RestController
class customizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
}
