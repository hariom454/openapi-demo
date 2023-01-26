package com.shashtra.openapidemo.controller.impl;

import com.shashtra.openapidemo.controller.SampleController;
import com.shashtra.openapidemo.controller.request.CreateUserRequest;
import com.shashtra.openapidemo.dto.User;
import java.util.UUID;
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
    //hard code user for testing purpose
    User user = new User();
    user.setUserId(UUID.randomUUID().toString());
    user.setEmailAddress("fake.email@email.test");
    user.setFirstName("fake.name");
    user.setLastName("last.name");
    return List.of(user);
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
