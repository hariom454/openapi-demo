package com.shashtra.openapidemo.controller.request;

import lombok.Data;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@Data
public class Userdata {
  private String firstName;
  private String lastName;

  private String emailAddress;
}
