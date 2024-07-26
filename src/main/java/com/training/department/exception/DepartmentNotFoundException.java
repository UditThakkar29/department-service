package com.training.department.exception;

public class DepartmentNotFoundException extends RuntimeException {

  public static final long serialVersionUID = 1L;

  public DepartmentNotFoundException() {
  }

  public DepartmentNotFoundException(String message) {
    super(message);
  }

  public DepartmentNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public DepartmentNotFoundException(Throwable cause) {
    super(cause);
  }

  public DepartmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
