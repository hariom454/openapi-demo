package com.shashtra.openapidemo.controller.data;

import com.shashtra.openapidemo.controller.request.Userdata;
import lombok.Data;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@Data
public class GetUserResponse extends Userdata {
  private String userId;
}
