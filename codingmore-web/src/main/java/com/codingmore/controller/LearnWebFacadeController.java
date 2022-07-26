package com.codingmore.controller;

import com.codingmore.service.ILearnWebRequestStrategy;
import com.codingmore.util.WebRequestParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Author yaCoding
 * @create 2022-07-25 下午 10:50
 */

@Controller
@Api(tags = "学习网站前端入口")
public class LearnWebFacadeController {

    private static Logger LOGGER = LoggerFactory.getLogger(LearnWebFacadeController.class);
    @Resource(name = "channelPageRequestStrategy")
    private ILearnWebRequestStrategy channelPageRequestStrategy;

    @Resource(name = "contentPageRequestStrategy")
    private ILearnWebRequestStrategy contentPageRequestStrategy;

    @Resource(name = "indexPageRequestStrategy")
    private ILearnWebRequestStrategy indexPageRequestStrategy;


    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    @ApiOperation("首页页入口")
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        WebRequestParam webRequestParam = new WebRequestParam.Builder().request(request).response(response).model(model).build();
        return indexPageRequestStrategy.handleRequest(webRequestParam);
    }

}
