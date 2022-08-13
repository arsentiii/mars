package com.mars.demo.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.mars.demo.app.rto.ReturnData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author wangyuhan
* @version 1.0
* @date 2022/08/13 12:24:31
* @desc
*/

@Slf4j
@RestController
@RequestMapping("/demo")
public class sample {

    @GetMapping("/sample")
    public ReturnData getSample() {
        String msg = "testMsg. springboot run suc.";
        JSONObject data = new JSONObject();
        data.put("jsonKey1", 1);
        data.put("jsonKey2", "hello,world".split(","));
        ReturnData ret = ReturnData.newCorrectData(data);
        ret.setMsg(msg);
        return ret;
    }
}
