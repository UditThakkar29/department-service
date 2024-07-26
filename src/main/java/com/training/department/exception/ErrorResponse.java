package com.training.department.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {

  private HttpStatus status;
  private String message;

  public ErrorResponse(HttpStatus httpStatus, String message) {
    this.status = httpStatus;
    this.message = message;
  }

  public HttpStatus getStatus() {
    return status;
  }

  public void setStatus(HttpStatus status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
