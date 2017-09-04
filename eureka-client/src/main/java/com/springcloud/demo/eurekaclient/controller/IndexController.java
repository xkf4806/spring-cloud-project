package com.springcloud.demo.eurekaclient.controller;

import com.springcloud.demo.eurekaclient.vo.PersonVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @RequestMapping(value = "/consume",method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PersonVO consume(@RequestBody @Valid PersonVO personVO, BindingResult result) throws Exception {
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            StringBuilder sb = new StringBuilder();
            for (ObjectError error : allErrors) {
                sb.append(error.getDefaultMessage()).append(",");
            }
            personVO.setErrMsg(sb.substring(0,sb.lastIndexOf(",")));
        }

        return personVO;
    }

    @PostMapping(value = "/dealParam")
    public String dealParam(@RequestParam("param") String param, @RequestBody @Valid PersonVO vo,BindingResult result) {
        if (result.hasErrors()) {
            return "参数不合法！";
        }
        System.out.println(param + "..." + vo);
        return "Hello:" + param;
    }
}
