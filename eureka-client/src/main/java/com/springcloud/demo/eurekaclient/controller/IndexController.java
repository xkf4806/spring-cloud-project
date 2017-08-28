package com.springcloud.demo.eurekaclient.controller;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.springcloud.demo.eurekaclient.vo.PersonVO;
import com.thoughtworks.xstream.io.json.JsonWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.JsonJsonParser;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

/**
 * @author xinj.xue
 * @description：IndexController
 * @date 2017-08-28 11:59
 **/
@RestController
public class IndexController {
    @Value("${foo}") // 注意$的使用 来自远方的问候：
    private String value;

    @GetMapping("/foo")
    public String index() {
        return "来自远方的问候：" + value;
    }

    @RequestMapping(value = "/consume",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String consume(@RequestBody @Valid PersonVO personVO, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            StringBuilder sb = new StringBuilder();
            for (ObjectError error : allErrors) {
                sb.append(error.getDefaultMessage());
            }
            return sb.toString();
        }
        return "您好~~";
    }
}
