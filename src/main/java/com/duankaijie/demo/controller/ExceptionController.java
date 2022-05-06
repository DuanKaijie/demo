package com.duankaijie.demo.controller;

import com.duankaijie.demo.entity.JsonResult;
import com.duankaijie.demo.exception.BusinessErrorException;
import com.duankaijie.demo.exception.BusinessMsgEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping("/null/point/exception")
    public JsonResult testNullPointException() {
        String str = null;
        str.length();
        return new JsonResult();
    }

    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,
                       @RequestParam("pass") String pass) {

        logger.info("name：{}", name);
        logger.info("pass：{}", pass);
        return new JsonResult();
    }

    @GetMapping("/business")
    public JsonResult testException() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new BusinessErrorException(BusinessMsgEnum.PARMETER_BIG_EXCEPTION);
        }
        return new JsonResult();
    }
}
