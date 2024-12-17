package com.checkout.payment.gateway.exception;

import com.checkout.payment.gateway.model.ErrorResponse;
import com.checkout.payment.gateway.utility.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

  private static final Logger LOG = LoggerFactory.getLogger(CommonExceptionHandler.class);

  @ExceptionHandler(EventProcessingException.class)
  public ResponseEntity<Object> handleException(EventProcessingException ex) {
    LOG.error("Exception happened", ex);
    ApiResponse apiResponse = new ApiResponse("Page not found", null,HttpStatus.NOT_FOUND.value());
    return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
  }
}
