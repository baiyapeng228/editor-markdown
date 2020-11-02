package com.gblfy.editor.controller;

import com.gblfy.editor.domain.Editor;
import com.gblfy.editor.domain.Result;
import com.gblfy.editor.service.EditorService;
import com.gblfy.editor.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author gblfy
 * @Description 博文预览编辑管理
 * @Date 2019/11/19 17:26
 */
@Controller
@RequestMapping("/editorWeb")
@Slf4j
public class EditorController {

    @Autowired
    private EditorService editorService;

    @PostMapping
    @ResponseBody
    public Result saveEditor(Editor editor) {
        editorService.save(editor);
        return ResultUtil.success();
    }

    /**
     * 预览
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/preview/{id}")
    public ModelAndView preview(@PathVariable(value = "id") int id, Map map) {

        Editor editor = editorService.findOne(id);

        map.put("editor", editor);
        return new ModelAndView("preview", map);
    }

    /**
     * 编辑
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(value = "id") int id, Map map) {

        Editor editor = editorService.findOne(id);

        map.put("editor", editor);
        return new ModelAndView("index", map);
    }
}
