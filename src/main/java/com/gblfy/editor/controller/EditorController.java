package com.gblfy.editor.controller;

import com.gblfy.editor.entity.Editor;
import com.gblfy.editor.entity.Result;
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
        log.info(editor.toString());
        editorService.save(editor);
        return ResultUtil.success();
    }

    /**
     * 根据主键id预览博文
     *
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/preview/{id}")
    public ModelAndView preview(@PathVariable(value = "id") long id, Map map) {

        Editor editor = editorService.findOne(id);

        map.put("editor", editor);
        return new ModelAndView("preview", map);
    }

    /**
     * 根据主键id编辑博文
     *
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(value = "id") long id, Map map) {

        Editor editor = editorService.findOne(id);

        map.put("editor", editor);
        return new ModelAndView("index", map);
    }
}
