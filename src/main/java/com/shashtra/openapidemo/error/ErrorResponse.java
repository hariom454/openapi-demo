package com.shashtra.openapidemo.error;

import lombok.Data;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@Data
public class ErrorResponse {
  private String code;
  private String message;
}
