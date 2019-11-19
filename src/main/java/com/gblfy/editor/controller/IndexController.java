package com.gblfy.editor.controller;

import com.gblfy.editor.domain.Editor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author gblfy
 * @Description 跳转主页 路由效果
 * @Date 2019/11/19 17:26
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(Map map) {
        ModelAndView mav = new ModelAndView();

        map.put("editor", new Editor());
        return new ModelAndView("index", map);
    }
}
