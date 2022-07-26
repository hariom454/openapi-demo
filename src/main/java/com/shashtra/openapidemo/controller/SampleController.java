package com.shashtra.openapidemo.controller;

import com.shashtra.openapidemo.controller.request.CreateUserRequest;
import com.shashtra.openapidemo.dto.User;
import com.shashtra.openapidemo.error.ErrorResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***************
 **  author: Hariom
 **  since: 23/07/22
 *****************/
@OpenAPIDefinition(
    info =
        @Info(
            title = "Sample application for openapi specs.",
            description = "This document contains REST endpoint related to opeanpai spec tutorial.",
            version = "1.0.0",
            termsOfService = "https://www.sample.shashtra.com/terms",
            contact =
                @Contact(
                    name = "Sample app support",
                    email = "dev-support@shashtra.com",
                    url = "https://sample.dev-support.shashtra.com")),
    externalDocs =
        @ExternalDocumentation(
            description = "This doc contains more information related to these apis.",
            url = "https://github.com/hariom454/openapi-demo/blob/master/README.md"),
    servers = {
      @Server(url = "http://localhost:8080", description = "Local"),
      @Server(url = "https://dev-sample-app.shashtra.com/v1", description = "Dev")
    })
@Tag(name = "Sample APIs", description = "This collection is for sample apis for openapi tutorial.")
@SecurityRequirement(name = "requestAuth")
@SecurityScheme(
    type = SecuritySchemeType.APIKEY,
    name = "requestAuth",
    in = SecuritySchemeIn.HEADER,
    paramName = "Authorization")
public interface SampleController {

  @Operation(description = "Get All user details.")
  @ApiResponses(
      value = {
        @ApiResponse(
            description = "Request succeeded.",
            responseCode = "200",
            content =
                @Content(
                    mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = User.class)))),
        @ApiResponse(
            description = "Bad Request.",
            responseCode = "400",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ErrorResponse.class)))
      })
  @GetMapping(value = "/users")
  List<User> getAllUserDetails();

  @GetMapping(value = "/users/{userId}")
  User getUserDetails(
      @Parameter(description = "userId to get user details.") @PathVariable(value = "userId")
          String userId);

  @GetMapping(value = "/user/search")
  User searchUser(@Parameter(description = "user email id.") @RequestParam String emailId);

  @PostMapping(value = "/users")
  User createUser(@RequestBody CreateUserRequest createUserRequest);
}
