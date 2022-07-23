package com.shashtra.openapidemo.controller.impl;

import com.shashtra.openapidemo.controller.SampleController;
import com.shashtra.openapidemo.controller.data.CreateUserResponse;
import com.shashtra.openapidemo.controller.data.GetUserResponse;
import com.shashtra.openapidemo.controller.request.Userdata;
import org.springframework.web.bind.annotation.RestController;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@RestController
public class SampleControllerImpl implements SampleController {
  // TODO: implement methods to get sample data
  @Override
  public GetUserResponse getAllUserDetails() {
    return null;
  }

  @Override
  public GetUserResponse getUserDetails(String userId) {
    return null;
  }

  @Override
  public GetUserResponse searchUser(String emailId) {
    return null;
  }

  @Override
  public CreateUserResponse createUser(Userdata createUserRequest) {
    return null;
  }
}
