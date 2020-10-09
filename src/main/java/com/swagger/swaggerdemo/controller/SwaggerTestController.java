package com.swagger.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: test
 * @description:
 * @author: wlg
 * @create: 2020-10-09 21:38:41
 **/
@Api(value = "SwaggerTestController",description = "Swagger")
@RequestMapping("/test")
@RestController
public class SwaggerTestController {
    @ApiOperation(value = "Swagger2入门")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "name",value = "这是一个参数",required = true,paramType = "query")
    )
    @RequestMapping(value = "/helloSwagger2", method = RequestMethod.GET)
    public Object helloSwagger2(@RequestParam String name){
        Map map = new HashMap();
        map.put("hello",name);
        return map;
    }
}
