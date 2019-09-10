package com.tongfang.web;

import com.google.common.collect.Lists;
import com.tongfang.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author itguang
 * @create 2018-01-05 8:23
 **/
@RestController
@Slf4j
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        List list = userMapper.test();
        System.out.println(list);
        log.info("打印："+list);
        return "success";
    }

}
