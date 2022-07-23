package com.shashtra.openapidemo.error;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
public enum Errors {
  USER_NOT_FOUND("User not found"),
  BAD_REQUEST("Bad request"),
  NOT_AUTHORIZED("User is not authorized.");

  private final String text;

  Errors(String text) {
    this.text = text;
  }
}
