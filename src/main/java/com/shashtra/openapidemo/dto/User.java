package com.shashtra.openapidemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/***************
 **  author: Hariom
 **  since: 29/07/22
 *****************/
@Data
public class User {
  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private String userId;

  private String firstName;
  private String lastName;

  private String emailAddress;
}
