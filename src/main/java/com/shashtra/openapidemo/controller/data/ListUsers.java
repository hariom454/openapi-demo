package com.shashtra.openapidemo.controller.data;

import lombok.Data;

import java.util.List;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@Data
public class ListUsers {
    List<GetUserResponse> users;
}
