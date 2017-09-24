package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.common.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-09-23 17:02
 **/
@RestController
public class UserController {
    @GetMapping(value = "/users")
    public ResponseEntity userlist() {
        List<String> users = new ArrayList<String>() {
            {
                add("freewolf");
                add("tom");
                add("jerry");
            }
        };
        return new ResponseEntity<List>(ResponseEntity.SUCCESS,"用户信息",users);
    }

}
