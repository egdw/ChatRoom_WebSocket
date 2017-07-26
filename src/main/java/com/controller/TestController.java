package com.controller;

import com.alibaba.fastjson.JSON;
import com.data.Constant;
import com.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hdy on 2017/7/25.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/size", produces = "text/json;charset=UTF-8")
    public String getSize() {
        Message message = new Message(200, Constant.getSessionSize() + "", "尊贵的服务器", "everyOne", "null");
        return JSON.toJSONString(message);
    }

}
