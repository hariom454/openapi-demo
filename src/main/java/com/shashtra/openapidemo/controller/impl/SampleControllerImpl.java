package com.shashtra.openapidemo.controller.impl;

import com.shashtra.openapidemo.controller.SampleController;
import com.shashtra.openapidemo.controller.request.CreateUserRequest;
import com.shashtra.openapidemo.dto.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@RestController
public class SampleControllerImpl implements SampleController {
  // TODO: implement methods to get sample data
  @Override
  public List<User> getAllUserDetails() {
    return null;
  }

  @Override
  public User getUserDetails(String userId) {
    return null;
  }

  @Override
  public User searchUser(String emailId) {
    return null;
  }

  @Override
  public User createUser(CreateUserRequest createUserRequest) {
    return null;
  }
}
