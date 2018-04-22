package com.kpfu.pm.coffeehouse.controller;


import com.kpfu.pm.coffeehouse.service.UserService;
import com.kpfu.pm.coffeehouse.util.ApiResponse;
import com.kpfu.pm.coffeehouse.util.ResponseCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  extends ResponseCreator {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> createUser(@RequestBody UserDto appUserDto) {
        try {
            userService.createUser(appUserDto);
        } catch (Exception e) {
            return createBadResponse(e.getMessage());
        }
        return createGoodResponse();
    }


}
